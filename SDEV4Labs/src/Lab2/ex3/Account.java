/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2.ex3;

/**
 *
 * @author x00139120
 */
public class Account {

    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amt) throws PositiveWithdrawalException {
            if(amt < 0){
                throw new PositiveWithdrawalException();
            }        
        balance -= amt;
    }

    public double getBalance() {
        return balance;
    }
}
