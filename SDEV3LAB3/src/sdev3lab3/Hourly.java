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
public class Hourly extends Employee {

    private int hoursWorked;

    public Hourly(String name, String address, String phoneNo, String rsiNumber, double rateOfPay) {
        super(name, address, phoneNo, rsiNumber, rateOfPay);
        hoursWorked = 0;
    }

    public void addHours(int hours) {
        hoursWorked += hours;
    }

    @Override
    public double pay() {
        double pay = 0;
        if (hoursWorked > 40) {
            pay = 40 * rateOfPay;
            pay += (hoursWorked - 40) * (rateOfPay * 1.5);
        } else {
            pay = hoursWorked * rateOfPay;
        }

        return pay;
    }

    @Override
    public String toString() {
        String stringOut = super.toString();
        stringOut += (" \nHours Worked: " + hoursWorked
                + " \nTotal Pay: " + pay());
        return stringOut;
    }
}
