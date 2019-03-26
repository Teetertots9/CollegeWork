/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contacts;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Dell User
 */
public class RetrieveContactsNamedQueryParameter {
    
    public static void main(String[] args) {
        EntityManagerFactory emf
                = Persistence.createEntityManagerFactory("LAB12SDEV3PU");
        EntityManager em = emf.createEntityManager();

        Query query
                = em.createNamedQuery("Contact.findByID", Contact.class).setParameter("name", "Peter").setParameter("price", 7.0);

        List<Contact> results = query.getResultList();
        for (Contact c : results) {
            System.out.println(c.toString());
        }
        em.close();
        emf.close();
    }
}
