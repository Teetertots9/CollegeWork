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
import javax.persistence.*;
import model.*;
/**
 *
 * @author x00139120
 */
public class TestEmployeeDB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        EmployeeOperations eo = new EmployeeOperations();
        eo.openDB();
        eo.dropContactSequence();
        eo.dropEmployeeSequence();
        eo.dropPTTable();
        eo.dropFTTable();
        eo.dropContactTable();
        eo.dropEmployeeTable();       
        eo.createEmployeeSequence();
        eo.createContactSequence();
        eo.createEmployeetable();
        eo.createContactTable();
        eo.createFTtable();
        eo.createPTtable();
        
        eo.fillTables();

        PersistenceOperations po = new PersistenceOperations();

        while (true) {
            System.out.println("Please press 1 to add a new employee");
            System.out.println("Please press 2 to view all employees");
            System.out.println("Please press 3 to view all PT employees");
            System.out.println("Please press 4 to view all FT employees");
            System.out.println("Please press 5 to delete an employee using JPA method");
            System.out.println("Please press 6 to add a new contact for an employee");
            System.out.println("Please press 7 to view contacts of an employee");
            System.out.println("Please press 8 to delete a contact");
            System.out.println("Press 9 to quit");

            int choice = in.nextInt();
            in.nextLine();

            switch (choice) {
                case 1:
                     System.out.println("please enter the name of employee "
                            + "you wish to add"); 
                    String name=in.nextLine();
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
                    if(type.equals("FT")){
                        System.out.println("Pleaes enter the salary for this employee");
                        double sal = in.nextDouble();
                        po.addFTEmployee(name,sdate,sal);
                    }else if(type.equals("PT")){
                        System.out.println("Pleaes enter the rate for this employee");
                        double rate = in.nextDouble();
                        System.out.println("Pleaes enter the hrs for this employee");
                        double hrs = in.nextDouble();
                        po.addPTEmployee(name,sdate,hrs,rate);
                    }
                    break;
                case 2:
                    po.showAllEmployees();
                    break;
                case 3:
                    po.showAllPT();
                    break;
                case 4:
                    po.showAllFT();
                    break;
                case 5:
                    System.out.println("please enter the id of the employee you "
                            + "wish to delete");
                    int eid = in.nextInt();
                    in.nextLine();
                   if (po.findEmployee(eid) != null) {
                       po.deleteEmployee(eid);
                   }
                    break;
                case 6:
                    System.out.println("Please enter the id for the employee you wish to add a contact to");
                    int id = in.nextInt();
                    in.nextLine();
                    Employee e = po.findEmployee(id);
                    if(e!=null){
                    System.out.println("Please enter the name of the contact");
                    String cname = in.nextLine();
                    System.out.println("Please enter the contact address");
                    String address = in.nextLine();
                    System.out.println("Please enter the phone number of the contact");
                    String phone = in.nextLine();
                    System.out.println("Please enter the email of the contact");
                    String email = in.nextLine();
                    Contact c = new Contact(cname,address,phone,email);
                    po.addContact(e,c);
                    }
                    break;  
                case 7:
                    po.showAllContacts();
                    break;
                case 8:
                    System.out.println("Please enter the id of the employee who's contact you wish to delete");
                    int empid = in.nextInt();
                    Employee emp = po.findEmployee(empid);
                    if(emp!=null){
                        System.out.println("Please enter the id of the contact you wish to delete");
                        int cid = in.nextInt();
                        in.nextLine();
                         po.deleteContact(cid,empid);
                    }
                    break;
                case 9:
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
