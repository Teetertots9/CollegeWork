/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contact;

import javax.persistence.*;

public class FillContacts {
    public static void main(String[] args) {
        EntityManagerFactory emf
        = Persistence.createEntityManagerFactory
        ("SDEV3LAB12PU");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        Contacts a1 = new Contacts();
        a1.setName("Peter");
        a1.setAddress("23 Lime Lane");
        a1.setPnumber("018776543");
        a1.setEmail("p.cassidy@b.com");
        em.persist(a1);      
        
        Contacts a2 = new Contacts();
        a2.setName("Donal");  
        a2.setAddress("2 Shelbourne rd");  
        a2.setPnumber("012445678");  
        a2.setEmail("d.oreilly@b.com");  
        em.persist(a2);  
        
        Contacts a3 = new Contacts();
        a3.setName("Kevin");  
        a3.setAddress("4 Richmond rd");  
        a3.setPnumber("018765456");  
        a3.setEmail("m.reilly@rich.com"); 
        em.persist(a3);
        
        Contacts a4 = new Contacts();
        a4.setName("Glen");  
        a4.setAddress("35 Sommerville Lane");  
        a4.setPnumber("017854563");  
        a4.setEmail("p.whelan@siske.com"); 
        em.persist(a4);
        
        em.getTransaction().commit();
        
        em.close();
        emf.close();      
    }   
}
