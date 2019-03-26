/*
 * SQT Lab 4
 */
package sqtlab4.grades;

import java.util.Scanner;

/**
 *
 * @author kanolan
 */
public class GradesMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Application logic here
        Scanner scanner = new Scanner(System. in); 
        
        System.out.println("******                       *******    ");
        System.out.println("****** Grades functionality  *******    ");
        
        System.out.println("Please enter your exam percentage: " );
        int exam = Integer.parseInt( scanner.nextLine() );
        System.out.println("Please enter your CA percentage: " );
        int ca = Integer.parseInt( scanner.nextLine() );
        
        Grades grades = new Grades(exam, ca);
        System.out.println(grades.calculateGradeCategory());
    }
    
}
