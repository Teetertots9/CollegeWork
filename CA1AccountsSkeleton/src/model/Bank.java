package model;

import java.sql.ResultSet;
import java.util.ArrayList;

import database.AccountOperations;
import java.sql.SQLException;
import java.util.Calendar;

public class Bank {

    private String name;
    private ArrayList<Account> alist;
    private ResultSet rset;
    private AccountOperations ao;

    public Bank(String name, AccountOperations ao) {
        this.ao = ao;
        this.name = name;
        alist = new ArrayList<>();
    }

    public void fillList() {
        rset = ao.getAccounts();
        try {
            while (rset.next()) {
                Calendar cal = Calendar.getInstance();
                cal.setTime(rset.getDate(6));
                Account a = new Account(rset.getInt(1), rset.getString(2), rset.getString(3),
                        rset.getString(4), rset.getDouble(5), cal);
                alist.add(a);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void showAccounts() {

        System.out.printf("%10s%10s%15s%15s%15s%15s%n", "Acc Num",
                "Acc Type", "First Name", "Last Name", "Acc Balance", "Date Opened");
        for (int i = 0; i < alist.size(); i++) {
            System.out.println(alist.get(i));
        }
    }

    public int findAccount(int num) {
        int index = -1;
        for (int i = 0; i < alist.size(); i++) {
            if (alist.get(i).getaccNumber() == num) {
                index = i;
            }
        }
        return index;
    }

    public void addAccount() {
        rset = ao.getMaxAccount();
        try {
            if (rset.next()) {
                Calendar dopen = Calendar.getInstance();
                dopen.setTime(rset.getDate(6));

                Account a = new Account(rset.getInt(1), rset.getString(2), rset.getString(3), rset.getString(4), rset.getDouble(5), dopen);
                alist.add(a);
            }

        } catch (SQLException e) {
            System.out.println("Error in addAccount() method" + e.getMessage());
        }

    }

    public double lodgeMoney(int i, double d) {
        alist.get(i - 1).lodge(d);
        double newAm = alist.get(i - 1).getBalance();
        return newAm;
    }

    public double withdrawMoney(int i, double d) {
        alist.get(i - 1).withdraw(d);
        double newAm = alist.get(i - 1).getBalance();
        return newAm;
    }

    public void viewLargest() {
        double maxBal = 10000;
        for (int j = 0; j < alist.size(); j++) {
            if (maxBal < alist.get(j).getBalance()) {
                maxBal = alist.get(j).getBalance();
            }
        }
        for (int i = 0; i < alist.size(); i++) {
            if (alist.get(i).getBalance() == maxBal) {
                System.out.printf("%10s%10s%15s%15s%15s%15s%n", "Acc Num",
                        "Acc Type", "First Name", "Last Name", "Acc Balance", "Date Opened");
                System.out.println(alist.get(i));
            }
        }

    }

    public void applyTax() {
        double tax = 0;
        for (int i = 0; i < alist.size(); i++) {
            if (alist.get(i).getAccountType().equals("CA")) {
                if (alist.get(i).getBalance() >= 0 && alist.get(i).getBalance() <= 10000) {
                    tax = alist.get(i).getBalance();
                    tax *= .95;
                    alist.get(i).setBalance(tax);
                    ao.applyTax(i, tax);
                } else if (alist.get(i).getBalance() > 10000 && alist.get(i).getBalance() <= 50000) {
                    tax = alist.get(i).getBalance();
                    tax *= .90;
                    alist.get(i).setBalance(tax);
                    ao.applyTax(i, tax);
                } else if (alist.get(i).getBalance() > 50000) {
                    tax = alist.get(i).getBalance();
                    tax *= .85;
                    alist.get(i).setBalance(tax);
                    ao.applyTax(i, tax);
                }
            }
        }
    }

    public void showOldestAccounts() {
        long min = Long.MAX_VALUE;
        for (int i = 0; i < alist.size(); i++) {
            long millisRelease = alist.get(i).getDateOpened().getTimeInMillis();
            if (millisRelease < min) {
                min = alist.get(i).getDateOpened().getTimeInMillis();
            }
        }
        for (int i = 0; i < alist.size(); i++) {
            long millisRelease = alist.get(i).getDateOpened().getTimeInMillis();
            if (min == millisRelease) {

                System.out.printf("%10s%10s%15s%15s%15s%15s%n", "Acc Num",
                        "Acc Type", "First Name", "Last Name", "Acc Balance", "Date Opened");
                System.out.println(alist.get(i));
            }
        }
    }
}
