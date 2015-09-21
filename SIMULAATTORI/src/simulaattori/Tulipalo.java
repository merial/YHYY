/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulaattori;


public class Tulipalo {
    int palo;
    private Ihminen hp;
    double rng=(Math.floor(Math.random()*(20 -1+1))+1);

   public Tulipalo(Ihminen hela){
       hp=hela;
   } 
    
   public Tulipalo(){
       
   }
   
    public Tulipalo(int palo) {
        this.rng = palo;
    }
        
    public boolean kuoletko() {
        if (rng == 1) {
            hp.vähennä(hp.getHp());
            return true;
            
        } 
        else {
            return false;
        }
}
}    
    
    

