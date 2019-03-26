/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdev3lab3;

/**
 *
 * @author x00139120
 */
public class Employee extends StaffMember {

    private String rsiNumber;
    protected double rateOfPay;

    public Employee(String name, String address, String phoneNo, String rsiNumber, double rateOfPay) {
        super(name, address, phoneNo);
        this.rsiNumber = rsiNumber;
        this.rateOfPay = rateOfPay;
    }

    @Override
    public String toString() {
        String stringOut = ("Name: " + name
                + " \nAddress: " + address
                + " \nPhone Number: " + phoneNo
                + " \nRSI Number: " + rsiNumber);
        return stringOut;
    }

    @Override
    public double pay() {
        return rateOfPay;
    }

}
