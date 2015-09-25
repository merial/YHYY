/*YHYYYYYYYYYYYYYYY
 */
package simulaattori;

public class Ihminen {

    private int hp = 100;

    public Ihminen() {
    }

    public Ihminen(int hp) {
        this.hp = hp;
    }

    public void setHp(int uusiHp) {
        hp = uusiHp;
    }

    public int getHp() {
        return hp;
    }

    public void vähennä(int hela) {
        hp -= hela;
    }
    public void lisää (int hela) {
        hp+= hela;
    }
    
}
