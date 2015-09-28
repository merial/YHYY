package simulaattori;

import javax.swing.*;

public class SIMULAATTORI {

    public static void main(String[] args) {

        Kontrolleri omaKontrolleri = new Kontrolleri();
        char K, k, E, e;
        int valinta;
        String nimi;

        JOptionPane.showMessageDialog(null, "Tervetuloa SIMulaatioon!\n"
                + "Voit liikkua huoneissa ja tehdä jotain ja jotain öö");

        nimi = JOptionPane.showInputDialog(null, "Kerro nimesi");

        JOptionPane.showMessageDialog(null, "Nimesi on siis " + omaKontrolleri.getNimi());

        System.exit(0);

    }

}
