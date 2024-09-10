/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mefferio
 */
import java.util.ArrayList;

class Team {
    private String homeTeam;
    private String visitingTeam;
    private int homeTeamPoints;
    private int visitingTeamPoints;

    public Team(String homeTeam, String visitingTeam, int homeTeamPoints, int visitingTeamPoints){
        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
        this.homeTeamPoints = homeTeamPoints;
        this.visitingTeamPoints = visitingTeamPoints;
    }

    public String getHomeTeam(){
        return this.homeTeam;
    }

    public String getVisitingTeam(){
        return this.visitingTeam;
    }

    public int getHomeTeamPoints(){
        return this.homeTeamPoints;
    }

    public int getVisitingTeamPoints(){
        return this.visitingTeamPoints;
    }

    public boolean isHomeTeamWinner() {
        return this.homeTeamPoints > this.visitingTeamPoints;
    }

    public boolean gamesPlayedByTeam(String team) {
        return this.homeTeam.equals(team) || this.visitingTeam.equals(team);
    }

    @Override
    public String toString(){
        return "Home Team: " + this.homeTeam + ", points: " + this.homeTeamPoints + "\nVisiting Team: " + this.visitingTeam + ", points: " + this.visitingTeamPoints;
    }
}
