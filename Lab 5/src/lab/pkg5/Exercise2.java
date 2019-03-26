/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg5;
import java.util.Scanner;
/**
 *
 * @author x00139120
 */
public class Exercise2 {
    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    double radius, area;
    
    System.out.println("Please enter the radius of a circle");
        radius = in.nextDouble();
        
    if (radius < 0)
    {
        System.out.println("ERROR: Negative Numeber Dectected" + radius);
    }
    else
    {
        area = Math.PI * Math.pow(radius,2);
        System.out.println("The area is " + area);
    }
    
    
    }
}
