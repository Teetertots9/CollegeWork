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
 * @ANDREW TEETERS & KEVIN 0'TOOLE X00139120 X00149930
 */
public class ArrayListInts {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sizeArray;
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        System.out.print("Please enter the amount of integers you wish to enter: ");
        sizeArray = in.nextInt();

        for (int i = 0; i < sizeArray; i++) {
            System.out.print("Please enter number " + (i + 1) + " : ");
            numbers.add(in.nextInt());
        }
        
        print(numbers);
        numOfNegatives(numbers);
        evenCount(numbers);
        oddCount(numbers);

    }
    
    public static void print(ArrayList<Integer> integer){
        System.out.println("List of Numbers in Array:");
        for (Integer i:integer) {
            System.out.println(i);
            
        }
    }
    public static void numOfNegatives(ArrayList<Integer> integer){
        int count = 0;
        for(Integer i:integer){
            if(i < 0){
               count++;
            }
        }
        System.out.println("Total number of Negative numbers: "  + count);
    }
    public static void evenCount(ArrayList<Integer> integer){
        int count = 0;
        for(Integer i: integer){
            if(i%2 == 0){
                count++;
            }
        }
        System.out.println("Total number of Even numbers: " + count);
    }
     public static void oddCount(ArrayList<Integer> integer){
        int count = 0;
        for(Integer i: integer){
            if(i%2 != 0){
                count++;
            }
        }
        System.out.println("Total number of Odd numbers: " + count);
    }

}
