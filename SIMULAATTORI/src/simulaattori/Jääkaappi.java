/*
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
        if (ruoka>=1){
            ruoka -= 1;
            hp.lisää(20);
            return "OM NOM NOM! Sait +20hp, nyt sinulla on " +hp.getHp()+" hp.";
        }
        else {
            return "Jääkaapissa ei ole enää ruokaa!!!!!!!!! "
                    + "Maybe die... Soon...";
    
 
    }
    
    
}
}
        
   

