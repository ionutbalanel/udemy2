package p040AbstractizareExercitii1;

public class Main {
    public static void main(String[] args) {
//        1.Creați clasa MusicalInstrument, care are metoda playMusic().
//        Creați clasele copil Guitar, Piano si Saxophone.
//        Inițializati un obiect de fiecare tip de instrument și faceți el să cânte.
//        Fiecare instrument trebuie să aibă propria lui implementare a metodei playMusic()

        Guitar guitar = new Guitar();
        Piano piano = new Piano();
        Saxophone saxophone = new Saxophone();

        guitar.playMusic();
        piano.playMusic();
        saxophone.playMusic();

//        2.Creați clasa SalesPerson, care are metoda MusicalInstrument sellInstrument(String instrumentDorit).
//        Metoda noastră va întreba utilizatorul ce instrument dorește, iar dacă acesta introduce un instrument valabil,
//        îi va face un sol în test, apoi îl va returna. In caz că instrumentul introdus nu este valabil, se va afișa un mesaj corespunzător.

        SalesPerson salesPerson = new SalesPerson();

        MusicalInstrument instrument1 = salesPerson.sellInstrument("guitar");
        MusicalInstrument instrument2 = salesPerson.sellInstrument("piano");
        MusicalInstrument instrument3 = salesPerson.sellInstrument("saxophone");
        MusicalInstrument instrument4 = salesPerson.sellInstrument("drums");

    }
}
