
package simulaattori;

import javax.swing.*;

public class SIMULAATTORI {
    
    public static void main(String[] args) {
        
        Kontrolleri omaKontrolleri = new Kontrolleri();
        char K, k, E, e;
        int valinta;
        String valintaStr;
        
        
        JOptionPane.showMessageDialog(null, "Tervetuloa SIMulaatioon!\n"
                + "Voit liikkua huoneissa ja tehdä jotain ja jotain öö");
        
        JOptionPane.showMessageDialog(null, omaKontrolleri.kuoletko());
        
        
        
    }
    
}
