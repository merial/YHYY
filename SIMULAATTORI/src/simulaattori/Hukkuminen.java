/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulaattori;

/**
 *
 * @author Omistaja
 */
public class Hukkuminen {

    double rng = Math.floor(Math.random() * (20 - 1 + 1)) + 1;

    public boolean hukutko() {
        if (rng == 1) {
            return true;
        } else {
            return false;
        }
    }
}
