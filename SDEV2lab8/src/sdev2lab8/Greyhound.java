/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdev2lab8;
/**
 *
 * @author x00139120
 */
public class Greyhound extends Animal{
    //variables
    private String name;
    private int age;
    private String fatherName;   
    private String motherName;
    private int noRaces;
    private int noRaceWon;
    private boolean[] results;
    //contrustor
    public Greyhound(int idIn, String nameIn, int ageIn, String fatherIn, String motherIn, int noRacesIn, int hasRun){
        super(idIn, "Greyhound");
        name = nameIn;
        age = ageIn;
        fatherName = fatherIn;
        motherName = motherIn;
        noRaces = noRacesIn;
        noRaceWon = 0;
        results = new boolean[hasRun];
    }
    //methods
    public void updateWinningRecord(int raceNoIn, boolean raceResult){
        results[raceNoIn - 1] = raceResult;
        if (raceResult == true) {
            noRaceWon ++;
        }
    }
    public String getName(){
        return name;
    }
    public int getRacesWon(){
        return noRaceWon;
    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println("\tName: "+ name);
        System.out.println("\tAge: "+ age);
        System.out.println("\tFather: "+ fatherName);
        System.out.println("\tMother: "+ motherName);
        System.out.println("\tHas run: "+ noRaces + " and won "+ noRaceWon);
        for (int i = 0; i < noRaces; i++) {
            System.out.printf("Race number %d was won: %b%n", (i+1), results[i]);
        }
    }
    
}
