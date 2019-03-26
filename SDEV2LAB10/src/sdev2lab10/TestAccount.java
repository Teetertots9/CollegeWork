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
public class TestAccount {

    public static void main(String[] args) {
        BankAccount[] account = new BankAccount[4];
        
        account[0] = new SavingsAccount(500, "John Smith", .10);
        account[1] = new SavingsAccount(600, "Mary Jones", .10);
        account[2] = new SpecialSavingsAccount(600, "Mary Smith", .10);
        account[3] = new CurrentAccount(200, "John Jones" , 200);
        
        for (int i = 0; i < account.length; i++) {
           account[i].withdraw(300);
            System.out.println("Account: "+ account[i].getName());
            System.out.println("\t Balance: "+ account[i].getBalance());
            System.out.println("\t Number of Withdrawals: "+ account[i].getNoWithdrawals());
            System.out.println("\t Interest Due "+ account[i].calcInterest());
        }
    }
}
