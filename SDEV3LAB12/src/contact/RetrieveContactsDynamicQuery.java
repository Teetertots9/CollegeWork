/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contact;

import java.util.List;
import javax.persistence.*;

public class RetrieveContactsDynamicQuery {
    
    public static void main(String[] args) {
        EntityManagerFactory emf
                = Persistence.createEntityManagerFactory("SDEV3LAB12PU");
        EntityManager em = emf.createEntityManager();

        Query query = em.createQuery("SELECT c FROM Contacts c ORDER BY c.id",
                Contacts.class);
        List<Contacts> cList = query.getResultList();
        System.out.println("Contacts List:");
        for (Contacts c : cList) {
            System.out.println(c);
        }
        em.close();
        emf.close();
    }
}
