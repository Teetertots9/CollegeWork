/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdev2week3;

/**
 *
 * @ ANDREW TEETERS + KEVIN O'TOOLE  
 */
public class TestClass {
    
    public static void main(String[] args) {
        
        Rectangle one = new Rectangle();
        Rectangle two = new Rectangle();
        
        one.length = 25.5;
        one.width = 16.5;
        one.colour = "Red";
        
        two.length = 15.5;
        two.width = 10.0;
        two.colour = "Blue";
        
        one.print();
        two.print();
        
        if (one.getLength() > two.getLength()) {
            System.out.println("Rectangle One has greater length");
            one.print();
            
        }
        else if(two.getLength() > one.getLength()) {
            System.out.println("Rectangle Two has greater length");
            two.print();
            
        }
        else{
            System.out.println("Both Rectangles have equal length");
        }
        if (one.getColour().equalsIgnoreCase("Red")) {
            System.out.println("Rectangle One is Red");
        }
        if (two.getColour().equalsIgnoreCase("Red")){
            System.out.println("Rectangle Two is Red");   
        }
        
        }
    
        
    }
    

