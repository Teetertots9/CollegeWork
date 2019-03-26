/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.util.Scanner;

/**
 *
 * @author Andrew Teeters x00139120
 */
public class question4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double converRate = 0, dollar_yen = 0, yen_dollar = 0, dollar_input = 0, yen_input = 0;

        //input conversion rate
        System.out.println("Please enter the price of 1 dollar in Japanese Yen");
        converRate = in.nextDouble();
        //input amount to start or skip loop
        System.out.println("Please enter the amount in Dollars you wish to convert, enter 0 to end.");
        dollar_input = in.nextDouble();

        while (dollar_input > 0) {

            dollar_yen = (dollar_input * converRate);
            System.out.printf("You get ¥%.2f%n", dollar_yen);
            System.out.println("Please enter the next amount in Dollars you wise to convert, enter 0 to end.");
            dollar_input = in.nextDouble();
        }
        //loop end
        //input amounr to start or skip second loop
        System.out.println("Please enter the amount in Yen you wish to convert, enter 0 to end");
        yen_input = in.nextDouble();

        while (yen_input > 0) {

            yen_dollar = (yen_input / converRate);
            System.out.printf("You get $%.2f%n", yen_dollar);
            System.out.println("Please enter the next amount in Yen you wise to convert, enter 0 to end.");
            yen_input = in.nextDouble();
        }
        //loop end
        //finish program
        System.out.println("Finished");
    }
}
