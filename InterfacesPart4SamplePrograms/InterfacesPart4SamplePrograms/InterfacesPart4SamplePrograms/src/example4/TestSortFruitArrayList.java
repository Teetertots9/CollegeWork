/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example4;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author pmage_000
 */
public class TestSortFruitArrayList {
    public static void main(String[] args) {
        ArrayList<Fruit> fruits= new ArrayList<>();
        
        fruits.add(new Fruit("Pineapple", "Pineapple description", 70));
        fruits.add(new Fruit("Apple", "Apple description", 100));
        fruits.add(new Fruit("Orange", "Orange description", 80));
        fruits.add(new Fruit("Banana", "Banana description", 90));
        
        Collections.sort(fruits, new NameComparator());

        int i = 0;
        for (Fruit temp : fruits) {
            System.out.println("fruits " + ++i + " : " + temp.getFruitName()
                    + ", Quantity : " + temp.getQuantity());
        }
        
        System.out.println("");
        Collections.sort(fruits, new QuantityComparator());

        int j = 0;
        for (Fruit temp : fruits) {
            System.out.println("fruits " + ++j + " : " + temp.getFruitName()
                    + ", Quantity : " + temp.getQuantity());
        }
    }
    
}
