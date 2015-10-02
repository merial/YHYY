package simulaattori;

import javax.swing.*;

public class SIMULAATTORI {

    public static void main(String[] args) {

        Kontrolleri omaKontrolleri = new Kontrolleri();
        char K, k, E, e;
        int valinta;
        String nimi;
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
        
        
        JOptionPane.showMessageDialog(null, "Tervetuloa SIMulaatioon!\n"
                + "Voit liikkua huoneissa ja tehdä jotain ja jotain öö");

        nimi = JOptionPane.showInputDialog(null, "Kerro nimesi");
        hp.setNimi(nimi);
        
        JOptionPane.showMessageDialog(null, "Hei "+hp.getNimi()+"!");
        
        System.exit(0);

    }

}
