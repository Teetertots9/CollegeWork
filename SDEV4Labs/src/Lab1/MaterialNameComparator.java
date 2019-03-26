/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;
import java.util.Comparator;

public class MaterialNameComparator implements Comparator<Material> {

    @Override
    public int compare(Material m1, Material m2) {
        String material1 = m1.getName().toUpperCase();
        String material2 = m2.getName().toUpperCase();

	//ascending order
        return material1.compareTo(material2);
    }
    
}
