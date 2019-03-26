/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdev2lab1;

import java.util.Scanner;

/**
 *
 * @author x00139120
 */
public class Sdev2Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        String[] name = new String[5];
        int minName = 0;
        int minage = 0;
        int[] age = new int[5];
        int[] agerange = new int[age.length];
        String[] sortedName = new String[name.length];

        for (int i = 0; i < name.length; i++) {
            System.out.println("Please enter the name of employee no." + (i + 1));
            name[i] = in.next();
            System.out.println("Please enter the age of employee no." + (i + 1));
            age[i] = in.nextInt();
        }
        for (int i = 0; i < name.length; i++) {

            if (age[minage] > age[i]) {
                minage = i;
            }
            minName = minage;
        }
        for (int i = 0; i < age.length; i++) {
            System.out.printf("%s   %d%n", name[i], age[i]);
        }
        
    }

}
