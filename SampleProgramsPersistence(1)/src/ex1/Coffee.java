/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COFFEE")
@SuppressWarnings("SerializableClass")
public class Coffee {
    private String description;
    @Id
    private String prodnum;
    private double price;

    public Coffee() {
    }

    public Coffee(String prodnum) {
        this.prodnum = prodnum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProdnum() {
        return prodnum;
    }

    public void setProdnum(String prodnum) {
        this.prodnum = prodnum;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Description: %-25s Product Number: %-15s Price: %,.2f",description,prodnum,price);
    }
    
}
