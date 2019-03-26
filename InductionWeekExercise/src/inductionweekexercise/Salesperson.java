/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inductionweekexercise;

/**
 *
 * @author x00139120
 */
public class Salesperson extends Employee{
    private double[] sales;
    
    public Salesperson(String name, int years, double salary, int days){
        super(name,years,salary);
        
        sales = new double[days];
    }
    
    public void fillSales(int dayNo, double saleAmount){
        sales[dayNo] = saleAmount;
    }
     public void print(){
        double totalSales = 0, testSales;
        int minIndex = 0, maxIndex = 0, noSales = 0;
        testSales = sales[0];
         for (int i = 0; i < sales.length; i++) {
             totalSales += sales[i];
         }
         for (int i = 0; i < sales.length; i++) {
             if (testSales > sales[i]) {
                 minIndex = i;
                 testSales = sales[i];
             }
         }
         testSales = sales[0];
         for (int i = 0; i < sales.length; i++) {
             if (testSales< sales[i]) {
                 maxIndex = i;
                 testSales = sales[i];             }
         }
         testSales = sales[0];
         for (int i = 0; i < sales.length; i++) {
             if (sales[i] == 0) {
                 noSales++;
             }
         }
       super.print();
       System.out.println("Total Sales is: "+ totalSales );
       System.out.println("Maximum Sales is: "+ sales[maxIndex]);
       System.out.println("Minimum Sales is: "+ sales[minIndex]);
       System.out.println("Number of days with no sales is: "+ noSales);
     }
}
