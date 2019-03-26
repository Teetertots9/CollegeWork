/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca2sdev2;

/**
 *
 * @ANDREW TEETERS x00139120
 */
public class ClubMember {

    private String name;
    private String memberID;
    private int yearOfJoining;
    private double fee;
    private double amountPaid;
    protected double discountRate;
    private boolean isPaid;

    public ClubMember(String nameIn, String idIn, int yearIn) {
        name = nameIn;
        memberID = idIn;
        if (yearIn < 1980) {
            yearOfJoining = 0;
        } else {
            yearOfJoining = yearIn;
        }
    }

    public String getID() {
        return memberID;
    }

    public double getFee() {
        return fee;
    }

    public boolean getIsPaid() {
        return isPaid;
    }

    public void calcDiscountRate() {
        discountRate = 1;
        if (yearOfJoining >= 1980 && yearOfJoining <= 1989) {
            discountRate -= 0.15;
        } else if (yearOfJoining >= 1990 && yearOfJoining <= 1999) {
            discountRate -= 0.10;
        } else if (yearOfJoining >= 2000 && yearOfJoining <= 2009) {
            discountRate -= 0.05;
        } else if (yearOfJoining >= 2010) {
            discountRate -= 0.02;
        }
    }

    public void calcFee() {
        fee = 200 * discountRate;
    }

    public void payMembership(double payment) {
        amountPaid += payment;
        fee -= payment;
        if (fee != 0) {
            isPaid = false;
        }
        else{
            isPaid = true;
        }
    }

    public void printOutstanding() {
        System.out.println("Member ID: " + memberID);
        System.out.printf("Outstanding Fees: €%.2f%n", fee);
    }
}
