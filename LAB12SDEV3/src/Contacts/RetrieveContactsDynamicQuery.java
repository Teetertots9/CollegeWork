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
 * @author x00139120
 */
public class RetrieveContactsDynamicQuery {
    
    public static void main(String[] args) {
        EntityManagerFactory emf
                = Persistence.createEntityManagerFactory("LAB12SDEV3PU");
        EntityManager em = emf.createEntityManager();

        Query query = em.createQuery("SELECT c FROM Contacts al ORDER BY c.id",
                Contact.class);
        List<Contact> cList = query.getResultList();
        System.out.println("Album List:");
        for (Contact c : cList) {
            System.out.println(c);
        }
        em.close();
        emf.close();
    }
}
