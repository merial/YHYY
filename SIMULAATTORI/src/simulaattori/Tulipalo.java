/*
 * 
 */
package simulaattori;


public class Tulipalo {
    int palo;
    private Ihminen hp;  //Ihminen-olio
    double rng=(Math.floor(Math.random()*(20 -1+1))+1); //1/20 tsäänssi palaa kuoliaaxi

    public Tulipalo(Ihminen hela){
       hp=hela;
    } 
    
    public Tulipalo(){
    }
   
    public Tulipalo(int palo) {
        this.rng = palo;
    }
        
    public String kuoletko() {
        if (rng == 1) {
            hp.vähennä(hp.getHp());
            return "Oho kuolit.";
            
        } 
        else {
            return "Huh säästyit!";
        }
}
}    
    
    

