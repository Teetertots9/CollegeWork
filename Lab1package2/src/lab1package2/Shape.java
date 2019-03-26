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
abstract public class Shape {

    private int x;
    private int y;
    public static int shapeCount = 0;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
        shapeCount++;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
   
    @Override
    public String toString() {
        String stringOut = x + " " + y;
        return stringOut;
    }

    abstract public String getName();
}
