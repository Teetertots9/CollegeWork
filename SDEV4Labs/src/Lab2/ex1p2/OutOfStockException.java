/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2.ex1p2;

/**
 *
 * @author x00139120
 */
public class OutOfStockException extends Exception{
    public OutOfStockException(){
        super("Error: Out of Stock!");
    }
}
