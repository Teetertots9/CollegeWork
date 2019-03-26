/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdev2lab9;

import java.util.Scanner;

/**
 *
 * @author x00139120
 */
public class Test {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //variables
        ProductionWorker pw1;
        String pName;
        String pNumber;
        String pDate;
        double pRateDay;
        double pRateNight;
        int pDays;
        int choice;
        int hours;
        //Algorithme  
        System.out.println("Please enter the name of the employee");
        pName = in.nextLine();
        System.out.println("Please enter the employee number");
        pNumber = in.nextLine();
        System.out.println("Please enter the employee hire date");
        pDate = in.nextLine();
        System.out.println("Please enter the day pay rate");
        pRateDay = in.nextDouble();
        System.out.println("Please enter the nigth pay rate");
        pRateNight = in.nextDouble();
        System.out.println("Please enter the number of days worked");
        pDays = in.nextInt();

        pw1 = new ProductionWorker(pName, pNumber, pDate, pRateDay, pRateNight, pDays);
        //loop for Pay
        for (int i = 0; i < pDays; i++) {
            System.out.println("\tDay " + (i + 1));
            System.out.println("Did they work the day or night shift, 1 for Day or 2 for Night");
            choice = in.nextInt();
            while (choice < 1 || choice > 2) {
                System.out.println("Incorrect value entered, please enter 1 for Day or 2 for Night");
                choice = in.nextInt();
            }
            System.out.println("How many hours did they work for that shift");
            hours = in.nextInt();
            pw1.calculatePay(i, hours, choice);
        }
        //Print Details
        System.out.println("");
        pw1.print();
    }
}
