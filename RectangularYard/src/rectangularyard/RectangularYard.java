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
public class RectangularYard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        //data
        double lengthY, widthY, lengthH, widthH;
        double timeCutGrass;
        //Input
            System.out.println("Please enter the length of the yard");
                  lengthY = in.nextDouble();
            System.out.println("Please enter the width of th yard");
                    widthY = in.nextDouble();
            System.out.println("Please enter the length of teh house");
                    lengthH = in.nextDouble();
            System.out.println("Please enter the width of the house");        
                    widthH = in.nextDouble();
        //Process
            timeCutGrass = (((lengthY * widthY) - (lengthH * widthH))/2);
        //output
            System.out.println("The time it will take to cut the grass is:" + timeCutGrass);
        
        
        
    }
    
}
