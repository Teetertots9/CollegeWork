/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab;

import java.util.Scanner;

/**
 *
 * @author x00139120
 */
public class Week8Lab {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //INPUT 
        int choice;
        double lenght, radius, height;

        //OUTPUT
        double volumn;
        final double FORMULA1 = 4.0 / 3.0;

        //ALGORITHM
        System.out.println("**************Object Volumn Menu*************");
        System.out.println(" 1.\t Cube Volumn               ");
        System.out.println(" 2.\t Cylinder Volumn       ");
        System.out.println(" 3.\t Sphere Volumn         ");
        System.out.println(" 4.\t Exit         ");
        System.out.println("***********************************");
        System.out.print("Enter option: ");
        choice = in.nextInt();

        while (choice != 4) {

            switch (choice) {
                case 1:
                    System.out.println("Please enter the lenght of the cube");
                    lenght = in.nextDouble();

                    while (lenght <= 0) {
                        System.out.println("ERROR, please re-enter the cube lenght");
                        lenght = in.nextDouble();
                    }
                    volumn = lenght * lenght * lenght;
                    System.out.printf("The volumn of the cube with side %.2f is %.2f%n", lenght, volumn);

                    break;

                case 2:
                    System.out.println("Please enter the height and then the radius of the cylinder");
                    height = in.nextDouble();
                    radius = in.nextDouble();
                    while (height <= 0 || radius <= 0) {
                        System.out.println("ERROR, Please enter a correct height and radius");
                        height = in.nextDouble();
                        radius = in.nextDouble();
                    }
                    volumn = Math.PI * (radius * radius) * height;
                    System.out.printf("The volumn of cylinder radius %.2f and height %.2f is %.2f%n", radius, height, volumn);
                    break;

                case 3:
                    System.out.println("Please enter the radius of the sphere");
                    radius = in.nextDouble();
                    while(radius <= 0){
                        System.out.println("ERROR, please enter a correct radius");
                        radius = in.nextDouble();
                    }
                    volumn = FORMULA1 * Math.PI * (radius * radius * radius);
                    System.out.printf("The volumn of the sphere with radius %.2f is %.2f%n", radius, volumn);
                    break;

                default:
                    System.out.println("ERROR WRONG CHOICE ENTERED");
            }
            System.out.println("**************Object Volumn Menu*************");
            System.out.println(" 1.\t Cube Volumn               ");
            System.out.println(" 2.\t Cylinder Volumn       ");
            System.out.println(" 3.\t Sphere Volumn         ");
            System.out.println(" 4.\t Exit         ");
            System.out.println("***********************************");
            System.out.print("Enter option: ");
            choice = in.nextInt();
        }
        System.out.println("Thank you for using this program");
    }
}
