package p045InterfeteExercitii3;

public class Main {
    public static void main(String[] args) {
//        1.Se dau clasele Calculator (String marca, int ram, boolean on), Laptop (String marca, int ram, boolean on) si Radio (String currentPost).
//        Definiții interfețele Startable (cu metoda start()), Stopable (cu metoda stop()) si Changeble (cu metoda changePost(String newPost))
//        Legați clasele de interfețe și testați funcționalitățile.

        Radio radio = new Radio("RockFM");
        PC pc = new PC("Samsung", 8);
        Laptop laptop = new Laptop("Apple", 12);

        radio.start();
        radio.changePost("Pro FM");
        radio.stop();

        pc.start();
        pc.stop();

        laptop.start();
        laptop.stop();


//        2.Clientul vrea să deschid un magazin de jucării. Jucăriile vor avea o culoare care trebuie returnată, se vor putea mișca și vor putea zbura.
//        Jucării valabile: PlaneToy, CarToy si DollHouse. Definiți clase de și legați-le de interfețe specifice.
//        Apelați funcționalitățile.

    }
}
