/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author x00139120
 */
public class TestClass2 {
    public static void main(String[] args) {
        List<Material> materials = new ArrayList<>();
        
        materials.add(0, new Paint("Dulex Soft Sheen",11.52,2,12));
        materials.add(1, new Paint("Crown White", 10, 3, 10));
        materials.add(2, new Wallpaper("Shand Kydd", 50, 10.06, 0.52));
        materials.add(3, new Flooring("QUick-Step Planked Oak", 65, 1.65));
        materials.add(4, new Flooring("Elka Classic Walnut", 80, 1.65));
        Collections.sort(materials, new MaterialNameComparator());
        Surface testSurface = new Surface("Test Surface",5.7,5.7);
        
        for (int i = 0; i < materials.size(); i++) {
            System.out.printf("Name: %s Requirement: %.2f Price: %.2f%n", 
                    materials.get(i).getName(),
                    materials.get(i).getReqMaterial(testSurface),
                    materials.get(i).calcTotalPrice(testSurface));
        }
        
    }
}
