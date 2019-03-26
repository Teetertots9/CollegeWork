/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Interface.*;
/**
 *
 * @author Dell User
 */
public class MobilePhone implements IFootball{
    private String homeTeam,visitorTeam,phoneOwner;
    private int homeScore,visitorScore,currentQuarter;
    
    public MobilePhone(String phoneOwner) {
        this.currentQuarter = 1;
        this.phoneOwner = phoneOwner;
    }
    
    public void displayQuarter() {
        if (currentQuarter > 0){
        System.out.println("Hi " + phoneOwner + " Game is in Quarter " + currentQuarter);
        }
        else{
            System.out.println("Hi " + phoneOwner + " Final Score: " + homeTeam + " " + homeScore + "-" + visitorScore + " " + visitorTeam);
        }
    }
    
    public void updateScore() {
        System.out.println(homeTeam + ": " + homeScore);
        System.out.println(visitorTeam + ": " + visitorScore);
        displayQuarter();
    }
    
    @Override
    public void endOfQuarter(int quarter) {
        if (quarter > 0 && quarter < 4) {
            currentQuarter ++;
            System.out.println("Hi " + phoneOwner + " Quarter " + quarter + " has ended.");
            updateScore();
        }
        else {
            currentQuarter = -1;
            updateScore();
        }
    }
    
    @Override
    public void homeTeamScored(int points) {
        System.out.println("Hi " + phoneOwner + " "+ homeTeam + " just scored " + points + " points");
        homeScore += points;
        updateScore();
    }
    
    @Override
    public void visitingTeamScored(int points) {
        System.out.println("Hi " + phoneOwner + " " + visitorTeam + " just scored " + points + " points");
        visitorScore += points;
        updateScore();
    }
    
    @Override
    public void setHomeTeam(String name) {
        this.homeTeam = name;
    }
    
    @Override
    public void setVisitingTeam(String name) {
        this.visitorTeam = name;
    }
    
}
