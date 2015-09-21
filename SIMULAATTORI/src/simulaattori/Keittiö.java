/*
 *
 */
package simulaattori;


public class Keittiö {
    private Jääkaappi ruoka;
    private Tulipalo palo;
    private Ihminen hp;
    
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
    
    public String enterKeittiö(){
        return "Olet nyt keittiössä. Voit käydä jääkaapilla katsomassa "
                + "ruokatilanteen ja syömässä tai poistua takaisin käytävään.";
    }
      
    public String exitKeittiö(){
        hp.vähennä(10);
        return "Päätit sitten lähteä takaisin käytävään. Ok.";
    }
    
    
       
    
    
            
}
