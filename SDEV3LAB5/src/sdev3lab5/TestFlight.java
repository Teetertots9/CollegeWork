/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdev3lab5;

/**
 *
 * @author x00139120
 */
public class TestFlight {
    public static void main(String[] args) {
        Flight f2 = new Flight(200, 3.5);
        Flight.Passenger p1;
        Flight.Passenger p2;
        Flight.Passenger p3;
        Flight.Passenger p4;
        double[] p1IA = new double[]{12.00,16.00,22.00};
        double[] p2IA = new double[]{12.00,13.00};
        double[] p3IA = new double[]{22.00,23.00,24.00};
        double[] p4IA = new double[]{16.00,18.00,23.00};
        char[] p1CA = new char[]{'M','M','L'};
        char[] p2CA = new char[]{'M','M'};
        char[] p3CA = new char[]{'L','L','L'};
        char[] p4CA = new char[]{'M','M','L'};
                
        p1 = f2.new Passenger("John",52,p1IA,p1CA);       
        p2 = f2.new Passenger("Ken",26,p2IA,p2CA);
        p3 = f2.new Passenger("Kate",89,p3IA,p3CA);
        p4 = f2.new Passenger("Peter", 40, p4IA,p4CA);
        f2.fillList(p1);
        f2.fillList(p2);
        f2.fillList(p3);
        f2.fillList(p4);
        
        f2.print();
        System.out.println("Seats Available: " + f2.checkAvailability());
        System.out.println(f2.calcOldestPassenger());
    }
}
