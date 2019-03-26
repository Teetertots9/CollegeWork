package testBank;

import model.Bank;
import database.AccountOperations;
import java.util.Calendar;
import java.util.Scanner;

public class TestBank {

    public static void main(String[] args) {

        int accNo;
        Scanner in = new Scanner(System.in);

        AccountOperations ao = new AccountOperations();
        ao.openDB();
        ao.dropAccSeq();
        ao.dropAccountsTable();
        ao.createAccSeq();
        ao.createAccountsTable();
        ao.fillAccTable();

        Bank b = new Bank("aib", ao);
        b.fillList();

        while (true) {
            System.out.println("Please press 1 to view all accounts");
            System.out.println("Please press 2 to add a new account");
            System.out.println("Please press 3 to lodge money");
            System.out.println("Please press 4 to withdraw money");
            System.out.println("Please press 5 to view the savings account(s) with the largest balance");
            System.out.println("Please press 6 to apply tax on all current accounts only");
            System.out.println("Please press 7 to view the oldest account(s)");
            System.out.println("Press 8 to quit");

            int choice = in.nextInt();
            in.nextLine();

            switch (choice) {
                case 1:
                    b.showAccounts();
                    break;
                case 2:
                    System.out.println("please enter the account type you wish to add");
                    String accType = in.nextLine();
                    System.out.println("please enter the first name");
                    String fName = in.nextLine();
                    System.out.println("please enter the last name");
                    String lName = in.nextLine();
                    System.out.println("please enter the balance on this new account");
                    double bal = in.nextDouble();
                    System.out.println("Please enter the current year");
                    int year = in.nextInt();
                    in.nextLine();
                    System.out.println("Please enter the current month");
                    int month = in.nextInt();
                    in.nextLine();
                    System.out.println("Please enter the current day");
                    int day = in.nextInt();
                    in.nextLine();
                    Calendar dopen = Calendar.getInstance();
                    dopen.set(year, month, day);
                    ao.addAccount(accType, fName, lName, bal, dopen);
                    b.addAccount();
                    break;
                case 3:
                    System.out.println("Please enter the number of the account you wish to lodge money into");
                    int accNum = in.nextInt();
                    System.out.println("Please enter the amount of money you wish to lodge");
                    double amount = in.nextDouble();
                    ao.lodgeMoney(accNum, b.lodgeMoney(accNum, amount));
                    break;
                case 4:
                    System.out.println("Please enter the number of the account you wish to lodge money into");
                    int acNum = in.nextInt();
                    System.out.println("Please enter the amount of money you wish to lodge");
                    double newAm = in.nextDouble();
                    ao.withdrawMoney(acNum, b.withdrawMoney(acNum, newAm));
                    break;
                case 5:
                    b.viewLargest();
                    break;
                case 6:
                    b.applyTax();
                    break;
                case 7:
                    b.showOldestAccounts();
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Option entered");
                    break;
            }
        }
    }

}
