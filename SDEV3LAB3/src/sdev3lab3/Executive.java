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
public class Executive extends Employee{
    private double bonus;
    
    public Executive(String name, String address, String phoneNo, String rsiNumber, double rateOfPay){
        super(name, address, phoneNo, rsiNumber, rateOfPay);
        bonus = 0;
    }
    
    public void awardBonus(double bonus){
        this.bonus = bonus;
    }
    @Override
    public double pay(){
        double pay = rateOfPay + bonus;
        return pay;
    }
}
