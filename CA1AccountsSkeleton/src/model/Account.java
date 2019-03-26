package model;

import java.util.Calendar;

public class Account {

    private int accNumber;
    private String accType;
    private String accFName;
    private String accLName;
    private double accBalance;
    private Calendar dateOpened;

    public Account(int number, String type, String fname, String lname, double balance, Calendar dateOpened) {
        accNumber = number;
        accType = type;
        accFName = fname;
        accLName = lname;
        accBalance = balance;
        this.dateOpened = dateOpened;
    }


    public void lodge(double amount) {
        accBalance = accBalance + amount;
    }

    public void withdraw(double amount) {
        accBalance = accBalance - amount;
    }

    public String getlName() {
        return accLName;
    }

    public String getfName() {
        return accFName;
    }

    public int getaccNumber() {
        return accNumber;
    }

    public double getBalance() {
        return accBalance;
    }

    public void setBalance(double newBal) {
        accBalance = newBal;
    }

    public String getAccountType() {
        return accType;
    }

    public void setAccountType(String accountType) {
        this.accType = accountType;
    }

    public Calendar getDateOpened() {
        return dateOpened;
    }

    public void setDateOpened(Calendar dateOpened) {
        this.dateOpened = dateOpened;
    }


    
    @Override
    public String toString() {
        String d = String.format("%1$10d "
                + "%2$10s "
                + "%3$10s "
                + "%4$15s "
                + "%5$,15.2f€ "
                + "%6$8tb %6$td %6$tY ",
                accNumber,
                accType, accFName, accLName, accBalance, dateOpened);
        return d;
    }

}
