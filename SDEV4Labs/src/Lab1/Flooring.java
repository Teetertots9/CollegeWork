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
public class Flooring extends Material{
    private double coveragePerPack;
    
    public Flooring(String name, double price, double coveragePerPack){
        super(name,price);
        this.coveragePerPack = coveragePerPack;
    }
    
    public double getCoverage(){
        return coveragePerPack;
    }
    
    @Override
    public double getReqMaterial(Surface s){
        double req;
        req = s.calcArea() / coveragePerPack;
        return req;
    }
}
