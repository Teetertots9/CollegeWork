/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Comparator;

/**
 *
 * @author x00139120
 */
public class DVDTitleComparator implements Comparator<DVD>{
    
    @Override
    public int compare(DVD d1, DVD d2) {
        return d1.getName().compareTo(d2.getName());
         
    }
}
