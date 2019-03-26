/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdevweek5lab1;
import java.util.Scanner;
/**
 *
 * @author x00139120
 */
public class TestPetrolPump {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double purchaseAmount, fuelIn;
        
        
        PetrolPump pump1 = new PetrolPump(0.75, 20000, 300, "Unleaded 95");
        System.out.println("How much petrol do you wish to purchase (in litres)?");
        purchaseAmount = in.nextDouble();
        if (purchaseAmount > pump1.getAmount()) {
            System.out.println("Not enough fuel to continue transaction");
            }
        else{
            System.out.printf("Cost: €%.2f%n", pump1.fillCarFromPump(purchaseAmount));
        }
        if (pump1.getAmount() < pump1.getMinimum()) {
            System.out.println("More fuel needs to be added.");
            System.out.printf("There are %.2f litres left in the pump%n", pump1.getAmount());
            pump1.addFuel(1000);
            System.out.printf("There are %.2f litres in the pump now%n", pump1.getAmount());
        }
    }
}
