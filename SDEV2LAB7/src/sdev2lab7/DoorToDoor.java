/*
DoorToDoorClass
Kevin O'Toole & Andrew Teeters
x00149930 & x00139120
09/03/2018
 */
package sdev2lab7;

public class DoorToDoor {

    private int[] houses;
    private int[] sales;

    //Constructor
    public DoorToDoor(int houses) {
        if (houses <= 0) {
            System.out.println("Incorrect value entered, value set to 0");
            this.houses = new int[0];
            sales = new int[0];
        } else {
            this.houses = new int[houses];
            sales = new int[houses];
        }
    }

    //Setters
    public void fillHouses() {
        for (int i = 0; i < houses.length; i++) {
            houses[i] = i + 1;
        }
    }

    public void fillSales(int houseNum, int salesQty) {
        sales[houseNum - 1] = salesQty;//-1 for added user usability.
    }

    //Print
    public void displayAll() {
        if (houses.length == 0) {
            System.out.println("No values entered. Can not display data.");
        } else {
            for (int i = 0; i < houses.length; i++) {
                System.out.printf("Sales for House %d: %d.%n", houses[i], sales[i]);
            }
        }
    }

    //Utility
    public int calcAverageSales() {
        int average = 0;
        for (int i = 0; i < sales.length; i++) {
            average += sales[i];
        }
        if (sales.length == 0) {
            System.out.println("No values entered. Can not find average.");
            return 0;
        }
        average /= sales.length;
        return average;
    }

    public void minSales() {
        if (houses.length == 0) {
            System.out.println("No Value entered, cannot find minimum");
        } else {
            int minIndex = 0;
            for (int i = 0; i < sales.length; i++) {
                if (sales[minIndex] > sales[i]) {
                    minIndex = i;
                }
            }
            System.out.printf("Minimum Sales value €%d corresponds to house number %d%n", sales[minIndex], houses[minIndex]);
            if (sales.length == 0) {
                System.out.println("No values entered. Can not find minimum sales value");
            }
        }
    }

}
