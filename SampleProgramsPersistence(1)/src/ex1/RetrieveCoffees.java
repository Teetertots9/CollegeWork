/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.util.List;
import javax.persistence.*;

public class RetrieveCoffees {
    public static void main(String[] args) {

        EntityManagerFactory emf
                = Persistence.createEntityManagerFactory
        ("Persistence1_PU");
        EntityManager em = emf.createEntityManager();

        Query query = em.createQuery("SELECT c FROM Coffee c",
                Coffee.class);
        List<Coffee> cList = query.getResultList();
        System.out.println("Coffee List:");
        for (Coffee c : cList) {
            System.out.println(c);
        }
        em.close();
        emf.close();
    }   
}
