/*
 */
package simulaattori;

public class Hukkuminen {

    private R_N_G nro;
    double rng = (int) nro.getRng();
    private Ihminen hp;

    public Hukkuminen() {
    }

    public Hukkuminen(R_N_G numero) {
        nro = numero;
    }

    public String hukutko() {
        if (rng == 1) {
            hp.vähennä(hp.getHp());
            System.exit(0);
            return "YHYY!!! Hukuit!!! Pelisi on ohi.";

        } else {
            return null;
        }

    }
}
