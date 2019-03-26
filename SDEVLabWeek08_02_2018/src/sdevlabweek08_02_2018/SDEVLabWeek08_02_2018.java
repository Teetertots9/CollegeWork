/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdevlabweek08_02_2018;

import java.util.Random;

/**
 *
 * @author x00139120
 */
public class SDEVLabWeek08_02_2018 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand = new Random();
        //Variables
        int[][] weather = new int[12][31];
        double[] averageByMonth = new double[12];
        int[] hottestDayM = new int[12];
        int[] coldestDayM = new int[12];
        int maxIndex = 0, minIndex = 0;
        //Inputs
        for (int i = 0; i < weather.length; i++) {
            for (int j = 0; j < weather[0].length; j++) {
                weather[i][j] = rand.nextInt(26);
                averageByMonth[i] += weather[i][j];
            }
        }
        for (int i = 0; i < weather.length; i++) {
            maxIndex = 0;
            for (int j = 0; j < weather[0].length; j++) {
                if (maxIndex < weather[i][j]) {
                    maxIndex = weather[i][j];
                    hottestDayM[i] = j;
                }
            }
        }
        for (int i = 0; i < weather.length; i++) {
            minIndex = 0;
            for (int j = 0; j < weather[0].length; j++) {
                if (minIndex > weather[i][j]) {
                    minIndex = weather[i][j];
                    coldestDayM[i] = j;
                }
            }
        }
        for (int i = 0; i < weather.length; i++) {
            System.out.printf("Month %d ", i + 1);
            for (int j = 0; j < weather[0].length; j++) {
                System.out.printf(" %d ", weather[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
        
        for (int i = 0; i < weather.length; i++) {
            System.out.printf("The hottest day of month %d is %d%n", (i+1), weather[i][hottestDayM[i]]);
            System.out.printf("The coldest day of month %d is %d%n", (i+1), weather[i][coldestDayM[i]]);
            System.out.printf("The average temperature of month %d is %.2f%n", (i+1), (averageByMonth[i]/weather[0].length));
            System.out.printf("The temperature differnce between the hottest and coldest day of month %d is %d%n%n", (i+1), (weather[i][hottestDayM[i]]-weather[i][coldestDayM[i]]));
        }

    }

}
