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
public abstract class BankAccount {

    protected double balance;                // Account balance
    private String name;
    protected int numWithdrawals;            // Number of withdrawals

    public BankAccount(double b, String n) {
        balance = b;
        name = n;
        numWithdrawals = 0;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public int getNoWithdrawals() {
        return numWithdrawals;
    }

    public abstract void withdraw(double take);

    public abstract double calcInterest();
}
