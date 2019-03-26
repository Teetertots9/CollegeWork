/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.util.Scanner;

/**
 *
 * @author x00139120
 */
public class TestMotherBoard {

    public static void main(String[] args) {
        String manufacturer;
        int memorySize, noModules;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the manufacturer: ");
        manufacturer = in.nextLine();

        System.out.println("Enter memory size: ");
        memorySize = in.nextInt();
        in.nextLine();

        System.out.println("Enter number of memory modules: ");
        noModules = in.nextInt();
        in.nextLine();

        MotherBoard m = new MotherBoard(manufacturer, memorySize, noModules);
        System.out.println(m);
    }
}
