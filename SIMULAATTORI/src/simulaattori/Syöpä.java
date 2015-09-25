package simulaattori;

public class Syöpä {
    
    private String pöpö;
    private Rng nro;
    
    public Syöpä () {
    }
    public Syöpä (Rng numero){
       nro = numero; 
    }
    
    public Syöpä (String pöpö){
        this.pöpö = pöpö;
    }
    public void setSyöpä (String uusiSyöpä) {
        pöpö = uusiSyöpä;
    }
    
    public boolean syöpäännytkö() {
    if (nro.getRng()==1){
        return true;
    }
    else {
        return false;
    }
}
    
    
}
