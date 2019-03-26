/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbl10;

import java.util.Scanner;

/**
 *
 * @author x00139120
 */
public class PBL10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        //variables
        int numPeople = 0, count = 0, totalPeople = 0;
        double cost = 0, totalRev = 0;
        String registration, trap;
        boolean exit = true, under18;
        final double ONE = 100.00, U_18 = 10.00, O_18 = 20.00;

        while (exit != false) {
            System.out.println("Please enter the registration number");
            registration = in.nextLine();
            System.out.println("Please enter the number of passengers, including the driver");
            numPeople = in.nextInt();

            if (numPeople == 1) {
                cost = ONE;
                count++;
                totalPeople++;
                totalRev += ONE;
                System.out.printf("The cost of car %s is: €%.2f%n", registration, cost);
            } else if (numPeople > 1) {
                cost = ONE;
                totalPeople += numPeople;
                for (int i = 1; i < numPeople; i++) {
                    System.out.printf("Is passenger %d under 18, true or false%n", i);
                    under18 = in.nextBoolean();

                    if (under18 == true) {
                        cost += U_18;
                    } else if (under18 == false) {
                        cost += O_18;
                    }
                }
                totalRev += cost;
                System.out.printf("Cost of car %s is: €%.2f", registration, cost);
            }
            System.out.println("Are there any more cars to board, true or false");
            exit = in.nextBoolean();
            trap = in.nextLine();
        }
        System.out.printf("Total Revenue: €%.2f%n", totalRev);
        System.out.printf("Total numbers carried: %d%n", totalPeople);
        System.out.printf("Number of cars with driver only: %d%n", count);
    }

}
