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
public class QuantityComparator implements Comparator<Fruit> {

    @Override
    public int compare(Fruit f1, Fruit f2) {
        // asc
        // return f1.getQuantity() - f2.getQuantity();
        //desc
        return f2.getQuantity() - f1.getQuantity();
    }
}





