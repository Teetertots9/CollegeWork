package ex1;
import javax.persistence.*;

public class RetrieveCoffee {

    public static void main(String[] args) {

        EntityManagerFactory emf
                = Persistence.createEntityManagerFactory("Persistence1_PU");
        EntityManager em = emf.createEntityManager();

        Coffee c = em.find(Coffee.class, "14-003");
        if(c!=null){
        System.out.println(c);}
        else{
            System.out.println("Not found");
        }

        em.close();
        emf.close();
    }
}
