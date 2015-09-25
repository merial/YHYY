/*
 * 
 */
package simulaattori;

public class MerinKontrolleri {

    private Ihminen hp;
    private Jääkaappi ruoka;
    private R_N_G numero;
    private Tulipalo palo;
    private Keittiö syö;
    private Syöpä tauti;
    
    MerinKontrolleri(){
    }
    
    MerinKontrolleri(Ihminen hp){
        this.hp = hp;
    }
    
    MerinKontrolleri(Jääkaappi ruoka){
        this.ruoka=ruoka;
    }
    
    MerinKontrolleri(R_N_G numero){
        this.numero=numero;
    }
    
    MerinKontrolleri(Tulipalo palo){
        this.palo=palo;
    }
    
    MerinKontrolleri(Keittiö syö){
        this.syö=syö;
    }
    
    MerinKontrolleri(Syöpä tauti){
        this.tauti= tauti;
    }
    
    public void kuoletko(){
        palo.kuoletko();
    }
    
    
 
  
}
