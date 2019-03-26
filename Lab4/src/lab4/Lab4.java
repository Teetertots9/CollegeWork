/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;
import java.util.Scanner;
/**
 *
 * @author Andrew Teetersx00139120
 */
public class Lab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        //variables
                
                String idNumber, name, address, maritalStatus, dummy, password, password2;                
                double grossPay = 0, netPay = 0, totalTaxPaid = 0;
                final int ALLOWANCEU50, ALLOWANCEO50, MINPAY;               
                final double SINGLETAX, MARRIEDTAX, CUTOFF;               
                ALLOWANCEU50 = 25000;               
                ALLOWANCEO50 = 20000;               
                MINPAY = 35000;                
                SINGLETAX = 0.20;               
                MARRIEDTAX = 0.23;                     
                CUTOFF = 50000.00;               
                double afterAllowance = 0;               
                char maritalStatusCode;
        
        
            System.out.println("Please enter your password");
            password = in.nextLine();
            System.out.println("Please enter it again");
            password2 = in.nextLine();
            
            if(password2.equals(password)){
              //if password is wrong this whole section won't run  
                    System.out.println("Please enter your employee id number");
                    idNumber = in.nextLine();
                    System.out.println("Please enter your name");
                    name = in.nextLine();
                    System.out.println("Please enter your address");
                    address = in.nextLine();
                    System.out.println("Please enter your marital status");
                    maritalStatus = in.nextLine();
                    maritalStatusCode = maritalStatus.charAt(0);
                    System.out.println("Please enter your gross pay");
                    grossPay = in.nextDouble();

                    if (grossPay < MINPAY){ // if the input gross pay is loower than the minimum then it will stop the program
                        System.out.println("Below minimum entered");
                        System.exit(1);
                    }
                    
                    else if(grossPay < CUTOFF){
                        afterAllowance = grossPay - ALLOWANCEU50;
                    }
                    else{
                        afterAllowance = grossPay - ALLOWANCEO50;
                    }
                    if( maritalStatusCode == 's' || maritalStatusCode == 'S'){
                        totalTaxPaid = (grossPay - afterAllowance) * SINGLETAX;
                    }
                    else if ( maritalStatusCode == 'm' || maritalStatusCode == 'M'){
                        totalTaxPaid = (grossPay - afterAllowance) * MARRIEDTAX;
            }    
                    else {
                        System.out.println("Wrong marital status entered");
                        System.exit(1);
                    }
                    netPay = grossPay - totalTaxPaid;
            
         
                    System.out.printf("Your name is %s, you live in %s, and you are %s%n", name, address, maritalStatus);
                    System.out.printf("Your gross pay is: %.2f, your net pay is: %.2f, and your total tax paid is: %.2f%n", grossPay, netPay, totalTaxPaid);
             
            }
           
            else{
                System.out.println("Wrong password entered");
            }
            
    }       
    
}
