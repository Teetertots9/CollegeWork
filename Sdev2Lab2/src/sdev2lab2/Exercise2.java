/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdev2lab2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author x00139120
 */
public class Exercise2 {

    public static void main(String[] args) {
        //Variables
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        int[][] studentScore = new int[5][4];
        double[] studentAverage = new double[5];
        int overallTotal = 0;
        double overallAverage = 0;
        int count = 0;
        //Algorithm
        for (int i = 0; i < studentScore.length; i++) {
            for (int j = 0; j < studentScore[0].length; j++) {
                //Inputs
                System.out.printf("Please enter the result of exam %d for student %d%n ", j + 1, i + 1);
                studentScore[i][j] = in.nextInt();
                //Used a random Number Generator at the start of testing it.
                //studentScore[i][j] = rand.nextInt(101);
                while (studentScore[i][j] > 100 || studentScore[i][j] < 0) {
                    System.out.println("Please enter a score between 0 and 100");
                    studentScore[i][j] = in.nextInt();
                }
                //Processes
                studentAverage[i] += studentScore[i][j];
                overallTotal += studentScore[i][j];
            }
            studentAverage[i] = studentAverage[i] / studentScore[0].length;
        }
        overallAverage = overallTotal / (studentScore.length * studentScore[0].length);
        //Output
        System.out.println("The overall average is " + overallAverage);

        for (int i = 0; i < studentScore.length; i++) {
            System.out.printf("The average score for student %d is %.2f%n", i + 1, studentAverage[i]);
            System.out.println("The difference between their average and the overall average is " + (studentAverage[i] - overallAverage));
            if (studentAverage[i] >= overallAverage) {
                System.out.println("Congragulations! Your average is greater than or equal to the overall average");
                count++;
            } else {
                System.out.println("Your Average is below the overall average");
            }

        }
        System.out.println("The number of students with an average greater than or equal to the overall average is " + count);
    }
}
//End of Program
