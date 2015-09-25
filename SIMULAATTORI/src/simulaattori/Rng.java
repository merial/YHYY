/*
 */
package simulaattori;


public class Rng {
    int numero;
    
    public Rng(){  
    }
    
    public Rng(int numero){
        this.numero = numero;
    }
    
    public double getRng(){
        return (Math.floor(Math.random()*(20-1+1)+1));
    }
    
    public double getRng2(){
        return (Math.floor(Math.random()*(50-1+1)+1));
    }
    
    public double getRng3(){
        return (Math.floor(Math.random()*(10-1+1)+1));
    }
}
