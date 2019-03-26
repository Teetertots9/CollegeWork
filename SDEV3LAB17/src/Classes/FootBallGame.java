/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Interface.*;
import java.util.ArrayList;
/**
 *
 * @author Dell User
 */
public class FootBallGame {
    
    private String homeTeam, visitorTeam;
    
    private ArrayList<IFootball> fList;
    
    public FootBallGame(String nameH, String nameV) {
        this.homeTeam = nameH;
        this.visitorTeam = nameV;
        fList = new ArrayList<IFootball>();
    }
    
    public void addFootballListener(IFootball f) {
        f.setHomeTeam(homeTeam);
        f.setVisitingTeam(visitorTeam);
        fList.add(f);
    }
    
    public void notifyHomeTeamScored(int points) {
        for (IFootball f : fList) {
            f.homeTeamScored(points);
        }
    }
    
    public void notifyVisitorTeamScored(int points) {
        for (IFootball f : fList) {
            f.visitingTeamScored(points);
        }
    }
    
    public void notifyQuarterEnded(int quarter) {
        for(IFootball f : fList) {
            f.endOfQuarter(quarter);
        }
    }
}
