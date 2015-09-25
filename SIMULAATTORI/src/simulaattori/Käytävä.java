/*
 * 
 */
package simulaattori;


public class Käytävä {
    private Makuuhuone nuku;
    private Keittiö syö;
    private WC kylve;
    private Uimaallas ui;
    
    
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
    
    
}
