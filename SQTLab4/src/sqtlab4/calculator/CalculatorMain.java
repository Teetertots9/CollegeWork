/*
 * SQT Lab 4
 */
package sqtlab4.calculator;

import java.util.Scanner;

/**
 *
 * @author kanolan
 */
public class CalculatorMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Application logic here
        Scanner scanner = new Scanner(System. in); 
        
        System.out.println("******                                   *******    ");
        System.out.println("****** Running calculator functionality  *******    ");
        Calculator calc = new Calculator();
        
        System.out.println("Please enter a number to check if it is special: " );
        int number1 = Integer.parseInt( scanner.nextLine() );
        System.out.println("-> " + calc.isSpecialNumber(number1) );
        
        
        System.out.println("Please enter a number to run an alternative calculation on it: " );
        double number2 = Double.parseDouble( scanner.nextLine() );
        System.out.println("-> " + calc.alternativeCalculate(number2) );
    }
    
}
