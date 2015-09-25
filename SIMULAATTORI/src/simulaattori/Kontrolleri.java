/*
 */
package simulaattori;

public class Kontrolleri {

    private Ihminen hp;
    private Jääkaappi ruoka;
    private R_N_G numero;
    private Tulipalo palo;
    private Keittiö syö;
    private Syöpä tauti;
    private Makuuhuone uni;
    private Uimaallas allas;
    private WC vessa;
    private Hukkuminen huku;
    private Kylpyamme kylve;
    
    
    Kontrolleri(){
    }
    
    Kontrolleri(Ihminen hp){
        this.hp = hp;
    }
    
    Kontrolleri(Jääkaappi ruoka){
        this.ruoka=ruoka;
    }
    
    Kontrolleri(R_N_G numero){
        this.numero=numero;
    }
    
    Kontrolleri(Tulipalo palo){
        this.palo=palo;
    }
    
    Kontrolleri(Keittiö syö){
        this.syö=syö;
    }
    
    Kontrolleri(Syöpä tauti){
        this.tauti= tauti;
    }
    
    Kontrolleri (Makuuhuone uni){
            this.uni=uni;
    }
        
    public void kuoletko(){
        palo.kuoletko();
    }
    
    
 
  
}
