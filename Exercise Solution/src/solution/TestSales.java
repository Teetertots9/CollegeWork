/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution;

import java.util.Scanner;

/**
 *
 * @author pmage_000
 */
public class TestSales {
    public static void main(String args[])  
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please enter the name of the sales person:");
        String name = in.nextLine();
        System.out.println("Please enter the number of years service for "+name);
        int years = in.nextInt();
        System.out.println("Please enter the salary for "+name);
        double sal = in.nextDouble();
        System.out.println("Please enter the number of days sales for "+name);
        int days = in.nextInt();
            
        SalesPerson s = new SalesPerson(name,years,sal,days);
        
        for (int i=0;i<days;i++)
        {
            System.out.println("Enter amount of sales for day:"+(i+1));
            double amt = in.nextDouble();
            s.fillSales(i,amt);
        }
        
        s.print();
    }
}
