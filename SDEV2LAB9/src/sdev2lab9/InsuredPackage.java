/*
 @ANDREW TEETERS 
  PARTNER WAS ABSENT FOR THIS LAB
 */
package sdev2lab9;

/**
 *
 * @author x00139120
 */
public class InsuredPackage extends Package{
    //variables
    private double insuranceCost;
    //constructor
    public InsuredPackage(double weightIn, char shipType) {
        super(weightIn, shipType);
        calcInsuranceCost();
    }
    //methods
    public void calcInsuranceCost(){
        if (shipCost >= 0 && shipCost <= 1.00) {
            insuranceCost = 2.45;
        }
        else if(shipCost > 1.00 && shipCost <= 3.00) {
            insuranceCost = 3.95;
        }
        else if(shipCost > 3.00) {
            insuranceCost = 5.55;
        }
    }
    //display Method
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Addition Insurance Cost for this Package: "+ insuranceCost);
    }
    
}
