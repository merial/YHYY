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
    public String nimi;
    public int hela;
    public int miinushela;
    public int plushela;
    
    
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
        Kylpyamme amme = new Kylpyamme();
        WC vessa = new WC();
        
    }
    
    public String setNimi(){
        hp.setNimi(nimi);
        return null;
    }
    public String getNimi(){
        return hp.getNimi();
    }
    public void setHp(){
        hp.setHp(hela);
    }
    public int getHp(){
        return hp.getHp();
    }
    public void vahennaHp(){
        hp.vähennä(miinushela);
    }
    public void lisaaHp(){
        hp.lisää(plushela);
    }
    
    
    
    public String kuoletko(){
        return palo.kuoletko();
    }
    
    
}
