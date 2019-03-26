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
public class TestStudent {

    public static void main(String[] args) {
        Student student1 = new Student();

        student1.setStudentID("x00139120");
        student1.setName("Andrew Teeters");
        student1.setSubject("Computing");
        student1.setCA1(90);
        student1.setCA2(85);

        Printcard mycard = new Printcard();
        mycard.setAccNum("x00139120");
        mycard.setPassword("password12345");
        mycard.setCred(200);

        student1.print();
        System.out.println("");
        
        mycard.print();       
        System.out.println("");
        
        if((student1.getCA1() + student1.getCA2())/2 >70){
            mycard.setCred(400);
            System.out.println("Number of Credits is now:  "+mycard.getCred());
        }
    }
}
