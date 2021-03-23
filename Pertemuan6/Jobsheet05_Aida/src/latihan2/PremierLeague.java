/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

/**
 *
 * @author HP
 */
public class PremierLeague {
    String team;
    int play;
    int goal;
    int points;
    
    PremierLeague(String t, int p, int g, int pt){
        this.team = t;
        this.play = p;
        this.goal = g;
        this.points = pt;
    }
    
    void tampil(){
        System.out.println("Team        = " + team);
        System.out.println("Play        = " + play);
        System.out.println("Goal        = " + goal);
        System.out.println("Points      = " + points);
    }
}
