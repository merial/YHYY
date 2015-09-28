/*
 */
package simulaattori;


public class Tulipalo {
    int palo;
    private Ihminen hp;  
    private R_N_G numero;

    public Tulipalo(Ihminen hela){
       hp=hela;
    } 

    public Tulipalo(int palo, Ihminen hp, R_N_G numero) {
        this.palo = palo;
        this.hp = hp;
        this.numero = numero;
    }
    
    public Tulipalo(R_N_G numero){
        this.numero = numero;
    }
    
    public Tulipalo(){
    }
   
    public Tulipalo(int palo) {
        this.palo = palo;
    }
        
    public String tuleekopalo(){
        double rng= (int) numero.getRng();
        if (rng == 1) {
            return kuoletko();
        }    
        else {
        return null;
        }
        
    }
    
    public String kuoletko() {
        double rng= (int) numero.getRng4();
        if (rng == 1) {
            hp.vähennä(hp.getHp());
            System.exit(0);
            return "YHYY syttyi kamala tulipalo!!!! Kuolit!!!\nSimssisi päättyi siis tähän. ;__;";
        } 
        else {
            return "YHYY syttyi kamala tulipalo!!!! Mutta huh pelastuit juuri ja juuri!";
        }
        
        
}
}    
    
    

