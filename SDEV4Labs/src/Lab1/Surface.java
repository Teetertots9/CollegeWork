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
public class Surface {
    private String name;
    private double length;
    private double width;
    
    public Surface(String name, double length, double width){
        this.name = name;
        this.length = length;
        this.width = width;
    }
    
    public String getName(){
        return name;
    }
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    
    public double calcArea(){
        return length * width;
    }
}
