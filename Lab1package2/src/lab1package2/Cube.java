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
public class Cube extends ThreeDShape {

    public Cube(int x, int y, int d1, int d2, int d3) {
        super(x, y, d1, d2, d3);
    }

    @Override
    public String getName() {
        return "Cube";
    }

    public int getSide() {
        return getD1();
    }
    @Override
    public int getArea(){
        int area = (int) (6 * getSide() * getSide());
        return area;
    }
    @Override
    public int getVolume(){
        int volume = (int) (getSide() * getSide() * getSide());
        return volume;
    }
    @Override
    public String toString(){
        String stringOut = ( "(" + getX() + "," + getY() + ") side: " + getSide());
        return stringOut;
    }
}
