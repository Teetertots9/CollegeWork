/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3SampleCA;

/**
 *
 * @author x00139120
 */
public enum ConcertTicket {
    SEATED {
        @Override
        public double getPrice(){
            return 100.00;
        }
    }, STANDING{
        @Override
        public double getPrice(){
            return 80.00;
        }
    };
    
    public abstract double getPrice();
}
