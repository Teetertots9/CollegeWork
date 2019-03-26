/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1package2;

import lab1package2.Paint;
import static lab1package2.Shape.shapeCount;

/**
 *
 * @author Dell User
 */
public class ShapeTest {

    public static void main(String[] args) {
        int maxIndex = 0,minIndex = 0;
        double max,min,total = 0;
        Shape shapeList[] = new Shape[4];
        Paint paintCan = new Paint(70);
        shapeList[0] = new Circle(22, 88, 4, 4);
        shapeList[1] = new Square(71, 96, 10, 10);
        shapeList[2] = new Sphere(8, 89, 2, 2, 2);
        shapeList[3] = new Cube(79, 61, 8, 8, 8);

        System.out.println("Number of Shapes created: " + shapeCount);
        System.out.println("");
        for (int i = 0; i < shapeList.length; i++) {
            System.out.println(shapeList[i].getName() + shapeList[i].toString());
            if (shapeList[i] instanceof TwoDShape) {
                TwoDShape a = (TwoDShape) shapeList[i];
                System.out.println("Area of " + a.getName() + "is: " + a.getArea());
                System.out.printf("Amount of paint needed for %s is %.2f litres%n",a.getName(), paintCan.calcAmount(shapeList[i]));
            } else if (shapeList[i] instanceof ThreeDShape) {
                ThreeDShape b = (ThreeDShape) shapeList[i];
                System.out.println("Area of " + b.getName() + "is: " + b.getArea() + "\nVolume of " + b.getName() + " is: " + b.getVolume());
                System.out.printf("Amount of paint needed for %s is %.2f litres%n",b.getName(), paintCan.calcAmount(shapeList[i]));
            }
            System.out.println("");
        }
        
        max = paintCan.calcAmount(shapeList[0]);
        min = paintCan.calcAmount(shapeList[0]);
        for (int i = 0; i < shapeList.length; i++) {
            if (max < paintCan.calcAmount(shapeList[i])) {
                max = paintCan.calcAmount(shapeList[i]);
                maxIndex = i;
            } 
            if (min > paintCan.calcAmount(shapeList[i])) {
                min = paintCan.calcAmount(shapeList[i]);
                minIndex = i;
            }
            total += paintCan.calcAmount(shapeList[i]);
        }
        
        System.out.printf("The total amount of paint required is: %.2f litres%n", total);
        System.out.println("The name of the shape that requires the most paint is: " + shapeList[maxIndex].getName());
        System.out.println("The name of the shape that requires the least paint is: " + shapeList[minIndex].getName());
    }
}

