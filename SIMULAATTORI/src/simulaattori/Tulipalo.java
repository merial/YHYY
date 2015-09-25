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
    
    public Tulipalo(R_N_G numero){
        this.numero = numero;
    }
    
    public Tulipalo(){
    }
   
    public Tulipalo(int palo) {
        this.palo = palo;
    }
        
    public void kuoletko() {
        double rng= (int) numero.getRng();
        if (rng == 1) {
            hp.vähennä(hp.getHp());
            System.out.println("YHYY syttyi kamala tulipalo!!!! Kuolit!!!\nSimssisi päättyi siis tähän. ;__;");
            System.exit(0);
        } 
        else {
            System.out.println("YHYY syttyi kamala tulipalo!!!! Mutta huh pelastuit juuri ja juuri!");
        }
        
}
}    
    
    

