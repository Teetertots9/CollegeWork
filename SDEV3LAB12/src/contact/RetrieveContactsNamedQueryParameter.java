/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contact;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author x00139120
 */
public class RetrieveContactsNamedQueryParameter {
   public static void main(String[] args) {
        EntityManagerFactory emf
                = Persistence.createEntityManagerFactory("SDEV3LAB12PU");
        EntityManager em = emf.createEntityManager();

        Query query
                = em.createNamedQuery("Contacts.findContactbyId", Contacts.class).setParameter("id", 3);

        List<Contacts> results = query.getResultList();
        for (Contacts c : results) {
            System.out.println(c.toString());
        }
        em.close();
        emf.close();
    } 
}
