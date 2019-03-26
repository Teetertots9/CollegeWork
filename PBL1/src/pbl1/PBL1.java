/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbl1;
import java.util.Scanner;
/**
 *
 * @author x00139120
 */
public class PBL1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);   
        //data
        int number1;
        int number2;
        int number3;
        int total;
        double average;
        
        //process
        System.out.println("Please enter the first number");
        number1 = 6;
        System.out.println("Please enter the second number");
        number2 = 2;
        System.out.println("Please enter the third number");
        number3 = 15;
        total = number1 + number2 + number3;
        
        average = total /3.0;
       
       //output
       System.out.println("Here is the average of the three numbers:" + average);
    }
    
}
