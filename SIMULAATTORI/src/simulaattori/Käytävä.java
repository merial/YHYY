/*
 */
package simulaattori;


public class Käytävä {
    
    private Makuuhuone nuku;
    private Keittiö syö;
    private WC kylve;  
    private Uimaallas ui;
    private Syöpä tauti;
    

    public Käytävä(Makuuhuone nuku, Keittiö syö, WC kylve, Uimaallas ui, Syöpä tauti) {
        this.nuku = nuku;
        this.syö = syö;
        this.kylve = kylve;
        this.ui = ui;
        this.tauti = tauti;
                
    }
  
    
    
    
    public Käytävä(){
    }
    

    
    public String enterKäytävä(){
        String tulos = tauti.syöpäännytkö();
        return "Olet nyt talon käytävässä. "
                + "Voit mennä johonkin huoneista tai lopettaa simulaation.";
    }
    
    
}
