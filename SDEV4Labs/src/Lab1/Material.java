/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

/**
 *
 * @author x00139120
 */
public abstract class Material {
    private String name;
    private double price;
    
    public Material(String name, double price){
        this.name = name;
        this.price = price;
    }
    
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    
    public abstract double getReqMaterial(Surface s);
    
    public double calcTotalPrice(Surface s){
        double totalPrice;
        totalPrice = price * getReqMaterial(s);
        return totalPrice;
    }
}
