/*
 ANDREW TEETERS X00139120
 */
package sdev2ca1;

/**
 *
 * @author x00139120
 */
public class Student {
    //Variab;es
    private String name;
    private String studentNo;
    private int result;
    private char grade;
    private double gpa;
    
    //Constructors
    public Student(){
        name = "";
        studentNo = "";
        result = 0;
        grade = ' ';
        gpa = 0;
    }
    public Student(String nameIn, String stuNoIn){
        name = nameIn;
        if (stuNoIn.charAt(0) != 'X') {
            studentNo = "Invalid";
        }
        else{
            studentNo = stuNoIn;
        }
        result = 0;
        gpa = 0;
    }
    
    //Methods
    public String getName(){
        return name;
    }
    public double getGPA(){
        return gpa;
    }
    public boolean setResult(int resultIn){
        boolean resultSet;
        if (resultIn < 0 || resultIn > 100) {
            result = -1;
            resultSet = false;
            System.out.println("Result set unsuccessful");
        }
        else{
            result = resultIn;
            resultSet = true;
            System.out.println("Result set successfully");
        }
        return resultSet;
    }
    public void calcGrade(){
        if (result < 40) {
            grade = 'F';
            gpa = 1.0;
        }
        else if (result >=40 && result<60){
            grade = 'C';
            gpa = 2.0;
        }
        else if (result >=60 && result<80){
            grade = 'B';
            gpa = 3.5;
        }
        else if (result >=80 && result<=100){
            grade = 'A';
            gpa = 4.0;
        }
    }
    public void print(){
        System.out.println("\t  Student Details");
        System.out.println("Name:\t"+ name);
        System.out.println("Number: "+ studentNo);
        System.out.println("Result:\t"+ result);
        System.out.println("Grade:\t"+ grade);
        System.out.println("GPA:\t"+ gpa);
}
}
