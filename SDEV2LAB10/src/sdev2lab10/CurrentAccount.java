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
public class CurrentAccount extends BankAccount {

    private double overdraft;

    public CurrentAccount(double b, String n, double o) {
        super(b, n);
        overdraft = o;
    }

    public void withdraw(double take) {
        if (take < balance + overdraft) {
            balance -= take;
            numWithdrawals++;
        } else {
            System.out.println("insufficient funds to withdraw the amount");
        }

    }

    public double calcInterest() {
        double interest = 0;
        if (balance > 0) {
            interest = balance * 0.05;
        }
        return interest;
    }
}
