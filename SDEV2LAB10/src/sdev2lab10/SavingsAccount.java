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
public class SavingsAccount extends BankAccount {

    private boolean status;
    private double interestRate;

    public SavingsAccount(double b, String n, double iR) {
        super(b, n);
        interestRate = iR;
        if (balance < 25) {
            status = false;
        } else {
            status = true;
        }
    }

    public void withdraw(double take) {
        if (status == true) {
            balance -= take;
            numWithdrawals++;
            if (balance < 25) {
                status = false;
            }
        }
    }

    public double calcInterest() {
        return (balance * interestRate);
    }
}
