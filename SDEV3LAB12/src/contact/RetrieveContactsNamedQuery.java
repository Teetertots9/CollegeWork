/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contact;

import java.util.List;
import javax.persistence.*;

public class RetrieveContactsNamedQuery {
    public static void main(String[] args) {
        EntityManagerFactory emf
                = Persistence.createEntityManagerFactory
        ("SDEV3LAB12PU");
        EntityManager em = emf.createEntityManager();

        TypedQuery<Contacts> query
                = em.createNamedQuery("Manager.findAll", Contacts.class);

        List<Contacts> results = query.getResultList();
        for (Contacts c : results) {
            System.out.println(c.toString());
        }
        em.close();
        emf.close();
    } 
}
