/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SdevWeek5Lab1;
import java.util.Scanner;
/**
 *
 * @author x00139120
 */
public class TestPatient {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fnameIn, snameIn;
        boolean medicalcardIn, privatepatientIn;
        int lenghtOfStay;
        
        Patient p1 = new Patient("Jane", "Austin", true, true);
        System.out.printf("How many days did %s %s spend in hospital", p1.getFname(), p1.getSname());
        lenghtOfStay = in.nextInt();
        p1.setLenghtOfStay(lenghtOfStay);
        Patient p2 = new Patient("Henry", "James", false, true);
        System.out.printf("How many days did %s %s spend in hospital", p2.getFname(), p2.getSname());
        lenghtOfStay = in.nextInt();
        p2.setLenghtOfStay(lenghtOfStay);
        
        System.out.println("Enter the patients first name");
        fnameIn = in.nextLine();
        System.out.println("Enter the patients surname");
        snameIn = in.nextLine();
    }
}
