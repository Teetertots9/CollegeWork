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
public class StockItem {

    private String itemID;
    private String description;
    private int maxInStock;
    private int minInStock;
    private int inStock;

    public StockItem(String id, String desc, int max, int min, int in) {

        this.itemID = id;
        this.description = desc;
        this.maxInStock = max;
        this.minInStock = min;
        this.inStock = in;
    }

    public void takeOnStock(int stock) throws OverMaxException {
        try {
            if (inStock + stock > maxInStock) {
                throw new OverMaxException();
            }
            inStock += stock;
        } catch (OverMaxException e) {
            System.out.println(e.getMessage());
        }
    }
    

    public void issueStock(int stock) throws BelowMinException, OutOfStockException {
        try{
        if (inStock - stock <= 0) {
            throw new OutOfStockException();
        }
        if (inStock - stock < minInStock) {
            inStock -= stock;
            throw new BelowMinException();
        }
        inStock -= stock;
    } catch (OutOfStockException e){
            System.out.println(e.getMessage());
    } catch (BelowMinException e){
            System.out.println(e.getMessage());
    }
    }

    public int getInStock() {
        return inStock;
    }
}
