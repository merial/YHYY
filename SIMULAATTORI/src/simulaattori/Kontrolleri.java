/*
 */
package simulaattori;

public class Kontrolleri {

    private Ihminen hp;
    private Jääkaappi ruoka;
    private R_N_G numero;
    private Tulipalo palo;
    private Keittiö syö;
    private Syöpä tauti;
    private Makuuhuone uni;
    private Uimaallas allas;
    private WC vessa;
    private Hukkuminen huku;
    private Käytävä kaytava;
    
    
    Kontrolleri(){
        
        Ihminen hp = new Ihminen();
        R_N_G numero = new R_N_G();
        Syöpä tauti = new Syöpä(numero);
        Jääkaappi ruoka = new Jääkaappi(hp,5);
        Keittiö syo = new Keittiö(ruoka);
        Makuuhuone uni = new Makuuhuone();
        Hukkuminen huku = new Hukkuminen();
        Uimaallas allas = new Uimaallas();
        Tulipalo palo = new Tulipalo(hp);
        WC vessa = new WC();
        
    }
    

    public void kuoletko(){
        palo.kuoletko();
    }
    
}
