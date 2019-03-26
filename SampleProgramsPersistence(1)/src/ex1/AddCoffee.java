/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AddCoffee {

    public static void main(String[] args) {
        EntityManagerFactory emf
        = Persistence.createEntityManagerFactory
        ("Persistence1_PU");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        Coffee c1 = new Coffee();
        c1.setProdnum("14-003");
        c1.setDescription("Central American Dark");
        c1.setPrice(4.5);
        
        em.persist(c1);      
        em.getTransaction().commit();
        
        em.close();
        emf.close();           
    }
}


