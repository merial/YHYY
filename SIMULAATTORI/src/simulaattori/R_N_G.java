/*
 */
package simulaattori;

public class R_N_G {
    int numero;
    
    public R_N_G(){  
    }
    
    public R_N_G(int numero){
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
    
    public double getRng4(){
        return (Math.floor(Math.random()*2+1));
    }
}
