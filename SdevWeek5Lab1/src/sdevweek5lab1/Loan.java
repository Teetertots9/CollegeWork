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
public class Loan {
    final private int MONTHS_IN_YEAR = 12;
    final private int PERCENTAGE = 100;
    private double loanAmount;
    private double monthlyInterestRate;
    private int numberOfPayments;
    
    public Loan(double loanIn, double interestIn, int numPaymentsIn){
        loanAmount = loanIn;
        monthlyInterestRate = (interestIn/PERCENTAGE/MONTHS_IN_YEAR);
        numberOfPayments = numPaymentsIn * MONTHS_IN_YEAR;
    }
    public double getLoanAmount(){
        return loanAmount;
    }
    public double getRate(){
        return (monthlyInterestRate * PERCENTAGE * MONTHS_IN_YEAR );
    }
    public int getNoPayments(){
        return numberOfPayments;
    }
    public void setAmount(double newAmount){
        loanAmount = newAmount;
    }
    public void setRate(double newRate){
        monthlyInterestRate = (newRate/PERCENTAGE/MONTHS_IN_YEAR);
    }
    public void setPayments(int newNoPayments){
        numberOfPayments = newNoPayments * MONTHS_IN_YEAR;
    }
    public double getMonthlyPayment(){
        return (loanAmount * monthlyInterestRate) / ( 1 -  Math.pow(1 /( 1 + monthlyInterestRate), numberOfPayments));
    }
    public void print(){
        System.out.println("Loan Amount: €"+ loanAmount);
        System.out.println("Annual Interest Rate: "+ (monthlyInterestRate * PERCENTAGE * MONTHS_IN_YEAR));
        System.out.println("Number of Payments: "+ numberOfPayments);
    }
}
