/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11sdev2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
@ANDREW TEETERS & KEVIN 0'TOOLE X00139120 X00149930
*/
public class ArrayListStudentResult {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numStudents;
        int index;
        double average;
        ArrayList<String> studentNames = new ArrayList<String>();
        ArrayList<Double> studentResults = new ArrayList<Double>();
        ArrayList<String> aboveAverage;

        System.out.print("Please enter the number of students to process: ");
        numStudents = in.nextInt();
        in.nextLine();
        System.out.println("");
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Please enter student " + (i + 1) + " name: ");
            studentNames.add(in.nextLine());
            System.out.print("Please enter " + studentNames.get(i) + "'s result: ");
            studentResults.add(in.nextDouble());
            in.nextLine();
        }
        System.out.println("");
        print(studentNames, studentResults);
        System.out.println("");
        System.out.print("Please enter the name of a student you wish to remove from the array: ");
        index = studentNames.indexOf(in.nextLine());

        if (index == -1) {
            System.out.println("Student Not Found");
        } else {
            studentNames.remove(index);
            studentResults.remove(index);
        }
        System.out.println("");
        print(studentNames, studentResults);

        average = calcAverage(studentResults);

        aboveAverage = getAboveAverage(studentNames, studentResults, average);
        System.out.println("");
        if (aboveAverage.size() == 0) {
            System.out.println("No student scored above the average");
        } else {

            System.out.println("Array List of students that scored above the average: ");
            print(aboveAverage);
        }
    }

    public static void print(ArrayList<String> names, ArrayList<Double> results) {
        for (int i = 0; i < names.size(); i++) {
            System.out.printf("Student %s has a result of %.2f%n", names.get(i), results.get(i));

        }
    }

    public static void print(ArrayList<String> names) {
        for (String s : names) {
            System.out.println(s);
        }
    }

    public static double calcAverage(ArrayList<Double> results) {
        double average = 0;

        for (Double d : results) {
            average += d;
        }
        if (results.size() != 0) {

            average /= results.size();
            return average;
        } else {
            return 0.0;
        }
    }

    public static ArrayList<String> getAboveAverage(ArrayList<String> names, ArrayList<Double> results, double average) {
        ArrayList<String> namesAbove = new ArrayList<String>();
        for (int i = 0; i < names.size(); i++) {
            if (results.get(i) > average) {
                namesAbove.add(names.get(i));
            }
        }
        return namesAbove;
    }

}
