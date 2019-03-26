/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import model.Employee;
import model.ProjectManager;
import model.Technician;
import java.util.Calendar;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;


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
                = em.createQuery("SELECT e FROM Employee e order by e.empid",
                        Employee.class);
        List<Employee> results = query.getResultList();

        for (Employee e : results) {
            System.out.println(e);
        }
        em.getTransaction().commit();

    }

    public void showAllPM() {
         em.getTransaction().begin();
        TypedQuery<ProjectManager> query
                = em.createQuery("SELECT pm FROM ProjectManager pm "
                        + "order by pm.empid",
                        ProjectManager.class);
        List<ProjectManager> results = query.getResultList();
        for (ProjectManager pm : results) {
            System.out.println(pm);
        }
         em.getTransaction().commit();
    }

    public void removeEmployee(int id) {
        em.getTransaction().begin();
        Employee e = em.find(Employee.class, id);
        if (e != null) {
            em.remove(e);
        }
        System.out.println("entity removed");
        em.getTransaction().commit();
    }

    public void removeEmployeeJPQL(int id) {
        em.getTransaction().begin();

        int deletedCount = em.createQuery("DELETE FROM "
                + "Employee e WHERE e.empid = " + id).executeUpdate();
        System.out.println("entity removed");
        em.getTransaction().commit();

    }
    
    public void addEmployee(String name, Calendar sdate, String type, 
            String value) {
        em.getTransaction().begin();
        
        if (type.equals("PM")) {
            ProjectManager pm1 = new ProjectManager(name, sdate, value);
            em.persist(pm1);
        } else if (type.equals("T")) {
            Technician t1 = new Technician(name, sdate, value);
            em.persist(t1);
        }
         em.getTransaction().commit();
    } 
    
    public void close(){
        em.close();
        emf.close();
    }
}
