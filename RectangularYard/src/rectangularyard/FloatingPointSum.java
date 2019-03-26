/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangularyard;
import java.util.Scanner;
/**
 *
 * @author x00139120
 */
public class FloatingPointSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner in = new Scanner(System.in);
        //data
        //input data
        double x,y;
        //output
        double sumXandY, diffXandY, productXandY;
        
        //input
        System.out.println("Please enter x");
            x = in.nextDouble();
        System.out.println("Please enter y");    
            y= in.nextDouble();
        //process
            sumXandY = x + y;
            diffXandY = x - y;
            productXandY = x * y;
        //output
        System.out.println("The sum of x and y is:" + sumXandY);
        System.out.println("The difference between x and y is:" + diffXandY);    
        System.out.println("The product of x and y is:" + productXandY);
    
    
    }
    
}
