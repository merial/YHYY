/*
 */
package simulaattori;


public class Keittiö {
    private Jääkaappi ruoka;
    private Tulipalo palo;
    private Ihminen hp;
    private Syöpä tauti;
    
    public Keittiö(Syöpä tauti){
        this.tauti = tauti;
    }          
            
    public Keittiö(Jääkaappi ruoka){
        this.ruoka = ruoka;
    }
    
    public Keittiö(Tulipalo palo){
        this.palo = palo;
    }
    
    public Keittiö(Ihminen hp){
        this.hp = hp;
    }
    
    public Keittiö(){
        
    }

    public Keittiö(Jääkaappi ruoka, Tulipalo palo, Ihminen hp, Syöpä tauti) {
        this.ruoka = ruoka;
        this.palo = palo;
        this.hp = hp;
        this.tauti = tauti;
    }
    
    public String enterKeittiö(){
        return "Olet nyt keittiössä. Voit käydä jääkaapilla katsomassa "
                + "ruokatilanteen ja syömässä tai poistua takaisin käytävään.";
        //+switch syönti/paluu käytävään
    }
    
    public String gotoJääkaappi(){
        return "Jääkaapissa on jäljellä "+ruoka.getRuoka()+" annosta. "
                + "Jos haluat syödä, valitse k ja jos et, valitse e. ";
        //switch tän homman jälkeen si. Jos ei syö niin poistuu
        //keittiöstä kokonaan takasin käytävään
    }
      
    public void exitKeittiö(){
        hp.vähennä(10);
        
    }
    
    public void getTulipalo(){ //tää sitte jonku soutin sisään 
        palo.kuoletko(); 
    }
       
    
    
            
}
