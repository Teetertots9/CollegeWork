/*
 ANDREW TEETERS X00139120
 */
package sdev2ca1;

import java.util.Scanner;

/**
 *
 * @author x00139120
 */
public class TestStudent {

    public static void main(String[] args) {
//variables       
        Scanner in = new Scanner(System.in);
        String nameIn;
        String stuNoIn;
        int resultIn;
        Student student1;
        Student student2;
//Student 1
        student1 = new Student("Perdita Stevens", "X0002333");
        student1.setResult(80);
        student1.calcGrade();
        student1.print();
        System.out.println("");
//Student 2
        System.out.println("Please enter the name of the student");
        nameIn = in.nextLine();
        System.out.println("Please enter the student no of " + nameIn + " ,Please use an uppercase X");
        stuNoIn = in.nextLine();
        student2 = new Student(nameIn, stuNoIn);
        System.out.println("Please enter the result " + nameIn + " recieved, between 0-100");
        resultIn = in.nextInt();
        while (student2.setResult(resultIn) == false) {
            System.out.println("Non valid result entered, please enter result between permissible range, 0-100");
            resultIn = in.nextInt();
        }
        student2.calcGrade();
        System.out.println("");
        student2.print();
        System.out.println("");
        if (student1.getGPA() < student2.getGPA()) {
            System.out.println(student2.getName() + " has a higher GPA");
            student2.print();
        } else if (student1.getGPA() > student2.getGPA()) {
            System.out.println(student1.getName() + " has a higher GPA");
            student1.print();
        } else {
            System.out.println(student1.getName() + " and " + student2.getName() + " have equal GPAs.");
            System.out.println("");
            student1.print();
            System.out.println("");
            student2.print();
            System.out.println("");
        }
    }
}
