/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg5;
import java.util.Scanner;
/**
 *
 * @author x00139120
 */
public class Exercise3 {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int penceEntered;
      double euroRecieved;
      final double EXCHANGE = 1.27;
      
        System.out.println("Please enter the value of a pence coin");
            penceEntered = in.nextInt();
            euroRecieved = penceEntered*EXCHANGE;
            euroRecieved = euroRecieved / 100;
        switch (penceEntered)
        {    
            case 1:
                System.out.printf("You entered %d in pence and recieved %.2f in euro ", penceEntered, euroRecieved);
                    break;
            case 2:
                System.out.printf("You entered %d in pence and recieved %.2f in euro ", penceEntered, euroRecieved);
                    break;
            case 5:
                System.out.printf("You entered %d in pence and recieved %.2f in euro ", penceEntered, euroRecieved);
                    break;
            case 10:
                System.out.printf("You entered %d in pence and recieved %.2f in euro ", penceEntered, euroRecieved);
                    break;
            case 20:
                System.out.printf("You entered %d in pence and recieved %.2f in euro ", penceEntered, euroRecieved);
                    break;
            case 50:
                System.out.printf("You entered %d in pence and recieved %.2f in euro ", penceEntered, euroRecieved);
                    break;
            default:
                System.out.println("Wrong value entered");
        } 
    }
}
