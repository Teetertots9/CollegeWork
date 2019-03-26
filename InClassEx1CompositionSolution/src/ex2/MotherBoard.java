/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.util.ArrayList;

/**
 *
 * @author x00139120
 */
public class MotherBoard {

    private String manufacturer;
    private int totalCap;
    private ArrayList<MemoryModule> memModules;

    private class MemoryModule {

        private int capacity;

        public MemoryModule(int c) {
            this.capacity = c;
        }

        @Override
        public String toString() {
            return "size: " + capacity + "MB\n";
        }
    }

    public MotherBoard(String m, int c, int numMem) {
        this.manufacturer = m;
        this.totalCap = c;
        
        memModules = new ArrayList<>();
        
        for (int i = 0; i < numMem; i++) {
        memModules.add(new MemoryModule(totalCap / numMem));    
        }
    }
    
    @Override
    public String toString(){
        String s = "Motherboard " + manufacturer + " containing: ";
        
        for (int i = 0; i < memModules.size(); i++) {
            s = s + "\n" + "module " + (i + 1) + " " + memModules.get(i);
        }
        
        return s;
    }
}
