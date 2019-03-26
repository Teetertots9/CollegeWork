/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;
import Database.*;
import java.util.Calendar;
import java.util.Scanner;
import Classes.*;
public class TestDB {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        EmployeeOperations eo = new EmployeeOperations();
        eo.openDB();
        eo.dropCustomerSequence();
        eo.dropEmployeeSequence();
        eo.dropManagerSequence();
        eo.dropPTEmployeeTable();
        eo.dropFTEmployeeTable();
        eo.dropCustomerTable();
        eo.dropEmployeeTable(); 
        eo.dropManagerTable();
        eo.createManagerSequence();
        eo.createEmployeeSequence();
        eo.createCustomerSequence();
        eo.createManagerTable();
        eo.createEmployeetable();
        eo.createCustomerTable();
        eo.createFTtable();
        eo.createPTtable();
        
        eo.fillTables();

        PersistenceOperations po = new PersistenceOperations();
        
        while (true) {
            System.out.println("Please press 1 to view all Managers");
            System.out.println("Please press 2 to view all Employees for a Manager");
            System.out.println("Please press 3 to view all Customers for an Employee");
            System.out.println("Please press 4 to view all PT employees");
            System.out.println("Please press 5 to view all FT employees");
            System.out.println("Please press 6 to add a Manager");
            System.out.println("Please press 7 to add a new Employee for a Manager");
            System.out.println("Please press 8 to add a new Customer for a Employee");
            System.out.println("Please press 9 to delete a Manager");
            System.out.println("Please press 10 to delete an Employee");
            System.out.println("Please press 11 to delete a Customer");
            System.out.println("Press 0 to quit");

            int choice = in.nextInt();
            in.nextLine();

            switch (choice) {
                case 1:
                    po.showAllManagers();
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Please enter the id of the manager who's employees you wish to view");
                    int midIn = in.nextInt();
                    po.showAllEmployees(midIn);
                    System.out.println("");
                    break;
                case 3:
                    po.showAllCustomers();
                    System.out.println("");
                    break;    
                case 4:
                    po.showAllFT();
                    System.out.println("");
                    break;   
                case 5:
                    po.showAllPT();
                    System.out.println("");
                    break;    
                case 6:
                    System.out.println("Please enter the manager's name");
                    String mName = in.nextLine();
                    System.out.println("Please eneter the manager's salary");
                    double mSalary = in.nextDouble();
                    String s = in.nextLine();
                    po.addManager(mName, mSalary);
                    System.out.println("Manager added");
                    break;
                case 7:
                    System.out.println("Please enter the ID for the manager of the Employee");
                    int mId1 = in.nextInt();
                    in.nextLine();
                    Manager m1 = po.findManager(mId1);
                    if(m1!=null){
                        
                    
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
                        po.addFTEmployee(name,sdate,sal,m1);
                    }else if(type.equals("PT")){
                        System.out.println("Pleaes enter the rate for this employee");
                        double rate = in.nextDouble();
                        System.out.println("Pleaes enter the hrs for this employee");
                        double hrs = in.nextDouble();
                        po.addPTEmployee(name,sdate,hrs,rate,m1);
                    }
                    }
                    break;
                case 8:
                    System.out.println("Please enter the id for the employee you wish to add a contact to");
                    int id = in.nextInt();
                    in.nextLine();
                    Employee e = po.findEmployee(id);
                    if(e!=null){
                    System.out.println("Please enter the name of the Customer");
                    String cname = in.nextLine();
                    System.out.println("Please enter the Customer address");
                    String address = in.nextLine();
                    System.out.println("Please enter the year of "
                            + "the purchase");
                    int year = in.nextInt();
                    in.nextLine();
                    System.out.println("Please enter the month of "
                            + "the purchase");
                    int month = in.nextInt();
                    in.nextLine();
                    System.out.println("Please enter the day of "
                            + "the purchase");
                    int day = in.nextInt();
                    in.nextLine();
                    Calendar pdate = Calendar.getInstance();
                    pdate.set(year, month, day);
                    System.out.println("Please enter the price of the purchase");
                    double price = in.nextDouble();
                    in.nextLine();
                    Customer c = new Customer(cname,address,pdate,price);
                    c.setEmp(e);
                    po.addCustomer(e,c);
                    }
                    break;
                case 9:
                    System.out.println("Please enter the id of the manager you wish to delete");
                    int midd = in.nextInt();
                    Manager md = po.findManager(midd);
                    if(md!=null) {
                        po.deleteManager(midd);
                    }
                    break;
                case 10:
                    System.out.println("Please enter the id of the manager who's employee you wish to delete");
                    int mid1 = in.nextInt();
                    Manager m = po.findManager(mid1);
                    if(m!=null){
                        System.out.println("Please enter the id of the employee you wish to delete");
                        int eid = in.nextInt();
                        in.nextLine();
                         po.deleteEmployee(eid,mid1);
                    }
                    break;
                case 11:
                    System.out.println("Please enter the id of the employee who's customer you wish to delete");
                    int empid1 = in.nextInt();
                    Employee emp1 = po.findEmployee(empid1);
                    if(emp1!=null){
                        System.out.println("Please enter the id of the customer you wish to delete");
                        int cid = in.nextInt();
                        in.nextLine();
                         po.deleteCustomer(cid,empid1);
                    }
                    break;
                case 0:
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
