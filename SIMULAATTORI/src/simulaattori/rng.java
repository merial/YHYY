/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulaattori;


public class rng {
    int numero;
    
    public rng(){
        
    }
    
    public rng(int numero){
        this.numero = numero;
    }
    
    public double getRng(){
        return (Math.floor(Math.random()*(20 -1+1)+1));
    }
    
}
