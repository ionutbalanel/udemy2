package p036PacheteAsigment;

import p036PacheteAsigment.amusement.DisneyLand;
import p036PacheteAsigment.amusement.EdenLand;
import p036PacheteAsigment.people.Person;

public class Main {
    public static void main(String[] args) {
//        - Creați pachetele people și amusement;
//
//        - Introduceți în pachetul people clasa părinte Person cu proprietatea String name și metoda saluta();
//
//        - și clasele derivate Romanian, American și French;
//
//        - Fiecare persoană va saluta în limba nativă;
//
//        - Introduceți în pachetul amusement clasa AmusementPark, care va avea o listă de tip Person, și o metodă greetCustomer() care primește un parametru de tip Person;
//
//        - creați clasele DisneyLand și EdenLand;
//
//        - Fiecare parc de distracții își va saluta clienții prin afișarea la consolă a textului "Bun venit la parcul de distractii X", iar clientul va saluta înapoi;
//
//        - Testați funcționalitatea aplicației.

        DisneyLand disneyLand = new DisneyLand();
        EdenLand edenLand = new EdenLand();

        disneyLand.greetCustomer(new Person());
        edenLand.greetCustomer(new Person());
    }
}
