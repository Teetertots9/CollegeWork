/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2.ex1p2;

/**
 *
 * @author x00139120
 */
public class StockItem {

    private String itemID;
    private String description;
    private int maxInStock;
    private int minInStock;
    private int inStock;

    public StockItem(String id, String desc,int max, int min, int in) {

        this.itemID = id;
        this.description = desc;
        this.maxInStock = max;
        this.minInStock = min;
        this.inStock = in;
    }

    public void takeOnStock(int stock) throws OverMaxException {
        if (inStock + stock > maxInStock) {
            throw new OverMaxException();
        }
        inStock += stock;
    }

    public void issueStock(int stock) throws BelowMinException, OutOfStockException {
        if (inStock - stock <= 0) {
            throw new OutOfStockException();
        }
        if (inStock - stock < minInStock) {
            inStock -= stock;
            throw new BelowMinException();    
        }
        inStock -= stock;
    }
    
    public int getInStock(){
        return inStock;
    }
}
