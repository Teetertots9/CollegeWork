/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example4;

import java.util.Comparator;

/**
 *
 * @author pmage_000
 */
public class NameComparator implements Comparator<Fruit> {


    @Override
    public int compare(Fruit fruit1, Fruit fruit2) {
        String fruitName1 = fruit1.getFruitName().toUpperCase();
        String fruitName2 = fruit2.getFruitName().toUpperCase();

	//ascending order
        return fruitName1.compareTo(fruitName2);
        
        //descending order
        //return fruitName2.compareTo(fruitName2);
    }
}


