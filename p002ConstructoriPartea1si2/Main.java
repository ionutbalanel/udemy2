package p002ConstructoriPartea1si2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Telefon telefonSamsung = new Telefon("Samsung", "S9", 4, 999.9);
        Telefon telefonIphone = new Telefon("Iphone", "12", 8, 3999.99);
        Telefon telefonIncomplet = new Telefon("Samsung", "A21s");
        Telefon telefonIncomplet2 = new Telefon("Samsung", "A21s", 12);

        /*

        telefonSamsung.marca = "Samsung";
        telefonSamsung.model = "S9";
        telefonSamsung.memorieRam = 4;
        telefonSamsung.pret = 999.99;

        telefonIphone.marca = "Iphone";
        telefonIphone.model = "12";
        telefonIphone.memorieRam = 8;
        telefonIphone.pret = 3999.99;

         */

        System.out.println(telefonSamsung);
        System.out.println(telefonIphone);
        System.out.println(telefonIncomplet);
        System.out.println(telefonIncomplet2);

        System.out.println(telefonIphone.memorieRam);
        /*

        telefonSamsung.suna();
        telefonIphone.suna();
        telefonIncomplet.suna();
        telefonIncomplet2.suna();

         */

        ArrayList<Telefon> telefoane = new ArrayList<>(Arrays.asList(telefonIncomplet, telefonIncomplet2));
//        telefoane.add(telefonSamsung);
//        telefoane.add(telefonIphone);

        for (Telefon telefon : telefoane) {
            telefon.suna();
        }


    }
}
