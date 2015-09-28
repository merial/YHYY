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
    
    public String gotoPönttö() {
        hp.lisää(10);
        return "Olet nyt pöntöllä. Saat 10 helaa lisää. Sinulla on " + hp.getHp()
        + ". Voit mennä kylpyyn tai takaisin käytävään.";
    }
    
    public String enterAmme() {
        hp.lisää(10);
        return "Olet kylvyssä. Saat 10 helaa. Sinulla on " + hp.getHp() +
                "Voit poistua wc:stä tai mennä pöntölle.";
    }

    public void exitWC() {
        hp.vähennä(10);
    }
}