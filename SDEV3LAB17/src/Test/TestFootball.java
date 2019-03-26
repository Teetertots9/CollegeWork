/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Classes.*;
/**
 *
 * @author Dell User
 */
public class TestFootball {
    public static void main(String[] args) {
     
       /* System.out.println("Instantiating a new Football Game");
        System.out.println("Welcome to the Internation Rules");
        
        FootBallGame game1 = new FootBallGame("Ireland","Australia");
        
        System.out.println("Instantiating a listener");
        
        MobilePhone p1 = new MobilePhone("John");
        
        System.out.println("Registering a listener to the game");
        
        game1.addFootballListener(p1);
        
        System.out.println("Simulating a game...");
        
        game1.notifyHomeTeamScored(7);
        game1.notifyQuarterEnded(1);
        game1.notifyVisitorTeamScored(3);
        game1.notifyVisitorTeamScored(7);
        game1.notifyQuarterEnded(2);
        game1.notifyQuarterEnded(3);
        game1.notifyHomeTeamScored(3);
        game1.notifyHomeTeamScored(7);
        game1.notifyQuarterEnded(4); */
       
        System.out.println("Instantiating a new Football Game");
        System.out.println("Welcome to the Internation Rules");
        
        FootBallGame game1 = new FootBallGame("Ireland","Australia");
        
        System.out.println("Instantiating a listener");
        
        MobilePhone p1 = new MobilePhone("John");
        
        System.out.println("Registering a listener to the game");
               
        game1.addFootballListener(p1);
        
        System.out.println("Instantiating a listener");
        
        MobilePhone p2 = new MobilePhone("Paul");
        
        System.out.println("Registering a listener to the game");
               
        game1.addFootballListener(p2);
        
        System.out.println("Simulating a game...");
        
        game1.notifyHomeTeamScored(7);
        game1.notifyQuarterEnded(1);
        game1.notifyVisitorTeamScored(3);
        game1.notifyVisitorTeamScored(7);
        game1.notifyQuarterEnded(2);
        game1.notifyQuarterEnded(3);
        game1.notifyHomeTeamScored(3);
        game1.notifyHomeTeamScored(7);
        game1.notifyQuarterEnded(4);
    }
}
