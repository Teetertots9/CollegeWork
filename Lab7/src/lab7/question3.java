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
public class question3 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int number = 1, numberEven = 0, numberOdd = 0;
    
    while(number<=20){
            if(number%2==0){
                numberEven+=number;
            }
            else{
                numberOdd+=number;
            }
        number++;  
    }
        System.out.printf("The total for the odd and even number between 0 and 20 are %n%nOdd: %d%nEven: %d%n" ,numberOdd, numberEven);
    
    }
}
