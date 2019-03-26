/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pblageearth;

/**
 *
 * @author x00139120
 */
public class PBLageEarth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // data
        int ageEarth;
        int daysEarth;
        double ageMercury;
        double ageVenus;
        double ageJupiter;
        double ageSaturn;
        
        //process
        System.out.println("Please enter you age on Earth");
        ageEarth =19;
        
        daysEarth = ageEarth * 365;
        
        ageMercury = daysEarth / 88;
        ageVenus = daysEarth / 225;
        ageJupiter = daysEarth / 4380;
        ageSaturn = daysEarth / 10767;
        
        //output
        System.out.println("Your age on Mercury is:" + ageMercury);
        System.out.println("Your age on Venus is:" + ageVenus);
        System.out.println("Your age on Jupiter is:" + ageJupiter);
        System.out.println("Your age on Saturn is:" + ageSaturn);
        
        
    }
    
}
