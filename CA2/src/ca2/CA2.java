/*ANDREW TEETERS X00139120
 *
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca2;

import java.util.Scanner;

/**
 *
 * @author x00139120
 */
public class CA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        //variables
        int choice, bookRefNo = 0, noNights = 0, noSingleR = 0, noDoubleR = 0, totalReservations = 0;
        double singleRev = 0.0, doubleRev = 0.0, totalRev = 0.0;
        String roomType = "yes", failsafe = "no";

        char r;
        final double SINGLE_PRICE = 100.00, DOUBLE_PRICE = 150.00;

        //ALGORITHM
        System.out.println("**********Beach Hotel System**********");
        System.out.println(" 1.\t Make a reservation");
        System.out.println(" 2.\t Reservation statistics");
        System.out.println(" 3.\t Revenue statistics");
        System.out.println(" 4.\t Exit");
        System.out.print("Enter an option: ");
        choice = in.nextInt();

        while (choice != 4) {

            switch (choice) {
                case 1:
                    System.out.println("Please enter the customer's booking reference number, it must be between 1000 and 20000 inclusively");
                    bookRefNo = in.nextInt();
                    while (bookRefNo < 1000 || bookRefNo > 20000) {
                        System.out.println("ERROR, PLEASE ENTER CORRECT REFERENCE NUMBER");
                        bookRefNo = in.nextInt();
                    }
                    System.out.println("Please enter the number of nights they will be staying, must be greater than 0");
                    noNights = in.nextInt();
                    while (noNights <= 0) {
                        System.out.println("ERROR, PLEASE ENTER CORRECT NUMBER OF NIGHTS");
                        noNights = in.nextInt();
                    }
                    System.out.println("Please enter the type of room they require, Single for a single room, Double for a double room");
                    failsafe = in.nextLine();
                    roomType = in.nextLine();
                    roomType = roomType.toLowerCase();
                    r = roomType.charAt(0);
                    System.out.println("");
                    while (r != 's' && r != 'd'){
                        System.out.println("ERROR, PLEASE ENTER CORRECT ROOM TYPE");
                        roomType = in.nextLine();
                        roomType = roomType.toLowerCase();
                        r = roomType.charAt(0);

                    }
                    if (roomType.equals("single")) {
                        System.out.printf("Booking refernce %d's bill for %d night (s) in a Single room is %.2f%n%n", bookRefNo, noNights, SINGLE_PRICE * noNights);
                        noSingleR++;
                        singleRev += noNights * SINGLE_PRICE;
                    } else if (roomType.equals("double")) {
                        System.out.printf("Booking refernce %d's bill for %d night (s) in a Double room is %.2f%n%n", bookRefNo, noNights, DOUBLE_PRICE * noNights);
                        noDoubleR++;
                        doubleRev += noNights * DOUBLE_PRICE;
                    }
                    else{
                        System.out.println("ERROR, INCORRECT ROOM TYPE ENTERED");
                    }
                    totalReservations = noSingleR + noDoubleR;
                    totalRev += singleRev + doubleRev;
                    break;

                case 2:
                    System.out.println("");
                    System.out.println("**********Reservation Statistics**********");
                    System.out.printf("The total number of reservations is      %d%n", totalReservations);
                    System.out.printf("The number of Singles reserved is        %d%n", noSingleR);
                    System.out.printf("The number of Doubles reserved is        %d%n", noDoubleR);
                    System.out.println("******************************************");
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("**********Revenue Statistics**********");
                    System.out.printf("The current total revenue is %.2f%n", totalRev);
                    System.out.printf("The current Single's revenue is %.2f%n", singleRev);
                    System.out.printf("The current Double's revenue is %.2f%n", doubleRev);
                    System.out.println("**************************************");
                    break;
                default:
                    System.out.println("INCORRECT CHOICE ENTERED");
                    break;
            }
            System.out.println("**********Beach Hotel System**********");
            System.out.println(" 1.\t Make a reservation");
            System.out.println(" 2.\t Reservation statistics");
            System.out.println(" 3.\t Revenue statistics");
            System.out.println(" 4.\t Exit");
            System.out.print("Enter an option: ");
            choice = in.nextInt();
        }

        System.out.println(
                "Thank you and goodbye");
    }

}
