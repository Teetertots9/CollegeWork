/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca2sdev2;

/**
 *
 * @ANDREW TEETERS x00139120
 */
public class TestClub {

    public static void main(String[] args) {
        //Creating the object
        CommitteeMember member1; 
        member1 = new CommitteeMember("John Smith", "FG2001", 1985, 2);
        //Getting the discount rate, the fees and the names of the committees
        System.out.println("\t\tClub Account System");
        System.out.println("Member : "+ member1.getID());
        member1.populateCommittees();
        member1.calcDiscountRate();
        member1.calcFee();
        //Printing the fees
        System.out.println("");
        System.out.printf("%s has a fee due of €%.2f", member1.getID(), member1.getFee());
        System.out.println("");
        //Paying the fees
        member1.payMembership(100);
        member1.payMembership(30);
        //Printing outrstanding fees and details
        System.out.println("");
        member1.printOutstanding();
        
        if (member1.getFee() != 0) {
            System.out.println("");
            System.out.println("Fee monies still outstanding");
        } else {
            System.out.println("");
            System.out.println("Fee monies have been paid");
        }
    }
}
