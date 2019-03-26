/*ANDREW TEETERS X00139120
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca1;
import java.util.Scanner;
/**
 *
 * @Andrew Teeters x00139120
 */
public class CA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        Scanner in = new Scanner(System.in); 
            String name, pPSN;
            char ppsnl;
            int noBookSold = 0, noEmployee200 = 0;
            double valueBook = 0, grossPay = 0, netPay = 0, taxPaid = 0, weeklyWage = 0;
            final int BOOKS, BASEPAY, BOUNDARY;
            final double TAX, COMISSION;
            TAX = 0.05;
            COMISSION = 0.10;
            BOOKS = 100;
            BASEPAY = 100;
            BOUNDARY = 200;
            
        //Initial Inputs
            System.out.println("Please enter your name");
                name = in.nextLine();
            System.out.println("Please enter your Person Publin Service Number");    
                pPSN = in.nextLine();
                pPSN = pPSN.toUpperCase();
                    ppsnl = pPSN.charAt(0);
                    
                    if(ppsnl != 'P'){
                        System.out.println("Please check the Person Publin Service Number");
                            pPSN = in.nextLine();
                            pPSN = pPSN.toUpperCase();
                            ppsnl = pPSN.charAt(0);
                                 if(ppsnl != 'P'){
                                     System.out.println("Failed to recognise Person Public Service Number");  
                                 }
                                 else //if they failed to enter the PPSnumber the first time but succeeded the second time
                                 {  //Wage inputs
                                    System.out.println("Please enter your weekly wage");
                                    weeklyWage = in.nextDouble();
                                    System.out.println("Please enter the number of books sold");
                                    noBookSold = in.nextInt();
                                    System.out.println("Please enter the value of the books");
                                    valueBook = in.nextDouble();
                                    //Pay Process
                                        if(noBookSold > BOOKS)
                                        {
                                        grossPay = BASEPAY + (noBookSold * (valueBook * COMISSION));      
                                        }
                                        else
                                        {
                                        grossPay = BASEPAY;
                                        }
                                            if(grossPay > BOUNDARY)
                                            {
                                                noEmployee200++;
                                                taxPaid = grossPay * TAX;
                                                netPay = grossPay - taxPaid;
                                            }
                                            else
                                            {
                                                taxPaid = 0;
                                                netPay = grossPay;
                                            }//Output
                                System.out.printf("Your name is %S, your PPSNumber is %s, you have sold %d books, the value of said books are %.2f,%nyour gross pay is %.2f, your net pay is %.2f and the tax paid is %.2f,%nand there are %d employees that earn more than 200 euro.", name, pPSN, noBookSold, valueBook, grossPay, netPay, taxPaid, noEmployee200);                

                                             }
                                }
                    else //if they succeed entering in the PPSNumber in the first time.
                    { //Wage Inputs
                        System.out.println("Please enter your weekly wage");
                            weeklyWage = in.nextDouble();
                        System.out.println("Please enter the number of books sold");
                            noBookSold = in.nextInt();
                        System.out.println("Please enter the value of the books");
                            valueBook = in.nextDouble();
                          //Pay Process  
                        if(noBookSold > BOOKS)
                        {
                            grossPay = BASEPAY + (noBookSold * (valueBook * COMISSION));      
                        }
                        else
                        {
                            grossPay = BASEPAY;
                        }
                        
                            if(grossPay > BOUNDARY)
                            {
                                noEmployee200++;
                                taxPaid = grossPay * TAX;
                                netPay = grossPay - taxPaid;
                            }
                            else
                            {
                                taxPaid = 0;
                                netPay = grossPay;
                            }//Output
                    System.out.printf("Your name is %S, your PPSNumber is %s, you have sold %d books, the value of said books are %.2f,%nyour gross pay is %.2f, your net pay is %.2f and the tax paid is %.2f,%nand there are %d employees that earn more than 200 euro.", name, pPSN, noBookSold, valueBook, grossPay, netPay, taxPaid, noEmployee200);                
                    }        
    }
}    