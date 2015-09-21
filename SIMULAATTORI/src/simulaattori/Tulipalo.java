/*
 * 
 */
package simulaattori;


public class Tulipalo {
    int palo;
    private Ihminen hp;  //Ihminen-olio
    private rng numero;

    public Tulipalo(Ihminen hela){
       hp=hela;
    } 
    
    public Tulipalo(rng numero){
        this.numero = numero;
    }
    
    public Tulipalo(){
    }
   
    public Tulipalo(int palo) {
        this.palo = palo;
    }
        
    public double kuoletko() {
        return numero.getRng();
        if (numero== 1) {
            hp.vähennä(hp.getHp());
            System.out.println("Oho kuolit.");
            
        } 
        else {
            System.out.println("Huh pelastuis!");
        }
        return 0;
}
}    
    
    

