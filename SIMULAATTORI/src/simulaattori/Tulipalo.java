/*
 * 
 */
package simulaattori;


public class Tulipalo {
    int palo;
    private Ihminen hp;  //Ihminen-olio
    private Rng1 numero;

    public Tulipalo(Ihminen hela){
       hp=hela;
    } 
    
    public Tulipalo(Rng1 numero){
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
            System.out.println("YHYY kuolit.");
            
        } 
        else {
            System.out.println("Huh pelastuit!");
        }
        
}
}    
    
    

