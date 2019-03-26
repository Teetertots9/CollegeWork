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
abstract public class ThreeDShape extends Shape {

    private int d1;
    private int d2;
    private int d3;
    

    public ThreeDShape(int x, int y, int d1, int d2, int d3) {
        super(x, y);
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public int getD1() {
        return d1;
    }

    public int getD2() {
        return d2;
    }

    public int getD3() {
        return d3;
    }

    abstract public int getArea();

    abstract public int getVolume();
}
