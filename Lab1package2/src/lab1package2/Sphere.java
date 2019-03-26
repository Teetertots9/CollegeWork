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
public class Sphere extends ThreeDShape {

    public Sphere(int x, int y, int d1, int d2, int d3) {
        super(x, y, d1, d2, d3);
    }

    @Override
    public String getName() {
        return "Sphere";
    }

    public int getRadius() {
        return getD1();
    }

    @Override
    public int getArea() {
        int area = (int) (4 * Math.PI * getRadius() * getRadius());
        return area;
    }

    @Override
    public int getVolume() {
        int volume = (int) (4 / 3 * Math.PI * (getRadius() * getRadius() * getRadius()));
        return volume;
    }

    @Override
    public String toString() {
        String stringOut = ( "(" + getX() + "," + getY() + ") radius:  " + getRadius());
        return stringOut;
    }
}
