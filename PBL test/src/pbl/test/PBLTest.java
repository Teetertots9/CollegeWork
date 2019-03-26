/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbl.test;
import java.util.Scanner;
/**
 *
 * @author x00139120
 */
public class PBLTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner in = new Scanner(System.in);
    int height1 = 0;  
        System.out.println("Enter height");
    height1 = in.nextInt()* 12;
    height1 += in.nextInt();
    height1 = (height1 * 12/13);
        System.out.println("heigth is " + height1);
       
    }
    
}
