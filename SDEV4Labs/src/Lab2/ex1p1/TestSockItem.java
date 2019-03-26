/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2.ex1p1;

/**
 *
 * @author x00139120
 */
public class TestSockItem {

    public static void main(String[] args) throws OverMaxException, BelowMinException, OutOfStockException {
        StockItem item1 = new StockItem("123", "Shampoo", 100, 10, 25);

        item1.takeOnStock(80);
        item1.issueStock(30);
        item1.issueStock(20);
        System.out.println("Current Stock: " + item1.getInStock());
    }
}
