/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author x00139120
 */
public class HourlyEmployee extends Employee {
    
    private double hoursWorked;
    private double rateOfPay;
    
    public HourlyEmployee() {
        
    }
    
    public HourlyEmployee(String fname, String lname, String rsi, double hoursWorked, double rateOfPay) {
        super(fname,lname,rsi);
        this.hoursWorked = hoursWorked;
        this.rateOfPay = rateOfPay;
    }
    
    public double getHoursWorked() {
        return hoursWorked;
    }
    
    public double getRateOfPay() {
        return rateOfPay;
    }
    
    public void setHoursWorked(double d) {
        this.hoursWorked = d;
    }
    
    public void setRateOfPay(double d) {
        this.rateOfPay = d;
    }
    
    @Override
    public String toString(){
        return "Employee:\nName: " + super.getFname() + " " + super.getLname() 
                + "\nRSI Number: " + super.getRSINumber() 
                + "\nWeekly Salary: €" + getPaymentAmount()
                + "\n" + super.getFname() + " " + super.getLname() + " is an hourly employee";
    }
    
    @Override
    public double getPaymentAmount() {
        double weeklyWages = hoursWorked * rateOfPay;
        double amount = 0;
        if (weeklyWages >= 0 && weeklyWages <=200 ) {
            amount =  weeklyWages;
        }
        else if (weeklyWages > 200 && weeklyWages <= 300 ) {
            amount =  weeklyWages * LOWTAXRATE;
            totalTaxPaid += weeklyWages - amount;
        }
        else if(weeklyWages > 300) {
            double remainder =  weeklyWages - 300;   
            amount = (300 * LOWTAXRATE) + (remainder * HIGHTAXRATE);
            totalTaxPaid+= (300 - (300 * LOWTAXRATE)) + (remainder - (remainder * HIGHTAXRATE));
        }
        return amount;
    }
}
