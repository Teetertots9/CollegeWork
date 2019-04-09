/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6;

/**
 *
 * @author Dell User
 */
public class OutOfStockException extends Exception{
    public OutOfStockException(){
        super("DVD currently out of stock");
    }
}
