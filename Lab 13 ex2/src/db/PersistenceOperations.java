/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;
import java.util.*;
import javax.persistence.*;
import model.*;

/**
 *
 * @author X00144631
 */
public class PersistenceOperations {

    EntityManagerFactory emf;
    EntityManager em;

    public PersistenceOperations() {
        emf = Persistence.createEntityManagerFactory("joinPU");
        em = emf.createEntityManager();
    }

    public void showAllEmployees() {
        em.getTransaction().begin();

        TypedQuery<Employee> query
                = em.createQuery("SELECT e FROM Employee e order by e.empid", Employee.class);
        List<Employee> results = query.getResultList();

        for (Employee e : results) {
            System.out.println(e);
        }
        em.getTransaction().commit();
    }
    
    public void showAllPT(){
          em.getTransaction().begin();

        TypedQuery<PartTimeEmployee> query
                = em.createQuery("SELECT pt FROM PartTimeEmployee pt order by pt.empid", PartTimeEmployee.class);
        List<PartTimeEmployee> results = query.getResultList();

        for (PartTimeEmployee pt : results) {
            System.out.println(pt);
        }
        em.getTransaction().commit();
        
    }
    
    public void showAllFT(){
          em.getTransaction().begin();

        TypedQuery<FullTimeEmployee> query
                = em.createQuery("SELECT FT FROM FullTimeEmployee FT order by FT.empid", FullTimeEmployee.class);
        List<FullTimeEmployee> results = query.getResultList();

        for (FullTimeEmployee FT : results) {
            System.out.println(FT);
        }
        em.getTransaction().commit();
        
    }
    
    public Employee findEmployee (int id){
        Employee d = em.find(Employee.class, id);
        if (d == null) {
            System.out.println("Not found");
        }
        return d;
    }
    
    public void deleteEmployee(int eid){
        Employee e = em.find(Employee.class, eid);
        em.getTransaction().begin();
        em.remove(e);
        em.getTransaction().commit();
        System.out.println("Employee Deleted");
    }
    
    public void addFTEmployee(String name, Calendar sdate, double salary){
        em.getTransaction().begin();
        FullTimeEmployee ft1 = new FullTimeEmployee(name, sdate, salary);
        em.persist(ft1);
        em.getTransaction().commit();
    }
    
       public void addpTEmployee(String name, Calendar sdate, double rate, double hrs){
        em.getTransaction().begin();
        PartTimeEmployee pt1 = new PartTimeEmployee(name,sdate,rate,hrs);
        em.persist(pt1);
        em.getTransaction().commit();
    }
    
       public void close(){
           em.close();
           emf.close();
       }
       

    
}
