package ex1;

import javax.persistence.*;

public class UpdateCoffee {

    public static void main(String[] args) {
        EntityManagerFactory emf
                = Persistence.createEntityManagerFactory
        ("Persistence1_PU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        Coffee c = em.find(Coffee.class, "14-003");
        c.setPrice(7.5);
        em.getTransaction().commit();
        em.close();
        emf.close();

    }
}
