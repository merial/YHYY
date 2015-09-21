/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulaattori;


public class Jääkaappi {
    private int ruoka=5; //ruoka palauttaa 20hp
    
    public Jääkaappi(){
        
    }
    
    public Jääkaappi(int ruoka){
        this.ruoka = ruoka;
        
    }
    
    public int getRuoka(){
        return ruoka;
    }
    
    public void miinusRuoka(){
        
    }
    
    public boolean syö(int ruoka){
        if (jääkaappi.miinusRuoka(ruoka)){
            return true; 
    }
        else {
            return false;
        }
}
