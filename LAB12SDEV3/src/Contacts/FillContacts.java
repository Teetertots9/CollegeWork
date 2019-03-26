/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contacts;
import javax.persistence.*;
/**
 *
 * @author x00139120
 */
public class FillContacts {
    public static void main(String[] args) {
        EntityManagerFactory emf
        = Persistence.createEntityManagerFactory("LAB12SDEV3PU");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        Contact c1 = new Contact();
        c1.setName("Peter");
        c1.setAddress("23 Lime Lane");
        c1.setPNumber("018776543");    
        c1.setEMail("p.cassidy@b.com");
        em.persist(c1);      
        
        Contact c2 = new Contact();
        c2.setName("Donal");
        c2.setAddress("2 Shelbourne rd");
        c2.setPNumber("01244678");    
        c2.setEMail("d.oreilly@b.com");
        em.persist(c2);   
        
       Contact c3 = new Contact();
        c3.setName("Kevin");
        c3.setAddress("4 Richmond rd");
        c3.setPNumber("018765456");    
        c3.setEMail("m.reilly@rich.com");
        em.persist(c3); 
        
        Contact c4 = new Contact();
        c4.setName("Glen");
        c4.setAddress("35 Sommerville Lane");
        c4.setPNumber("017854563");    
        c4.setEMail("p.whelan@siske.com");
        em.persist(c4); 
        
        em.getTransaction().commit();
        
        em.close();
        emf.close();      
    } 
}
