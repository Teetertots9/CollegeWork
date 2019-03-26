/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdevweek5lab1;

/**
 *
 * @author x00139120
 */
public class TestLoan {
    
    public static void main(String[] args) {
        double totalPayment1,totalPayment2;
        Loan loan1 = new Loan(10000, 10, 10);
        Loan loan2 = new Loan(15000, 7, 15);
        
        loan1.print();
        System.out.println("");
        loan2.print();
        System.out.println("");
        
        totalPayment1 = loan1.getMonthlyPayment() * loan1.getNoPayments();
        totalPayment2 = loan2.getMonthlyPayment() * loan2.getNoPayments();
        
        loan1.print();
        System.out.printf("Monthly Payment: €%.3f%n", loan1.getMonthlyPayment());
        System.out.printf("Total Payment: €%.3f%n", totalPayment1);
        System.out.println("");
        loan2.print();
        System.out.printf("Monthly Payment: €%.3f%n", loan2.getMonthlyPayment());
        System.out.printf("Total Payment: €%.3f%n", totalPayment2);
        System.out.println("");
    }
}
