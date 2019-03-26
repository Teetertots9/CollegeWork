/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

/**
 *
 * @author x00139120
 */
public class RefuseTruck {
    private int maxBins;
    private int noOfBinsDeclined;
    private int noOfBinsCollected;
    private double ratePerKg;
    private double totalWeigth;
    
    public RefuseTruck (int max, double rate){
    this.maxBins = max;
    this.noOfBinsDeclined = 0;
    this.noOfBinsCollected = 0;
    this.ratePerKg = rate;
    this.totalWeigth = 0;
    }
    public int getNoOfBinsCollected(){
        return noOfBinsCollected;
    }
    
    public int getMaxBins(){
        return maxBins;
    }
    
    public void collectBin(double weigthIn) throws BinOverWeigthException{
        
            if (weigthIn <= 100) {
            totalWeigth += weigthIn;
            noOfBinsCollected++;            
        }
            else{
                noOfBinsDeclined++;
                throw new BinOverWeigthException();
            }
        
    }
    
    public void printStats(){
        System.out.printf("No. Bins Collected: %d%nNo. Bins Declined: %d%n" 
                + "Average Weigth of bins collected is: %.2f kg%n" 
                + "Average cost of bins collected is: €%.2f%n", 
                noOfBinsCollected,
                noOfBinsDeclined,
                (totalWeigth/noOfBinsCollected), 
                (totalWeigth/noOfBinsCollected) * ratePerKg);
    }
}
