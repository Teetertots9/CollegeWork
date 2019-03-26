/* ANDREW TEETERS x00139120
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab;

import java.util.Scanner;

/**
 *
 * @ANDREW TEETERS x00139120
 */
public class Lab9Exercise2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //variables
        final int NO_ASSISTANTS = 3, DAYS_WORKED = 5, OVER_TIME_HOURS = 6;
        double[] average = new double[NO_ASSISTANTS];
        int[] hoursWorked = new int[DAYS_WORKED];
        int over6 = 0;

        //ALGORITHM
        for (int i = 0; i < NO_ASSISTANTS; i++) {
            System.out.printf("Please enter data for research assistant %d%n%n", (i + 1));
            for (int j = 0; j < DAYS_WORKED; j++) {
                System.out.printf("Please enter the hours worked of day %d for assistant %d :%n", (j + 1), (i + 1));
                hoursWorked[j] = in.nextInt();
                average[i] += (hoursWorked[j]);
            }
            average[i] /= DAYS_WORKED; 
            if (average[i] > OVER_TIME_HOURS) {
                over6++;
            }
        }
        //OUTPUT
        System.out.printf("the total hours worked for the first assistant is %.1f%n", average[0]);
        System.out.printf("the total hours worked for the second assistant is %.1f%n", average[1]);
        System.out.printf("the total hours worked for the third assistant is %.1f%n%n", average[2]);
        System.out.printf("The number of assistants that worked an avergae of more than 6 hours is %d%n", over6);
    }
}
