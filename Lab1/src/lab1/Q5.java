/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Andrew Teeters x00139120
 */
public class Q5 {

    public static void main(String[] args) {
        //data
        //L = Letter
        final double LWIDTHINCH = 8.5;
        final double LLENGHTINCH = 11.0;
        final double LAREAINCH = LWIDTHINCH * LLENGHTINCH;
        final double MILIPERINCH = 25.4;
        final double LPERIMINCH; 
        double lWidthMili;
        double lLenghtMili;
        double lAreaMili;
        double lPerimMili;
        //Input
        System.out.println("The lenght of a letter in inches is:" + LWIDTHINCH);
        System.out.println("The width of a letter in inches is:" + LLENGHTINCH);
        System.out.println("The area of the letter in inches is:" + LAREAINCH);

        //Process
        lWidthMili = LWIDTHINCH * MILIPERINCH;
        lLenghtMili = LLENGHTINCH * MILIPERINCH;
        lAreaMili = lLenghtMili * lWidthMili;
        LPERIMINCH = 2*(LWIDTHINCH + LLENGHTINCH);
        lPerimMili = 2*(lWidthMili + lLenghtMili);
        //Output
        System.out.println("The lenght of a letter in millimetres is:" + lLenghtMili);
        System.out.println("The width of a letter in millimetres is:" + lWidthMili);
        System.out.println("The area of a letter in millimetres is:" + lAreaMili);
        System.out.println("The perimetre of the letter in inches is:" + LPERIMINCH);
        System.out.println("The perimetre of the letter in millimetres is:" + lPerimMili);
    }
}
