/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Scanner;

/**
 *
 * @author x00139120
 */
public class TestBand {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input;
        Rockband beatles;
        Musician[] members = new Musician[4];
        String[] names = {"John", "Paul", "George", "Ringo"};
        String[] instruments = {"Keyboards", "Guitar", "Guitar", "Drums"};

        beatles = new Rockband("The Beatles", "Apples", names, instruments);

        System.out.println(beatles.toString());

        System.out.println("\nPlease enter new label");
        input = in.nextLine();
        if (beatles.changeRecordLabel(input) == true) {
            beatles.changeRecordLabel(input);
            System.out.println("Record Label was changed");
            System.out.println("");
        } else {
            System.out.println("Record label was not changed");
            System.out.println("");
        }

        System.out.println(beatles.toString());

    }
}
