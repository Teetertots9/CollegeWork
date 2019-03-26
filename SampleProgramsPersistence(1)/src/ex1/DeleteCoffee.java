package ex1;

import javax.persistence.*;

public class DeleteCoffee {

    public static void main(String[] args) {

        EntityManagerFactory emf
                = Persistence.createEntityManagerFactory
        ("Persistence1_PU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        Coffee c = em.find(Coffee.class, "14-003");
        if (c != null) {
            System.out.println(c.toString());
            em.remove(c);
        }
        em.getTransaction().commit();
    }
}
