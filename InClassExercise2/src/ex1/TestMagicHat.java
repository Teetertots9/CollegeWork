/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

/**
 *
 * @author x00139120
 */
public class TestMagicHat {
    public static void main(String[] args) {
        MagicHat m1 = new MagicHat("Gray Hat");
        System.out.println(m1);
        
        MagicHat m2 = new MagicHat("Black Hat");
        System.out.println(m2);
        
        MagicHat m3 = new MagicHat("Baseball Cap");
        System.out.println(m3);
        
        MagicHat.Rabbit r = new MagicHat.Rabbit();
        System.out.println("This is an independant rabbit: "+ r);
    }
}
