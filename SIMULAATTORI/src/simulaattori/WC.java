/*
 */
package simulaattori;

/**
 *
 * HEI HALOO ÄLÄ TEE UUTTA HELAA???!?!?!?!?!??!?! käytä ihmis ja rng
 * olioita!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! vitun gei homo
 * banaani
 */
public class WC {

    private Ihminen hp;
    private Hukkuminen hups;

    public WC() {

    }

    public WC(Ihminen hp) {
        this.hp = hp;
    }

    public void exitWC() {
        hp.vähennä(10);
    }
}
