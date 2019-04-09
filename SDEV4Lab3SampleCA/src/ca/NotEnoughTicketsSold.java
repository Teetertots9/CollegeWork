/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca;

/**
 *
 * @author Dell User
 */
public class NotEnoughTicketsSold extends Exception{
    
    public NotEnoughTicketsSold(){
        super("Not enough tickets sold!");
    }
    
}