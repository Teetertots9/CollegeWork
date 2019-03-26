/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author x00139120
 */
public interface IPayable {
    
    
    final static double LOWTAXRATE = 1 - 0.23;
    final static double HIGHTAXRATE = 1 - 0.42;
    final static double VATRATE = 0.235;
    
    public  abstract double getPaymentAmount();
}
