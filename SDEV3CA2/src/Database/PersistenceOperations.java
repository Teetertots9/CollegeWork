/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.util.Calendar;
import java.util.List;
import javax.persistence.*;
import Classes.*;


public class PersistenceOperations {
    
    EntityManagerFactory emf;
    EntityManager em;
    
    public PersistenceOperations(){
        emf = Persistence.createEntityManagerFactory("SDEV3CA2PUCOLLEGE");
        em = emf.createEntityManager();
        
        //emf = Persistence.createEntityManagerFactory("SDEV3CA2PUHOME");
        //em = emf.createEntityManager();
        
    }
    
    
    public void showAllManagers(){
        em.getTransaction().begin();
        
        TypedQuery<Manager> query
                = em.createQuery("Manager.findAll", Manager.class);
        List<Manager> results = query.getResultList();
        
        for (Manager m : results) {
            System.out.println(m);
        }
        em.getTransaction().commit();
    }
    
    public void showAllEmployees(int mid){
        
        em.getTransaction().begin();
        
        List<Employee> results 
                = this.em.createNativeQuery("SELECT * FROM Employee WHERE mid = ?").setParameter(1, mid).getResultList();
        
        results.stream().forEach((Employee) -> {
            int id = Employee[0];
        })
        em.getTransaction().commit();
    }
    
    public void showAllCustomers() {
        em.getTransaction().begin();
        
        TypedQuery<Customer> query
                = em.createQuery("SELECT c FROM Customer c ORDER BY c.custNum",
                        Customer.class);
        List<Customer> results = query.getResultList();
        
        for (Customer c : results) {
            System.out.println(c);
        }
        em.getTransaction().commit();
    }
    
    public void showAllPT(){
        em.getTransaction().begin();
        TypedQuery<PartTimeEmployee> query
                = em.createQuery("SELECT pt FROM PartTimeEmployee pt order by pt.empId",
                        PartTimeEmployee.class);
        List<PartTimeEmployee> results = query.getResultList();
        for(PartTimeEmployee pt : results){
            System.out.println(pt);
        }
        
        em.getTransaction().commit();
    }
    
    public void showAllFT(){
        em.getTransaction().begin();
        TypedQuery<FullTimeEmployee> query
                = em.createQuery("SELECT ft FROM FullTimeEmployee ft order by ft.empId",
                        FullTimeEmployee.class);
        List<FullTimeEmployee> results = query.getResultList();
        for(FullTimeEmployee ft : results){
            System.out.println(ft);
        }
        
        em.getTransaction().commit();
    }
    
    public Manager findManager(int id) {
        Manager m = em.find(Manager.class, id);
        if (m == null) {
            System.out.println("Not Found");
        }
        return m;
    }
    public Employee findEmployee(int id){
        Employee d = em.find(Employee.class, id);
        if (d == null) {
            System.out.println("Not found");
        }
        return d;
    }
    
    public void deleteEmployee(int empid,int mid){
        Manager m  = em.find(Manager.class, mid);
        Employee e = em.find(Employee.class, empid);
        em.getTransaction().begin();
        em.remove(e);
        m.getElist().remove(e);
        em.getTransaction().commit();
    }
    
    public void deleteManager(int mid){
        Manager m = em.find(Manager.class, mid);
        em.getTransaction().begin();
        em.remove(m);
        em.getTransaction().commit();
        System.out.println("Manager Deleted");
    }
    
    public void deleteCustomer(int cid, int empid){     
        Customer c = em.find(Customer.class, cid);
        Employee e = em.find(Employee.class, empid);
        em.getTransaction().begin();
        em.remove(c);
        e.getClist().remove(c);
        em.getTransaction().commit();
    
    }
    
    public void addManager(String name, double salary) {
        em.getTransaction().begin();
        Manager m1 = new Manager(name,salary);
        em.persist(m1);
        em.getTransaction().commit();
        
    }
    public void addFTEmployee(String name, Calendar sdate, double salary, Manager m) {
        em.getTransaction().begin();
        FullTimeEmployee ft1 = new FullTimeEmployee(name, sdate, salary);
        m.addEmployee(ft1);
        em.persist(ft1);
        em.getTransaction().commit();
    }
    public void addPTEmployee(String name, Calendar sdate, double hours, double rate, Manager m) {
        em.getTransaction().begin();
        PartTimeEmployee pt1 = new PartTimeEmployee(name, sdate, hours, rate);
        m.addEmployee(pt1);
        em.persist(pt1);
        em.getTransaction().commit();
    }
    
    
    public void addCustomer(Employee e, Customer c) {
        em.getTransaction().begin();
        e.addCustomer(c);
        em.getTransaction().commit();
    }
    
    public void close(){
        em.close();
        emf.close();
    }
    
      
}
