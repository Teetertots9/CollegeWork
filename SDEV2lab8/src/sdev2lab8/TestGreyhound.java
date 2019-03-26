/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdev2lab8;

/**
 *
 * @author x00139120
 */
public class TestGreyhound {
    
    public static void main(String[] args) {
        Greyhound g1 = new Greyhound(1234, "Mr Flash", 2, "Tom Foley", "The Late Late Show", 3, 5);
        Greyhound g2 = new Greyhound(6788, "Mr. Jones", 3, "Icarus", "Isis", 2, 5);
        
        g1.updateWinningRecord(1, true);
        g1.updateWinningRecord(2, true);
        g1.updateWinningRecord(3, false);
        
        g2.updateWinningRecord(1, true);
        g2.updateWinningRecord(2, false);
        
        g1.displayDetails();
        System.out.println("");
        g2.displayDetails();
        System.out.println("");
        if (g1.getRacesWon() > g2.getRacesWon()) {
            System.out.println(g1.getName() + " has won the most races");
        }
        else if(g1.getRacesWon() < g2.getRacesWon()) {
            System.out.println(g2.getName() + " has won the most races");
        }
        else if (g1.getRacesWon() == g2.getRacesWon()) {
            System.out.println("Both greyhounds won an equal number of races");
        }
        
    }
}
