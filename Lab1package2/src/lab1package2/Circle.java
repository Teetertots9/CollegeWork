/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1package2;

/**
 *
 * @author Dell User
 */
public class Circle extends TwoDShape {

    public Circle(int x, int y, int d1, int d2) {
        super(x, y, d1, d2);
    }

    @Override
    public String getName() {
        return "Circle";
    }

    public int getRadius() {
        int radius = getD1();
        return radius;
    }

    @Override
    public int getArea() {
        int area = (int) (Math.PI * getRadius() * getRadius());
        return area;
    }

    @Override
    public String toString() {
        String stringOut =("(" + getX() + "," + getY() + ") radius: " + getRadius());
        return stringOut;
    }

}
