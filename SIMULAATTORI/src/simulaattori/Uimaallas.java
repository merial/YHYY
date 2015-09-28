/*
 */
package simulaattori;

public class Uimaallas {   
    
    private Ihminen hp;
    private Hukkuminen hups;

    public Uimaallas() {
    }

    public Uimaallas(Ihminen hp) {
        this.hp = hp;
    }
    
    public String enterKäytävä(){
                String tulos = hups.hukutko();
                return "Olet uimassa, voit mennä käytävään.";
    }
}
