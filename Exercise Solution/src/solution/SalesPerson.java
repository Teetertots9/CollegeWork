/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution;

/**
 *
 * @author pmage_000
 */
public class SalesPerson extends Employee{
    private double[] sales;
    
    public SalesPerson(String name,int num,double sal,int numDays)
    {
        super(name,num,sal);
        sales = new double[numDays];
    }
    public void fillSales(int dayNumber,double salesAmt)
    {
        sales[dayNumber]=salesAmt;
    }
    @Override
    public void print()
    {
        double total=0.0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        int zeroSales=0;


        super.print();
        for(int i=0;i<sales.length;i++)
        {
            if(sales[i]>max)
                max = sales[i];

            if(sales[i]<min)
                min = sales[i];

            if(sales[i] == 0)
                zeroSales++;

            total += sales[i];
        }
        System.out.printf("Total Sales is:€%,.2f",total);
        System.out.printf("%nMax Sales is:€%,.2f",max);
        System.out.printf("%nMin Sales is:€%,.2f",min);
        System.out.println("\nNumber of days with no sales is:"+zeroSales);
    }
    
}
