/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Classes.*;
import Interface.IPayable;

/**
 *
 * @author x00139120
 */
public class TestClass {
    public static void main(String[] args) {
     
     
     
  IPayable[] payableObjects = new IPayable[5];
  
  payableObjects[0] = new Invoice("Printer","01234",375,2);
  payableObjects[1] = new Invoice("Ink Cartridges","56789",79.95,4);
  payableObjects[2] = new HourlyEmployee("John","Smith","6578431N",60,30);
  payableObjects[3] = new HourlyEmployee("Lisa","Kelly","9865431M",20,12);
  payableObjects[4] = new HourlyEmployee("Mary","Reilly","9875431M",20,8);
  
        for (IPayable payableObject : payableObjects) {
            System.out.println(payableObject.toString());
            System.out.println("");
        }
        
        System.out.println("Total number of employees processed is: " + Employee.numEmpProcessed);
        System.out.println("The total number of invoices processed is: " + Invoice.numInvoiceProcessed);
        System.out.printf("The total amount of VAT paid is: €%.2f", Invoice.totalVatPaid);
        System.out.printf("%nThe total amount of tax paid is: €%.2f", Employee.totalTaxPaid);
    }
}
