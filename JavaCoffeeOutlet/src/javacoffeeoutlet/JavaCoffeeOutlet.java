/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacoffeeoutlet;
    import java.util.Scanner;
/**
 *
 * @author x00139120
 */
public class JavaCoffeeOutlet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Scanner in = new Scanner(System.in);
    int entreeChoice, sideChoice, drinkChoice, noEntree, noSide, noDrink;
    double entreePrice = 0, sidePrice = 0, drinkPrice = 0, totalPrice = 0; 
    String entreeOutput = "a", sideOutput = "b", drinkOutput = "c";
    final double TOFU = 3.49,CHICKEN = 4.59,WINGS = 3.99,FILLET = 2.99,CRACKER =0.79,FRIES = 0.69,ZUCCHINI = 1.09,RICE = 0.59,MOCHA = 1.99, LATTE = 1.99, ESPRESSO = 2.49, TEA = 0.99;
    
        System.out.printf("Enter the number for which item you want %n%n 1)Tofu Burger   €%.2f%n 2)Cajun Chicken  €%.2f%n 3)Buffalo Wings   €%.2f%n 4)Rainbow Fillet  €%.2f%n%n",TOFU, CHICKEN, WINGS,FILLET);
            entreeChoice = in.nextInt();
        System.out.print("How many?");
            noEntree = in.nextInt();
    
                switch(entreeChoice){
                    
                    case 0:
                    
                    case 1:
                            entreePrice = TOFU * noEntree;
                            entreeOutput = "Tofu Burger";
                            break;
                    case 2:
                            entreePrice = CHICKEN * noEntree;
                            entreeOutput = "Cajun Chicken";
                            break;
                    case 3:
                            entreePrice = WINGS * noEntree;
                            entreeOutput = "Buffalo Wings";
                            break;
                    case 4:
                            entreePrice = FILLET * noEntree;
                            entreeOutput = "Rainbow Fillet";
                            break;
                    default:  
                            noEntree = 0;
                            entreeOutput = "Invalid";
                            System.out.println("Incorrect entree choice");
                                    }  
        System.out.printf("Enter the number for which item you want %n%n 1)Rice Cracker   €%.2f%n 2)No-Salt Fries  €%.2f%n 3)Zucchini   €%.2f%n 4)Brown Rice  €%.2f%n%n",CRACKER, FRIES, ZUCCHINI, RICE);
            sideChoice = in.nextInt();
        System.out.print("How Many?");
            noSide = in.nextInt();
        
            
                switch(sideChoice){
                    
                    case 1:
                            sidePrice = CRACKER * noSide;
                            sideOutput = "Rice Cracker";
                            break;
                    case 2:
                            sidePrice = FRIES * noSide;
                            sideOutput = "No-Salt Fries";
                            break;
                    case 3:
                            sidePrice = ZUCCHINI * noSide;
                            sideOutput = "Zucchini";
                            break;
                    case 4:
                            sidePrice = RICE * noSide;
                            sideOutput = "Brown Rice";
                            break;
                    default: 
                            noSide = 0;
                            sideOutput = "Invalid";
                            System.out.println("Incorrect side choice");
                                  }
        System.out.printf("Enter the number for which item you want %n%n 1)Cafe Mocha   €%.2f%n 2)Cafe Latte  €%.2f%n 3)Espresso   €%.2f%n 4)Oolong Tea  €%.2f%n%n",MOCHA, LATTE, ESPRESSO, TEA);        
            drinkChoice = in.nextInt();
        System.out.print("How Many?");
            noDrink = in.nextInt();
                
                switch(drinkChoice){
                
                    case 1:
                            drinkPrice = MOCHA * noDrink;
                            drinkOutput = "Cafe Mocha";
                            break;
                    case 2:
                            drinkPrice = LATTE * noDrink;
                            drinkOutput = "Cafe Latte";
                            break;
                    case 3:
                            drinkPrice = ESPRESSO * noDrink;
                            drinkOutput = "Espresso";
                            break;
                    case 4:
                            drinkPrice = TEA * noDrink;
                            drinkOutput = "Oolong Tea";
                            break;
                    default: 
                            noDrink = 0;
                            drinkOutput = "Invalid";
                            System.out.println("Incorrect drink choice choice");
                                    }
                totalPrice = entreePrice + sidePrice + drinkPrice;
        System.out.printf("Your Order:%n%n");        
        System.out.printf("Entree: %d %s %.2f%n", noEntree, entreeOutput,entreePrice);
        System.out.printf("Side: %d %s %.2f%n", noSide, sideOutput,sidePrice);
        System.out.printf("Drink: %d %s %.2f%n%n%n", noDrink, drinkOutput,drinkPrice);
        System.out.printf("Total Bill: %.2f%n",totalPrice);        
    }
}