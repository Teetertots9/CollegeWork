/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import db.EmployeeOperations;
import db.PersistenceOperations;
import java.util.Calendar;
import java.util.Scanner;

public class TestEmployeeDB {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        EmployeeOperations eo = new EmployeeOperations();
        eo.openDB();
        eo.dropEmployeeSequence();
        eo.dropEmployeeTable();

        eo.createEmployeeSequence();
        eo.createEmployeetable();
        eo.fillEmployeeTable();

        PersistenceOperations po = new PersistenceOperations();

        while (true) {
            System.out.println("Please press 1 to view all employee details");
            System.out.println("Please press 2 to view all project manager details");
            System.out.println("Please press 3 to delete an employee using JPQL");
            System.out.println("Please press 4 to delete an employee using JPA method");
            System.out.println("Please press 5 to add a new employee");
            System.out.println("Press 6 to quit");

            int choice = in.nextInt();
            in.nextLine();

            switch (choice) {
                case 1:
                    po.showAllEmployees();
                    break;
                case 2:
                    po.showAllPM();
                    break;
                case 3:
                    System.out.println("please enter the id of the employee you "
                            + "wish to delete");
                    int idDelete = in.nextInt();
                    po.removeEmployeeJPQL(idDelete);
                    break;
                case 4:
                    System.out.println("please enter the id of the employee you "
                            + "wish to delete");
                    idDelete = in.nextInt();
                    po.removeEmployee(idDelete);
                    break;
                case 5:
                    System.out.println("please enter the name of the employee "
                            + "you wish to add");
                    String nameAdd = in.nextLine();
                    System.out.println("Please enter the start year of "
                            + "the employee");
                    int year = in.nextInt();
                    in.nextLine();
                    System.out.println("Please enter the start month of "
                            + "the employee");
                    int month = in.nextInt();
                    in.nextLine();
                    System.out.println("Please enter the start day of "
                            + "the employee");
                    int day = in.nextInt();
                    in.nextLine();
                    Calendar sdate = Calendar.getInstance();
                    sdate.set(year, month, day);

                    System.out.println("please enter the employee type");
                    String type = in.nextLine();
                    if (type.equals("PM")) {
                        System.out.println("please enter the employee project");
                        String project = in.nextLine();
                        po.addEmployee(nameAdd, sdate, type, project);
                    } else if (type.equals("T")) {
                        System.out.println("please enter the expertise");
                        String expertise = in.nextLine();
                        po.addEmployee(nameAdd, sdate, type, expertise);
                    }
                    break;
                case 6:
                    po.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Option entered");
                    break;
            }
        }
    }
}
