/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdev2week3;

/**
 *
 * @ ANDREW TEETERS + KEVIN O'TOOLE
 */
public class Rectangle {
    String colour;
    double length;
    double width;

    public void print() {
        System.out.println("Lenght: " + length);
        System.out.println("Width: " + width);
        System.out.println("Colour: " + colour);
        System.out.println("");
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }
    public String getColour() {
        return this.colour;
    }
}
