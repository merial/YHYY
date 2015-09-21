/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulaattori;


public class Jääkaappi {
    private int ruoka=5; // 1x ruoka palauttaa 20hp
    private Ihminen hp;
    
    
    public Jääkaappi(Ihminen hela){
        hp = hela;
    }
    
    public Jääkaappi(){
        
    }
    
    public Jääkaappi(int ruoka){
        this.ruoka = ruoka;
        
    }
    public void setRuoka(int uusiRuoka){
        ruoka = uusiRuoka;
    }
    
    public int getRuoka(){
        return ruoka; //ruokamäärä jääkaapissa
    }
    
    public String miinusRuoka(int ruoka){
        if (ruoka<1){
            ruoka -= 1;
            return "OM NOM NOM! Sait +20hp";
        }
        else {
            return "Jääkaapissa ei ole enää ruokaa!!!!!!!!! Maybe die.......";
    
 
    }
    
    
}
}
        
   

