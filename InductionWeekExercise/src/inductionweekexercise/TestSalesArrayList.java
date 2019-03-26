/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inductionweekexercise;
import java.util.Scanner;
import java.util.*;
/**
 *
 * @author x00139120
 */
public class TestSalesArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name;
        int years, noDays;
        double salary;
        double salesIn;
        ArrayList<String> salesPeople = new ArrayList<String>();
       
        
        System.out.println("Enter name");
        name = in.nextLine();
        System.out.println("Enter years of service");
        years = in.nextInt();
        System.out.println("Enter Salary");
        salary = in.nextDouble();
        System.out.println("Enter number of days of sales");
        noDays = in.nextInt();
        
        salesPeople.add(0,name);
        
    }
}
