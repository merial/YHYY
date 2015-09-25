/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulaattori;

/**
 *
 * HEI HALOO ÄLÄ TEE UUTTA HELAA???!?!?!?!?!??!?! käytä ihmis ja rng olioita!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!vitun gei homo banaani
 */
public class WC {

    private int helat;

    public WC() {

    }

    public WC (int helat) {
        this.helat = helat;
    }

    public void setHp(int uusiHP) {
        helat = uusiHP;
    }

    public double getHp() {
        return helat;

    }

    public void lisää(int helat) {
        this.helat += helat;
    }

    public void vähennä(int helat) {
        helat -= helat;
    }

}
