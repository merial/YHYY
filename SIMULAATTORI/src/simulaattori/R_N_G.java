/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulaattori;

/**
 *
 * @author Omistaja
 */
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
}
