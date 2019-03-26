/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solutionArrayList;

import java.util.ArrayList;


/**
 *
 * @author pmage_000
 */
public class SalesPerson extends Employee{
    
    private ArrayList<Double> sales = new ArrayList<>();
 
    
    public SalesPerson(String name,int num,double sal,int numDays)
    {
        super(name,num,sal);
        
    }
    public void fillSales(double salesAmt)
    {
        sales.add(salesAmt);
    }
    @Override
    public void print()
    {
        double total=0.0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        int zeroSales=0;


        super.print();
        for (Double sale : sales) {
            if (sale > max) {
                max = sale;
            }
            if (sale < min) {
                min = sale;
            }
            if (sale == 0) {
                zeroSales++;
            }
            total += sale;
        }
        System.out.printf("Total Sales is:€%,.2f",total);
        System.out.printf("%nMax Sales is:€%,.2f",max);
        System.out.printf("%nMin Sales is:€%,.2f",min);
        System.out.println("\nNumber of days with no sales is:"+zeroSales);
    }
    
}
