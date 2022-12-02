package p041AbstractizareExercitii2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        1.Creați clasa Passenger cu proprietatea String name și cu metoda abstractă useBenefits().
//        Creați clasele copil FirstClassPassenger, SecondClassPassenger si ThirdClassPassenger.
//        Adaugă 5 de pasageri de fiecare tip într-o listă și faceți-i pe toți să se bucure de beneficiile clasei (șampanie, alune, spațiu etc.)

        /*

        ArrayList<Passenger> pasageri = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            pasageri.add(new FirstClassPassenger("Ion "+i));
            pasageri.add(new SecondClassPassenger("Natalia "+i));
            pasageri.add(new ThirdClassPassenger("Ludmila "+i));
        }
        for (Passenger passenger : pasageri) {
            passenger.useBenefits();
        }

         */

//        2.Creați clasa abstracta Cryptocurrency, cu proprietatea double valueInUSD și metoda abstracta void changeValue().
//        Creați clasele copil Bitcoin, Ethereum și XRP, care vor avea propria lor implimentare a metodei changeValue()
//        Bitcoinul are o șansă de 60% să crească cu 100 de dolari și 40% să scadă cu 80 de dolari.
//        Ethereum are o șansă de 50% să crească cu 50 de dolari și 50% să scadă cu 50 de dolari.
//        XRP are o șansă de 80% să crească cu 10 dolari și 20% se scade cu 30 de dolari.
//
//        Inițializați câte o  monedă de fiecare tip, cu valoarea inițială 1000, și faceți fiecare moneda să fluctueze de 30 de ori.
//        Printați valoarea finală a monedelor.

        Bitcoin bitcoin = new Bitcoin(1000);
        Ethereum ethereum = new Ethereum(1000);
        XRP xrp = new XRP(1000);

        for (int i = 0; i < 30; i++) {
            bitcoin.changeValue();
            ethereum.changeValue();
            xrp.changeValue();
        }

        System.out.println("Valoare finala in dolari a bitcoinului este de "+bitcoin.valueInUSD);
        System.out.println("Valoare finala in dolari a ethereumlui este de "+ethereum.valueInUSD);
        System.out.println("Valoare finala in dolari a xrp-lui este de "+xrp.valueInUSD);
    }
}
