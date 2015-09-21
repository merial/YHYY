package simulaattori;

public class Syöpä {
    private String pöpö;
    double rng = Math.floor(Math.random()*(20-1+1))+1;
    
    public Syöpä () {
    }
    
    public Syöpä (String pöpö){
        this.pöpö = pöpö;
    }
    public void setSyöpä (String uusiSyöpä) {
        pöpö = uusiSyöpä;
    }
    public boolean syöpäännytkö() {
    if (rng==1){
        return true;
    }
    else {
        return false;
    }
}
    
    
}
