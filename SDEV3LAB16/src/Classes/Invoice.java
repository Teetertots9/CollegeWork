/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Interface.*;
/**
 *
 * @author x00139120
 */
public class Invoice implements IPayable{
    private String description;
    private String invoiceNum;
    private double price;
    private int quantity;
    public static int numInvoiceProcessed = 0;
    public static double totalVatPaid = 0;
    
    public Invoice(){
        
    }
    
    public Invoice(String desc, String num, double price, int quantity){
        this.description = desc;
        this.invoiceNum = num;
        this.price = price;
        this.quantity = quantity;
        numInvoiceProcessed++;
    }
    
    public String getDescription(){
        return description;
    }
    
    public String getInvoiceNumber(){
        return invoiceNum;
    }
    
    public double getPrice(){
        return price;
    }
    
    public int getQuantity(){
        return quantity;
    }
    
    public void setDescription(String desc){
        this.description = desc;
    }
    
    public void setInvoiceNumber(String num){
        this.invoiceNum = num;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    
    @Override
    public String toString(){
        return "Invoice:\nDescription: " + description 
                + "\nInvoice Number: " + invoiceNum 
                + "\nPrice: " + price 
                + "\nQuantity: " + quantity
                + "\nAmount Due: €" + getPaymentAmount();
    }
    
    @Override
    public double getPaymentAmount(){
        double payment = (price * quantity)+((price * quantity) * VATRATE);
        totalVatPaid += payment - (price * quantity);
        return payment;
    }
}
