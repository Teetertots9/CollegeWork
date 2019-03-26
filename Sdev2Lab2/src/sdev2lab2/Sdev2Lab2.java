/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdev2lab2;
import java.util.Random;
/**
 *
 * @author x00139120
 */
public class Sdev2Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand = new Random();
        double[][]stats = new double[3][4];
        
        double total = 0;
        
        for (int i = 0; i < stats.length; i++) {
            for (int j = 0; j < stats[0].length; j++) {
                stats[i][j] = rand.nextInt(21);
                System.out.println(stats[i][j]);
                total += stats[i][j];
            }
        }
        System.out.printf("The total is % .2f and the average is %.2f%n", total, (total/(stats.length * stats[0].length)));
    }
    
}
