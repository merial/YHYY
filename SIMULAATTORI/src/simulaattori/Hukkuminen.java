/*
 */
package simulaattori;

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
