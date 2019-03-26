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
public class Square extends TwoDShape {

    public Square(int x, int y, int d1, int d2) {
        super(x, y, d1, d2);
    }

    @Override
    public String getName() {
        return "Square";
    }

    public int getSide() {
        int side = getD1();
        return side;
    }

    @Override
    public int getArea() {
        int area = getSide() * getSide();
        return area;
    }

    @Override
    public String toString() {
        String stringOut = ("(" + getX() + "," + getY() + ") side: " + getSide());
        return stringOut;
    }
}
