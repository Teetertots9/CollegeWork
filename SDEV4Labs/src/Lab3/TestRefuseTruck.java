/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author x00139120
 */
public class TestRefuseTruck {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean valid1 = false;
        boolean valid2 = false;
        boolean valid3 = false;
        int max = 0;
        double rate = 0;
        double weightIn = 0;

        while (!valid1) {
            try {
                System.out.println("Please enter the number of bins the truck can collect");
                max = in.nextInt();
                valid1 = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Incorrect Input");
                String joke = in.nextLine();
            }
        }
        while (!valid2) {
            try {
                System.out.println("Please enter the cost per kg");
                rate = in.nextDouble();
                
                valid2 = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Incorrect Input");
                String joke = in.nextLine();
            }
        }
        RefuseTruck t1 = new RefuseTruck(max, rate);

        while (!valid3) {
            try {
                while (t1.getNoOfBinsCollected() < t1.getMaxBins()) {
                    try {
                        System.out.println("Input Weigth for bin " + (t1.getNoOfBinsCollected() + 1));
                        weightIn = in.nextDouble();
                        t1.collectBin(weightIn);
                        valid3 = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Error: Incorrect Input");
                        String joke = in.nextLine();
                    }
                }
            } catch (BinOverWeigthException e) {
                System.out.println(e.getMessage());
                
            }
        }
        t1.printStats();
    }
}
