/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

/**
 *
 * @author x00139120
 */
public class BinOverWeigthException extends Exception{
    
    public BinOverWeigthException(){
        super("Error: Bin is over maximum weight! - Collection declined");
    }
}
