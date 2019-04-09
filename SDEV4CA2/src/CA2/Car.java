/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CA2;

/**
 *
 * @author x00139120
 */
public class Car {
    
    private String make;
    private String model;
    private double purchasePrice;
    private double shippingCost;
    private char port;
    private double sellingPrice;
    private CarTax carTax;
    
    public Car(String make, String model, double purchasePrice, double shippingCost, char port, double sellingPrice, CarTax carTax){
        this.make = make;
        this.model = model;
        this.purchasePrice = purchasePrice;
        this.shippingCost = shippingCost;
        this.port = port;
        this.sellingPrice = sellingPrice;
        this.carTax = carTax;
    }
    
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public double getPPrice(){
        return purchasePrice;
    }
    public double getSCost(){
        return shippingCost;
    }
    public char getPort(){
        return port;
    }
    public double getSPrice(){
        return sellingPrice;
    }
    public CarTax getCarTax(){
        return carTax;
    }
    
    public void setMake(String make){
        this.make = make;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setPPrice(double purchasePrice){
        this.purchasePrice = purchasePrice;
    }
    public void setSCost(double shippingCost){
        this.shippingCost = shippingCost;
    }
    public void setPort(char port){
        this.port = port;
    }
    public void setSPrice(double sellingPrice){
        this.sellingPrice = sellingPrice;
    }
    public void setCarTax(CarTax carTax){
        this.carTax = carTax;
    }
    
    @Override
    public String toString(){
        String s = "";
        if(port == 'o'){
            
            s = String.format("%-20s",make) + String.format("%-20s", model) + String.format(" €%.2f", purchasePrice) +
                String.format(" €%.2f", shippingCost) +  " Port: Osaka " +String.format(" €%.2f", sellingPrice);
        }
        else if(port == 't'){
           s = String.format("%-20s",make) + String.format(" %-20s", model) + String.format(" €%.2f", purchasePrice) +
                String.format(" €%.2f", shippingCost) +  " Port: Tokyo " +String.format(" €%.2f", sellingPrice);
        }
        return s;
    }
}
