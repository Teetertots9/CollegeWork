/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdev2lab1week4;

/**
 *
 * @author x00139120
 */
public class Student {
    //variables
    private String studentID, name, subject;
    private int ca1result, ca2result;
    //getters
    public int getCA1(){
        return ca1result;
    }
    public int getCA2(){
        return ca2result;
    }
    //setters
    public void setStudentID(String newStudentID ){
        studentID = newStudentID;
    }
    public void setName(String newName){
        name = newName;
    }
    public void setSubject(String newSubject){
        subject = newSubject;
    }
    public void setCA1(int newCA1){
        ca1result = newCA1;
    }
    public void setCA2(int newCA2){
        ca2result = newCA2; 
    }
    //print method
    public void print(){
        System.out.println("Student ID:  "+ studentID);
        System.out.println("Name:  "+ name);
        System.out.println("Subject:  "+ subject);
        System.out.println("CA1 Result:  "+ ca1result);
        System.out.println("CA2 Result:  "+ ca2result);
    }
}
