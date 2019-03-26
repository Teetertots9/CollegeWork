/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

/**
 *
 * @author x00139120
 */
public class PersistenceOperations {
    
    EntityManagerFactory emf;
    EntityManager em;
    
    public PersistenceOperations(){
        emf = Persistence.createEntityManagerFactory("singlePU");
    }
            
}
