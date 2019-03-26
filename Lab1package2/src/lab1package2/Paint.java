/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1package2;

/**
 *
 * @author Dell User
 */
public class Paint {
    private double coverage;
    
    public Paint(double coverage){
      this.coverage = coverage;  
    }
    
    
    public double calcAmount(Shape shapeIn){
        double amount = 0;
        
        if (shapeIn instanceof TwoDShape) {
            TwoDShape a = (TwoDShape) shapeIn;
            amount = a.getArea() / coverage;
            
        }
        else if(shapeIn instanceof ThreeDShape){
            ThreeDShape b = (ThreeDShape) shapeIn;
            amount = b.getArea() / coverage;
            
        }
        return amount;
    }
}
