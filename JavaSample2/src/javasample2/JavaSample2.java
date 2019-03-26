/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasample2;

/**
 *
 * @author x00139120
 */
public class JavaSample2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //data
        int cansPerPack;
        double totalVolume;
        
        //calculations
        cansPerPack = 6;
        totalVolume = (cansPerPack * 0.355) + 2;
        
        //output
        System.out.println("The total volume of the six-pack and a two litre bottle is:" + totalVolume);
    }
    
}
