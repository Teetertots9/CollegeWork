/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;
import java.util.Scanner;
/**
 *
 * @author x00139120
 */
public class Exercise2 {
  
    public static void main( String [] args){
        Scanner in = new Scanner(System.in);
        //CONSTANTS
        final double PRIORITY_L = 12.00, PRIORITY_B = 15.75, STANDARD_L = 10.50, STANDARD_B = 13.75, POUND_P = 1.25, POUND_S = 1.00;
        //INPUTS AND OUTPUTS
        String packageType, service;
        int weight = 0;
        double price = 0;
        //ALGORITHM
        System.out.println("Please enter type of package(letter or box)");
            packageType = in.nextLine();
            packageType = packageType.toLowerCase();
        System.out.println("Please enter type of service(priority or standard)");
            service = in.nextLine();
            service = service.toLowerCase();
            //
            if(packageType.equals("box")){
                System.out.println("Please enter box weight in pounds(whole numbers only, round up)");
                weight = in.nextInt();
            }
            else if(packageType.equals("letter")){
                System.out.println("Please enter box weight in ounces(whole numbers only, round up)");
                weight = in.nextInt();
            }
        if(packageType.equals("letter")){
            if(service.equals("priority")){
                price = PRIORITY_L;
            }
            else if(service.equals("standard")){
                price = STANDARD_L;
            }
            else{
                price = 0.00;
                service = "N/A";
            }
        }    
        else if(packageType.equals("box")){
            if(service.equals("priority")){
                price = PRIORITY_B + ((weight - 1) * POUND_P);
                weight *= 16;
            }
            else if(service.equals("standard")){
                price = STANDARD_B + ((weight-1) * POUND_S);
                weight *= 16;
            }
            else{
                price = 0.00;
                service = "N/A";
            }
        }
        else{
            packageType = "Invalid Package Type";
            price = 0.00;
            weight = 0;
            service = "N/A";
        }
        System.out.printf("The fee is %.2f for a package with %nType: %s%nService: %s%nOunces: %d%n", price, packageType, service, weight); 
        }
}