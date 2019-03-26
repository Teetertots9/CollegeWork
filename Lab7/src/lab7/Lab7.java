/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;
import java.util.Scanner;
/**
 * Lab7 Question 1
 * @author Andrew Teeters x00139120
 */
public class Lab7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int count = 50, total=0;
        
        while(count<100){
            total+=count;
            System.out.println("the total is: " + total);
            count++;
        }
        System.out.println("the final total is: " + total);
        
    }
    
}
