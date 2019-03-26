/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agethisyear;

/**
 *
 * @author x00139120
 */
public class AgeThisYear {

    /**This program will calculate your age for this year
     * 
     * @param args
     *
     */
    public static void main(String[] args) {
        // Data
            int yearBorn;
            int ageThisYear;
            final int thisYear = 2017;
        
        //Input
            System.out.println("Please enter the year you were born");
            yearBorn = 1997;
            
        //Process
            ageThisYear = thisYear - yearBorn;
            
         //Output
            System.out.println("Your age this year is:" + ageThisYear);
    }
    
}
