/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;

import java.util.ArrayList;

/**
 *
 * @author x00139120
 */
public class Race {
    private int distance;
    private String competition;
    ArrayList<Athelete> athletes;
    
    public Race(int distance, String competition){
        this.distance = distance;
        this.competition = competition;
    }
    
    public class Athelete{
        private String name;
        private String country;
        double[] times;
        
        public Athelete(String name, String country, double[] times){
            this.name= name;
            this.country = country;
            this.times = times;
        }
        
        public double calcAverage(){
            double average = 0;
            for (int i = 0; i < times.length; i++) {
                average += times[i];
            }
            return average;
        }
        
        @Override
        public String toString(){
            String stringOut = "";
            stringOut += "Name: " + name + "/nCountry: " + country;
            return stringOut;
        }
    }
}
