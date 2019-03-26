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
public class Paint extends Material{
    private int numCoats;
    private double coverage;
    
    public Paint(String name, double price, int numCoats, double coverage){
        super(name,price);
        this.numCoats = numCoats;
        this.coverage = coverage;
    }
    
    public int getNumCoats(){
        return numCoats;
    }
    
    public double getCoverage(){
        return coverage;
    }
    
    @Override
    public double getReqMaterial(Surface s){
        double req;
        req = numCoats * (4*(s.calcArea() * 0.8) / coverage);
        return req;
    }
}
