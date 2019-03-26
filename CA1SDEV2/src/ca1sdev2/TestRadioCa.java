/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca1sdev2;

import java.util.Scanner;

/**
 *
 * @ANDREW TEETERS x00139120
 */
public class TestRadioCa {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String radionIn, bandIn, cl;
        double stationIn;
        System.out.println("Please enter the radio's manufacturer");
        radionIn = in.nextLine();
        Radio radio1 = new Radio(radionIn);
        radio1.powerOn();
        System.out.printf("A %s radio has been turned on.%nBand: %s%nStation: %.1f%n", radio1.getManufacturer(), radio1.getBand(), radio1.getStation());
        System.out.print("What band do you require AM or FM ?");
        bandIn = in.next();
        cl = in.nextLine();
        System.out.println("What station do you require numbers 88 - 1605 ?");
        stationIn = in.nextDouble();
        if (stationIn < 88 || stationIn > 1605) {
            System.out.println("Incorrect station number entered");
            System.out.print("What band do you require AM or FM ?");
            bandIn = in.next();
            cl = in.nextLine();
            System.out.println("What station do you require numbers 88 - 1605 ?");
            stationIn = in.nextDouble();
        }
        while (radio1.setStation(bandIn, stationIn) == false) {
            System.out.println("ERROR, STATION COULD NOT BE SET,PLEASE RE-ENTER DETAILS");
            System.out.print("What band do you require AM or FM ?");
            bandIn = in.next();
            cl = in.nextLine();
            System.out.println("What station do you require numbers 88 - 1605 ?");
            stationIn = in.nextDouble();
        }
        radio1.setStation(bandIn, stationIn);
        radio1.increaseVolume();
        System.out.printf("Band: %s%nStation Number: %.1f%nVolume: %d%n", radio1.getBand(), radio1.getStation(), radio1.getVolume());
        System.out.println("Too loud! I am lowering the volume by 4");
        radio1.decreaseVolume();
        radio1.decreaseVolume();
        radio1.decreaseVolume();
        radio1.decreaseVolume();
        System.out.printf("Band: %s%nStation Number: %.1f%nVolume: %d%n", radio1.getBand(), radio1.getStation(), radio1.getVolume());
        radio1.powerOff();
        System.out.println("Radio has powered off");
    }
}
