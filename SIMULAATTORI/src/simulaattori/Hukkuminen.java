/*
 */
package simulaattori;

public class Hukkuminen {

    private String hups;
    private R_N_G nro;
    double rng = (int) nro.getRng();
    private Ihminen hp;

    public Hukkuminen() {
    }

    public Hukkuminen(R_N_G numero) {
        nro = numero;
    }

    public Hukkuminen(String hups) {
        this.hups = hups;
    }

    public void setHups(String uusiHups) {
        hups = uusiHups;
    }

    public void hukutko() {
        if (rng==1) {
            hp.vähennä(hp.getHp());
            System.out.println("YHYYY");
        }
        else {
            System.out.println("JEEEE");
        }

}
}