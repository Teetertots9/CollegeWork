/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdevweek5lab1;

/**
 *
 * @author x00139120
 */
public class PetrolPump {

    private double pricePerLitre;
    private double litresInPump;
    private double minimumQuantity;
    private boolean isLow;
    private String typeOfPetrol;

    public PetrolPump() {
        pricePerLitre = 0.0;
        litresInPump = 0.0;
        minimumQuantity = 0.0;
        isLow = false;
        typeOfPetrol = "";
    }

    public PetrolPump(double priceIn, double litresIn, double minimumIn, String typeIn) {
        pricePerLitre = priceIn;
        litresInPump = litresIn;
        minimumQuantity = minimumIn;
        typeOfPetrol = typeIn;
        if (litresInPump <= minimumQuantity) {
            isLow = true;
        } else {
            isLow = false;
        }
    }

    public void addFuel(double addedFuel) {
        litresInPump += addedFuel;
    }

    public double fillCarFromPump(double carNeeds) {
        double cost;
        litresInPump -= carNeeds;
        cost = pricePerLitre * carNeeds;
        return cost;
    }

    public double getPrice() {
        return pricePerLitre;
    }

    public double getAmount() {
        return litresInPump;
    }

    public double getMinimum() {
        return minimumQuantity;
    }

    public boolean getLow() {
        return isLow;
    }

    public String getType() {
        return typeOfPetrol;
    }

    public void setPrice(double priceIn) {
        pricePerLitre = priceIn;
    }

    public void setMinimum(double minimumIn) {
        minimumQuantity = minimumIn;
    }
}
