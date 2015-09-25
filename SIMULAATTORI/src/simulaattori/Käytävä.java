/*
 */
package simulaattori;


public class Käytävä {
    
    private Makuuhuone nuku;
    private Keittiö syö;
    private WC kylve;
    private Uimaallas ui;
    private Syöpä tauti;
    
    
    public Käytävä(){
    }
    
    public Käytävä(Makuuhuone nuku){
          this.nuku=nuku;      
    }
    
    public Käytävä(Keittiö syö){
        this.syö=syö;
    }
    
    public Käytävä(WC kylve){
        this.kylve=kylve;
    }
    
    public Käytävä(Uimaallas ui){
        this.ui = ui;
    }
    
    public Käytävä(Syöpä tauti){
        this.tauti=tauti;
    }
    
    public String enterKäytävä(){
        tauti.syöpäännytkö();
        return "Olet nyt talon käytävässä. "
                + "Voit mennä johonkin huoneista tai lopettaa simulaation.";
    }
    
    
}
