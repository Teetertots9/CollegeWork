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
public class TestPrintCard {
    public static void main(String[] args) {
        Printcard print1 = new Printcard();
        
        print1.setAccNum("x00139120");
        print1.setPassword("password12345");
        print1.setCred(1000);
        
        print1.print();
    }
}
