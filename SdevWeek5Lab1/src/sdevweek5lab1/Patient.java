/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SdevWeek5Lab1;

/**
 *
 * @author x00139120
 */
public class Patient {

    private String fName;
    private String surName;
    private boolean hasMedicalCard;
    private boolean privatePatient;
    private int numDaysIn;

    public Patient(String fnameIn, String surnameIn, boolean medicalCardIn, boolean privateIn) {
        fName = fnameIn;
        surName = surnameIn;
        hasMedicalCard = medicalCardIn;
        privatePatient = privateIn;
    }

    public void setLenghtOfStay(int daysIn) {
        numDaysIn = daysIn;
    }

    public String getFname() {
        return fName;
    }

    public String getSname() {
        return surName;
    }

    public double bill() {
        final int TWENTY = 20, HUNDRED = 100, ZERO = 0;
        double bill = 0;
        if (hasMedicalCard = true) {
            bill = ZERO;
        } else if (hasMedicalCard = false) {
            if (privatePatient = true) {
                bill = (HUNDRED * numDaysIn);
            } else if (privatePatient = false) {
                bill = (TWENTY * numDaysIn);
            }
        }
        return bill;
    }
    public void printDetails(){
        System.out.println("First Name: "+ fName);
        System.out.println("Surname: "+ surName);
        System.out.println("Medical Card?: "+ hasMedicalCard);
    }
}
