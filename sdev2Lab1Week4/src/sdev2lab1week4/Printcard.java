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
public class Printcard {
    //Variables
    private String accountNumber, password;
    private int numberCredits;
    //setters
    public void setAccNum(String newAcc){
        accountNumber = newAcc;
    }
    public void setPassword(String newPassword){
        password = newPassword;
    }
    public void setCred(int newCred){
        numberCredits = newCred;
    }
    //getter
    public int getCred(){
        return numberCredits;
    }
    //print method
    
    public void print(){
        System.out.println("Account Number:  "+ accountNumber);
        System.out.println("Password:  "+ password);
        System.out.println("Number of Credits:  "+ numberCredits);
    }
    
}
