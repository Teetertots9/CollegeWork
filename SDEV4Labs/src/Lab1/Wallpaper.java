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
public class Wallpaper extends Material{
    
    private double lengthPerRoll;
    private double widthPerRoll;
    
    public Wallpaper(String name, double price, double length, double width){
        super(name,price);
        this.lengthPerRoll = length;
        this.widthPerRoll = width;
    }
    
    public double getLength(){
        return lengthPerRoll;
    }
    public double getWidth(){
        return widthPerRoll;
    }
    
    @Override
    public double getReqMaterial(Surface s){
        double req;
        req = 4 * (0.8*(s.getLength() / lengthPerRoll) + (s.getWidth() / widthPerRoll));
        return req;
    }
}
