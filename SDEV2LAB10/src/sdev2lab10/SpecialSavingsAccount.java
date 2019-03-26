/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdev2lab10;

/**
 *
 * @author x00139120
 */
public class SpecialSavingsAccount extends SavingsAccount {

    public SpecialSavingsAccount(double b, String n, Double iR) {
        super(b, n, iR);
    }

    public double calcInterest() {
        return (super.calcInterest() + 250);
    }
}
