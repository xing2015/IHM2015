/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 *
 * @author Administrator
 */
public class Partie  extends Observable {
    int nbCoup=0;
    int scoreA=0;
    int scoreB=0;
    int gainA=0;
    int gainB=0;
    List<Coup> choix = new ArrayList<Coup>();
    
    public Partie() {
    }
  
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public void Cooperer(boolean choixA,boolean choixB) {
      
        if(choixA && choixB){
            this.gainA=3;
            this.gainB=3;
        }
        else if(choixA &&!choixB){
            this.gainA=0;
            this.gainB=5;
         }
        else if(!choixA &&choixB){
            this.gainA=5;
            this.gainB=0;
         }
        else if(!choixA &&!choixB){
            this.gainA=1;
            this.gainB=1;
        }
         this.scoreA = this.scoreA+this.gainA;
         this.scoreB=this.scoreB+this.gainB;
        this.nbCoup++;
        setChanged();
        notifyObservers(this);
    }

    public int getNbcoups() {
        return this.nbCoup;
    }

    public int getScoreA() {
        return this.scoreA;
     }
    
     public int getScoreB() {
        return this.scoreB;
     }
/*
     **méthode pour rendre le gain de chaque etap
     **/
    public int getGainA(int numCoup) {
        return this.gainA;
    }

    public int getGainB(int numCoup) {
        return this.gainB;
    }

    public boolean AaCooperer(int numCoup) {
        
        return false;
    }
  
    public boolean BaCooperer(int numCoup) {
        
        return false;
    }
     
     
    
    
}
