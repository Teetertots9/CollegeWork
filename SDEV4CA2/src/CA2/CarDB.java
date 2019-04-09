/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CA2;

import static CA2.ImportDuty.BROKER_FEE;
import static CA2.ImportDuty.OSAKA_RATE;
import static CA2.ImportDuty.OSAKA_UNLOADING_FEE;
import static CA2.ImportDuty.TOKYO_RATE;
import static CA2.ImportDuty.TOKYO_UNLOADING_FEE;
import static CA2.ImportDuty.VAT;
import java.util.*;
/**
 *
 * @author x00139120
 */
public class CarDB {
    
    private ArrayList<Car> carList;
    private double[] totalCostPerCar;
    
    public CarDB(){
        carList = new ArrayList<>();
        
    }
    
    public void addCar(String make, String model, double purchasePrice, double shippingCost, char port, double sellingPrice, CarTax carTax){
       carList.add(new Car(make,model,purchasePrice,shippingCost,port,sellingPrice,carTax));
    }
    public void displayList(){
        System.out.println("Cars");
        int i = 1;
        for (Car cars: carList) {
            System.out.println("No. " + i + " " + cars.toString());
            i++;
        }
    }
    
    public void displayTax(){
        System.out.println("Tax on Cars");
        for(Car cars: carList){
            System.out.println(cars.getModel() + " \t\tat " + String.format( "€%.2f", cars.getCarTax().getTax()));
        }
    }
    
    public void calcImportDuty(){
        System.out.println("Model \t\tCost \t\tImport Cost Total Cost");
        double cost = 0;
        double totalImportCost = 0;
        double totalCost = 0;
        
        totalCostPerCar = new double[]{};
        for(Car cars: carList){
            cost = cars.getPPrice() + cars.getSCost();
            if(cars.getPort() == 'o'){
               double portDuty = cost * OSAKA_RATE;
               double vat = VAT * (cost + portDuty);
               double importCost = portDuty + VAT + OSAKA_UNLOADING_FEE + BROKER_FEE;
               totalImportCost = cost + importCost;
            } else if(cars.getPort() == 't'){
               double portDuty = cost * TOKYO_RATE;
               double vat = VAT * (cost + portDuty);
               double importCost = portDuty + VAT + TOKYO_UNLOADING_FEE + BROKER_FEE;
               totalImportCost = cost + importCost;
            }
            
            totalCost = cost + totalImportCost;
            
            System.out.println(cars.getModel() + String.format( "\t\t€%.2f", cost) + String.format( " €%.2f", totalImportCost) + String.format( " €%.2f", totalCost));
           
        }
    }
    
    public void calcProfitLoss(){
        
    }
}
