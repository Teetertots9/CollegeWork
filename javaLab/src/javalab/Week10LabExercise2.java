/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab;
import java.util.Scanner;
/**
 *
 * @author x00139120
 */
public class Week10LabExercise2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double [] rainfall = new double[7];
        double minRain = 0;
        double maxRain = 0;
        double totalRain = 0;
        double averageRain = 0;
        int maxIndex = 0;
        int minIndex = 0;
        int count = 0;
        //input loop
        for (int i = 0; i < rainfall.length; i++) {
            System.out.println("Please enter the rainfall for day " + (i + 1) + " in centimeters");
            rainfall[i] = in.nextDouble();
            totalRain += rainfall[i];
            
            if(rainfall[maxIndex] < rainfall[i]){
                maxIndex = i;
            }
            if(rainfall[minIndex] > rainfall[i]){
                minIndex = i;
            }
                
        }
        
        
        maxRain = rainfall[maxIndex];
        minRain = rainfall[minIndex];
        averageRain = totalRain / rainfall.length;
        //output loop
        for (int i = 0; i < rainfall.length; i++) {
             if(rainfall[i] >= 3.5){
                 System.out.printf("The rainfall for day %d is over 3.5 cm at: ", (i+1));
                 System.out.println(rainfall[i] + "cm");
                    count++;
            }
             else {
                 System.out.printf("The rainfall for day %d is: ", (i+1));
                 System.out.println(rainfall[i] + "cm");
            
            }
        }
            
        System.out.printf("The maximum rain fall was %.2fcm which fell on day %d%n", maxRain, (maxIndex + 1));
        System.out.printf("The minimum rain fall was %.2fcm which fell on day %d%n", minRain, (minIndex + 1));
        System.out.println("The total rain fall for the week is: " + totalRain + "cm");
        System.out.printf("The average rain fall for the week is: %.2fcm%n", averageRain);
        System.out.printf("There were %d days where the rainfall was over 3.5cm%n", count);
        
        
    }
    
}
