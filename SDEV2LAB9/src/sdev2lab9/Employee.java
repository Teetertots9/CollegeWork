/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdev2lab9;

/**
 *
 * @author x00139120
 */
public class Employee {

    private String name;
    private String empNo;
    private String hireDate;

    public Employee() {
        name = "";
        empNo = "";
        hireDate = "";
    }

    public Employee(String nameIn, String noIn, String dateIn) {
        hireDate = dateIn;
        name = nameIn;
        
        if (checkNumber(noIn) == true) {
            empNo = noIn;
        }
        else{
             empNo = "";
        }
    }
    private boolean checkNumber(String noIn){
            boolean result;
            if (noIn.charAt(0) == 'e') {
                result = true;
            }
            else{
                result = false;
            }
            return result;            
        }

    public String getName() {
        return name;
    }

    public String getNo() {
        return empNo;
    }
    public String getDate(){
        return hireDate;
    }
    public void setName(String nameIn){
        name = nameIn;
    }
    public void setNo(String noIn){
        empNo = noIn;
    }
    public void setDate(String dateIn){
        hireDate = dateIn;
    }
    
    public void print(){
        System.out.println("Name: "+ name);
        System.out.println("Employee Number: "+ empNo);
        System.out.println("Hire Date: "+ hireDate);
    }
    
}
