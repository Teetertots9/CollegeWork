/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CA2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestCars {
    public static void main(String[] args) {
        String make = " ";
        String model = " ";
        double purchasePrice = 0;
        double shippingCost = 0;
        char port = ' ';
        CarTax carTax = null;
        double sellingPrice = 0;
        
        CarDB carDataBase = new CarDB();
        
        File inFile = new File("files", "cars.txt");
        int i=0;
        try (Scanner in = new Scanner(inFile)) {
            while (in.hasNextLine()) {
                String line = in.nextLine();
                Scanner lineScanner = new Scanner(line);
                lineScanner.useDelimiter(",");
                while (lineScanner.hasNext()) {
                    i++;
                    make = lineScanner.next();
                    model = lineScanner.next();
                    purchasePrice = Double.parseDouble(lineScanner.next());
                    shippingCost = Double.parseDouble(lineScanner.next());
                    port = lineScanner.next().charAt(0);
                    sellingPrice = Double.parseDouble(lineScanner.next());
                    
                    switch (lineScanner.next()) {
                        case "0-1":
                            carTax = CarTax.ZERO_ONE;
                            break;
                        case "2-80":
                            carTax = CarTax.TWO_EIGHTY;
                            break; 
                        case "81-100":
                            carTax = CarTax.EIGHTYONE_ONEHUNDRED;
                            break;
                        default:
                            break;
                    }
                }
                
                carDataBase.addCar(make,model,purchasePrice,shippingCost,port,sellingPrice,carTax);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Problem: " + ex.getMessage());
        }
        while (true) {
            System.out.println("Please press 1 to view the cars");
            System.out.println("Please press 2 to view the tax due for each car");
            System.out.println("Please press 3 to view the import duty");
            System.out.println("Please press 4 to view the  profit/loss on cars & overall profit/loss");
            System.out.println("Press 5 to quit");

            Scanner in = new Scanner(System.in);
            int choice = in.nextInt();

            switch (choice) {
                case 1:
                    carDataBase.displayList();
                    break;
                case 2:
                    carDataBase.displayTax();
                    break;
                case 3:
                    carDataBase.calcImportDuty();
                    break;
                case 4:
                    
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}
