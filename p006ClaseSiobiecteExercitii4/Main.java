package p006ClaseSiobiecteExercitii4;

public class Main {
    public static void main(String[] args) {
        // 1. Creați clasa Radio, cu următoarele fielduri: boolean on, int volume, int currentPostIndex și ArrayList<String> posts.
        //    În momentul creării unui radio se vor adăuga 5 posturi în lista de posts a acestuia.
        //    Orice radio inițializat va avea prima dată postul curent 1, volumul 0 și va fi oprit.
        //    Radioul va avea următoarele funcționalități:
        //    turnOn(), turnOff() - aceste metode vor porni/opri radioul
        //    turnVolumeUp(), turnVolumeDown() - aceste metode vor modifica volumul radioului. Un radio poate avea volumul cuprins între 0 și 10.
        //    changePostForward(), changePostBackwords() - aceste metode vor modifica postul curent, pe baza listei de posturi din structura acestuia.
        //    displayRadioStatus() - această metodă va printa unul dintre următoarele mesaje în funcție de structura internă a radioului curent:
        //    ,,Radioul este oprit” / ,,Radioul este postul X, dat la volumul Y”.
        //    Creați un obiect de tip Radio. Schimbați de 5 ori volumul și de 10 ori postul curent (forward și backward)
        //    printind de asemenea de fiecare dată structura internă a radioului.

        /*

        Radio radio=new Radio();

        radio.turnOn();
        radio.turnVolumeUp();
        radio.changePostForward();
        radio.changePostBackwords();
        radio.changePostBackwords();
        radio.changePostBackwords();
        radio.changePostBackwords();

         */


        // 2. Creați clasa Pencil cu fieldurile String color, int remainingInk si metoda write(), care va primi un parametru de tip String text.
        //    Culoarea pixului va primi ca parametru în constructor, iar orice pix inițializat va avea 1000 remaining ink.
        //    Metoda write va consuma 1 remaining ink pentru fiecare literă/număr primite în parametrul acesteia de tip String.
        //    Inițializat cu un pix, iar prin intermediul metodei write, printați la consola tot ce știți despre clase si obiecte.

        /*

        Pencil pencil=new Pencil("Albastru");
        pencil.write("Bun venit la Academia Programatorilor");
        System.out.println(pencil.remainingInk);

         */


    }
}
