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
public enum CarTax {
    
ZERO_ONE{
    @Override
    public double getTax(){
        return 120;
    }
},TWO_EIGHTY{
    @Override
    public double getTax(){
        return 170;
    }
},EIGHTYONE_ONEHUNDRED{
    @Override
    public double getTax(){
        return 180;
    }
};

public abstract double getTax();
}
