/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;
import java.util.Scanner;
/**
 *
 * @author x00139120
 */
public class question2 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double number = 0, total = 0, average = 0;
    int count = 1;
        System.out.println("Please enter the first number to be added");
        number = in.nextDouble();
    while(count<=4){
        total += number;
        count++;
        System.out.println("Please enter the next number");
        number = in.nextDouble();
    }
        average = total / count;
        System.out.println("The average is: " + average);
    
    }
}
