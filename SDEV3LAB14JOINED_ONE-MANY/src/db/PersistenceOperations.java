/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.util.Calendar;
import java.util.List;
import javax.persistence.*;
import model.*;


/**
 *
 * @author x00139120
 */
public class PersistenceOperations {
    
    EntityManagerFactory emf;
    EntityManager em;
    
    public PersistenceOperations(){
        emf = Persistence.createEntityManagerFactory("joinPU");
        em = emf.createEntityManager();
    }
    
    public void showAllEmployees(){
        em.getTransaction().begin();
        
        TypedQuery<Employee> query
                = em.createQuery("SELECT e FROM Employee13EX2 e order by e.empid",
                        Employee.class);
        List<Employee> results = query.getResultList();
        
        for (Employee e : results) {
            System.out.println(e);
        }
        em.getTransaction().commit();
    }
    
    public void showAllPT(){
        em.getTransaction().begin();
        TypedQuery<PartTimeEmployee> query
                = em.createQuery("SELECT pt FROM PartTimeEmployee pt order by pt.empid",
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
                = em.createQuery("SELECT ft FROM FullTimeEmployee ft order by ft.empid",
                        FullTimeEmployee.class);
        List<FullTimeEmployee> results = query.getResultList();
        for(FullTimeEmployee ft : results){
            System.out.println(ft);
        }
        
        em.getTransaction().commit();
    }
    
    public Employee findEmployee(int id){
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
    
    public void addFTEmployee(String name, Calendar sdate, double salary) {
        em.getTransaction().begin();
        FullTimeEmployee ft1 = new FullTimeEmployee(name, sdate, salary);
        em.persist(ft1);
        em.getTransaction().commit();
    }
    public void addPTEmployee(String name, Calendar sdate, double hours, double rate) {
        em.getTransaction().begin();
        PartTimeEmployee pt1 = new PartTimeEmployee(name, sdate, hours, rate);
        em.persist(pt1);
        em.getTransaction().commit();
    }
    public void close(){
        em.close();
        emf.close();
    }
}

