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
public class Lab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        String symbolInput;
        
        System.out.println("Please enter the symbol for a logical operator, &&,||, !");
            symbolInput = in.nextLine();
            
        if(symbolInput.equals("&&"))
        {    
            System.out.println("The logical Operator is AND");
            }
        else if(symbolInput.equals("||"))
        {
            System.out.println("The logical Operator is OR");
        }
        else if(symbolInput.equals("!"))
        {
            System.out.println("The logical operator is NOT");
        }
        else
        {
            System.out.println("Could not recognise logical operator " + symbolInput);
        }
    }
    
}
