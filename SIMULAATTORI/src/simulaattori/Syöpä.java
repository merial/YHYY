package simulaattori;

public class Syöpä {


    private R_N_G nro;
    double rng = (int) nro.getRng();
    private Ihminen hp;

    public Syöpä() {
    }

    public Syöpä(R_N_G numero) {
        nro = numero;
     
    }




    public String syöpäännytkö() {
        if (rng==1) {
            hp.vähennä(hp.getHp());
            System.exit(0);
            return "YHYY!!! Sait syövän!!! Pelisi on ohi.";
            
        }
        else {
            return null;
        }
        

}
}
