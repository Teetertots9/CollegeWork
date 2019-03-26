/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca2sdev2;

import java.util.Scanner;

/**
 *
 * @ANDREW TEEETERS x00139120
 */
public class CommitteeMember extends ClubMember {

    private String[] committeeNames;

    public CommitteeMember(String nameIn, String idIn, int yearIn, int noCommittees) {
        super(nameIn, idIn, yearIn);
        committeeNames = new String[noCommittees];
    }

    public void populateCommittees() {   
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < committeeNames.length; i++) {
            System.out.printf("Enter committee name %d: " , (i + 1));
            committeeNames[i] = in.nextLine();
            
        }
    }
    public void calcDiscountRate(){
        super.calcDiscountRate();
        discountRate -= 0.10;
    }
    public void printOutstanding(){
        super.printOutstanding();
        System.out.println("This member sits on "+ committeeNames.length + " committees");
    }
}
