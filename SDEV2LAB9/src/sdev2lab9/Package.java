/*
 @ANDREW TEETERS 
  PARTNER WAS ABSENT FOR THIS LAB
 */
package sdev2lab9;

/**
 *
 * @author x00139120
 */
public class Package {
    //variables
    protected double weight;
    protected char shipMode;
    protected double shipCost;
    //Constructor
    public Package(double weightIn, char shipType) {
        weight = weightIn;
        shipMode = shipType;
        shipCost = calculateCost();
    }
    //Methods
    public double calculateCost(){
        double cost = 0;
        if ((weight / 16) >= 1 && (weight / 16) <= 8) {
            if (shipMode == 'A') {
                cost = 2.00;
            }
            else if (shipMode == 'T'){
                cost = 1.50;
            }
        }
        else if ((weight/16) >= 9){
           if (shipMode == 'A') {
                cost = 3.00;
            }
            else if (shipMode == 'T'){
                cost = 2.35;
            }
        }
        return cost;
    }
    //display Method
    public void displayDetails(){
        System.out.println("\tPackage Details");
        System.out.println("Weight in ounces:\t\t" + weight);
        System.out.println("Shipping Mode:\t\t" + shipMode);
        System.out.println("Shipping Cost:\t\t" + shipCost);
    }
}
