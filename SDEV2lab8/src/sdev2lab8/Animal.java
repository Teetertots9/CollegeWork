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
public class Animal {
    //variables
    private int animalID;
    private String type;
    //contrustor
    public Animal(int idIn, String typeIn){
        animalID = idIn;
        type = typeIn;
    }
    //methods
    public void displayDetails(){
        System.out.println("Animal: ");
        System.out.println("\tID: " + animalID);
        System.out.println("\tType: "+ type);
    }
}
