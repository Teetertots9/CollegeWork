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
public class Commission extends Hourly {

    private double totalSales;
    private double commissionRate;

    public Commission(String name, String address, String phoneNo, String rsiNumber, double rateOfPay, double commissionRate) {
        super(name, address, phoneNo, rsiNumber, rateOfPay);
        totalSales = 0;
        this.commissionRate = commissionRate;
    }

    public void addSales(double sales) {
        totalSales += sales;
    }

    @Override
    public double pay() {
        double commission = totalSales * commissionRate;
        double pay = super.pay() + commission;
        return pay;
    }

    @Override
    public String toString() {

        String stringOut = super.toString();
        stringOut += (" \nCommission Rate: " + commissionRate
                + " \nTotal Sales: " + totalSales);
        return stringOut;
    }
}
