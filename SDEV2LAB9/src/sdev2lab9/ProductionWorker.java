/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdev2lab9;

/**
 *
 * @author x00139120
 */
public class ProductionWorker extends Employee{
    final private int DAY_SHIFT = 1;
    final private int NIGHT_SHIFT = 2;
    private double payRateDay;
    private double payRateNight;
    private double[] dailyPay;
    
   public ProductionWorker(){
       super();
       payRateDay = 0;
       payRateNight = 0;
       dailyPay = new double[5];
   } 
   public ProductionWorker(String n, String no, String da, double rateD, double rateN, int dayW){
       super(n,no,da);
       payRateDay = rateD;
       payRateNight = rateN;
       dailyPay = new double[dayW];
   }
   public void calculatePay(int dayNo, int hoursW, int shiftType){
       if (shiftType == DAY_SHIFT) {
           dailyPay[dayNo] = hoursW * payRateDay;
       }
       else if(shiftType == NIGHT_SHIFT){
           dailyPay[dayNo] = hoursW * payRateNight;
       }
       
   }
   public double totalPay(){
       double totalPay = 0;
       for (int i = 0; i < dailyPay.length; i++) {
          totalPay += dailyPay[i]; 
       }
       return totalPay;
   }
   public void printPay(){
       for (int i = 0; i < dailyPay.length; i++) {
           System.out.printf("Day: %d Pay: %.2f%n", (i+1), dailyPay[i]);
       }
   }
   public void print(){
       super.print();
       System.out.printf("Total Pay: %.2f%n", totalPay());
       printPay();
   }
}
