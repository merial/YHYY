package simulaattori;

public class Syöpä {

    private String pöpö;
    private Rng nro;
    double rng = (int) nro.getRng();
    private Ihminen hp;

    public Syöpä() {
    }

    public Syöpä(Rng numero) {
        nro = numero;
    }

    public Syöpä(String pöpö) {
        this.pöpö = pöpö;
    }

    public void setSyöpä(String uusiSyöpä) {
        pöpö = uusiSyöpä;
    }

    public void syöpäännytkö() {
        if (rng==1) {
            hp.vähennä(hp.getHp());
            System.out.println("YHYYY");
        }
        else {
            System.out.println("JEEEE");
        }

}
}
