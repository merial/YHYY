/*
 */
package simulaattori;

public class Uimaallas {   
    
    private int helat;

    public Uimaallas() {
    }

    public Uimaallas(int helat) {
        this.helat = helat;
    }

    public void setHp(int helat) {
        this.helat = helat;
    }

    public double getHp() {
        return helat;

    }

    public void lisää(int helat) {
        helat += helat;
    }

    public void vähennä(double helat) {
        this.helat -= helat;
    }
    
}
