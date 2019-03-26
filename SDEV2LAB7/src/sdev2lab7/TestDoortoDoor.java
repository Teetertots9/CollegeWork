/*
Kevin O'Toole & Andrew Teeters
x00149930 & x00139120
09/03/2018
 */
package sdev2lab7;
import java.util.Scanner;
/**
 *
 * @author x00139120
 */
public class TestDoortoDoor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DoorToDoor doorToDoor;
        int houses;
        int sales;
        
        System.out.println("Please enter the number of houses");
        houses = in.nextInt();
        
        doorToDoor = new DoorToDoor(houses);
        doorToDoor.fillHouses();
        for (int i = 0; i < houses; i++) {
            System.out.println("Please enter sales for house "+ (i+1));
            sales = in.nextInt();
            while (sales < 0) {
                System.out.println("Invalid sale entered, please enter valid sale");
                sales = in.nextInt();
            }
            doorToDoor.fillSales(i + 1, sales);
        }
        System.out.println("Average sales: "+doorToDoor.calcAverageSales());
        doorToDoor.minSales();
        doorToDoor.displayAll();
    }
}
