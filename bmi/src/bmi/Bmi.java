/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi;

/**
 *
 * @author x00139120
 */
public class Bmi {

    /** This program will calculate your BMI
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Data
            double weight;
            double height;
            
            double BMI;
            
        //Input
            System.out.println("Please enter your weight");
            weight = 95.2544;
            System.out.println("Please enter your height");
            height = 182.88;
        
        //Process
            height = height/100.0;
            BMI = weight/java.lang.Math.pow(height,2.0);
            
        //Output
            System.out.println("Your BMI is:" + BMI);
            
    }
    
}
