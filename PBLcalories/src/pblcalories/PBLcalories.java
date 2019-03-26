/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pblcalories;

/**
 *
 * @author x00139120
 */
public class PBLcalories {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //data
        double weight;

        double calories;

        //process
        System.out.println("PLease enter your weight");

        weight = 188;

        calories = weight * 19;

        //output
        System.out.println("The calories you should eat are:" + calories);
    }

}
