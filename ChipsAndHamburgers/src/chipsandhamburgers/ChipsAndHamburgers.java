/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chipsandhamburgers;
    import java.util.Scanner;
/**
 *
 * @author Andrew Teeters x00139120
 */
public class ChipsAndHamburgers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);  
        //Data
        //Input Data
        int chipsSold, hamburgerSold;
        //Output Data
        double profitChips, profitHamburger, profitTotal;
        //Constants
        final double CHIPSCOSTP, CHIPSSELLP, HAMBCOSTP, HAMBSELLP;
        CHIPSCOSTP = 0.30;
        CHIPSSELLP = 0.90;
        HAMBCOSTP = 0.40;
        HAMBSELLP = 1.50;
        //Other Data
        double totalCostChips, totalSellChips, totalCostHamB,totalSellHamB;
        //Input
            System.out.println("Please enter the number of chips sold");
                    chipsSold = in.nextInt();
            System.out.println("Please enter the number of hamburgers sold");
                    hamburgerSold = in.nextInt();
        //Process    
            totalCostChips = chipsSold * CHIPSCOSTP;
            totalSellChips = chipsSold * CHIPSSELLP;
            totalCostHamB = hamburgerSold * HAMBCOSTP;
            totalSellHamB = hamburgerSold * HAMBSELLP;
            
            profitChips = totalSellChips - totalCostChips;
            profitHamburger = totalSellHamB - totalCostHamB;
            profitTotal = profitChips + profitHamburger;
        //Output
            System.out.println("The profit for chips is:" + profitChips);
            System.out.println("The profit for hamburgers is:" + profitHamburger);
            System.out.println("The total profit is:" + profitTotal);
       
       
          
    }
}
