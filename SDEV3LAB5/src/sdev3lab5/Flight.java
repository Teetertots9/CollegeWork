/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdev3lab5;

import java.util.ArrayList;

/**
 *
 * @author x00139120
 */
public class Flight {

    private int capacity;
    private double duration;
    private ArrayList<Passenger> passengers;

    public Flight(int capacity, double duration) {
        this.capacity = capacity;
        this.duration = duration;
        this.passengers = new ArrayList<>();
    }

    public void fillList(Passenger p) {
        passengers.add(p);
    }

    public void print() {
        for (Passenger p : passengers) {
            System.out.println("Name: " + p.name);
            System.out.println("Age: " + p.age);
            System.out.println("Baggage Charge: " + p.calcBaggageCharge());
        }
    }

    public int checkAvailability() {
        int seatsAvail = capacity - passengers.size();
        return seatsAvail;
    }
    public String calcOldestPassenger(){
        String oldestPassenger;
        int index = 0;
        int oldAge = 0;
        for (int i = 0; i < passengers.size(); i++) {
            if (oldAge < passengers.get(i).age) {
                index = i;
                oldAge = passengers.get(i).age;
            }
        }
        
        oldestPassenger = ("Oldest Passenger on flight is\nName: " + passengers.get(index).name + "\nAge: " + passengers.get(index).age);
        return oldestPassenger;
    }

    public class Passenger {

        String name;
        int age;
        double[] weight;
        char[] size;

        public Passenger(String name, int age, double[] weight, char[] size) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.size = size;
        }

        public double calcBaggageCharge() {
            double charge = 0.00;
            for (int i = 0; i < weight.length; i++) {
                if (weight[i] < 20.00) {
                    charge += 30.00;
                }
                if (weight[i] == 20.00) {
                    charge += 40.00;
                }
                if (weight[i] > 20.00) {
                    charge += 40.00;
                    charge += (weight[i] - 20.00) * 10.00;
                }
            }
            return charge;
        }
    }

}
