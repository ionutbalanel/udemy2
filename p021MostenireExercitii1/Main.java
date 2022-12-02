package p021MostenireExercitii1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        1.Scrieți clasa Animal, cu proprietățile String name, int age si metoda eat().
//        Scrieți clasa copil Dog, cu metoda bark().
//        Scrieți clasa copil Cat, cu metoda miaw().
//        Scrieți clasa copil Parrot, cu metoda talk(String whatToSay).

//        Creați 3 animale de fiecare rasă și adăugați le în liste specifice
//        Faceți toate animalele să mănânce.
//        Faceți toți câinii să latre, pisicile să miaune și papagalii să vorbească

        /*

        Dog dog1 = new Dog("Max", 8);
        Dog dog2 = new Dog("Avva", 10);
        Dog dog3 = new Dog("Adolf", 8);

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);

        ArrayList<Cat> cats = new ArrayList<>(Arrays.asList(
                new Cat("Nala",5),
                new Cat("Pepper",3),
                new Cat("Ella",9)
        ));

        ArrayList<Parrot> parrots = new ArrayList<>(Arrays.asList(
                new Parrot("Coco",5),
                new Parrot("Coco2",3),
                new Parrot("Coco3",9)
        ));

        for (Dog dog : dogs) {
            dog.bark();
            dog.eat();
        }
        System.out.println("    ");

        for (Cat cat : cats) {
            cat.miaw();
            cat.eat();
        }
        System.out.println("    ");

        for (Parrot parrot : parrots) {
            parrot.eat();
            parrot.talk("coco coco");
        }
        System.out.println("    ");

         */

//        2.Creați clasa Hero, cu proprietățile String name, String hidenIdentity și metoda atack().
//        Creați clasa copil Superman, căreia să îi adăugați metoda fly().
//        Creați clasa a copil Batman, căruia să îi adăugați metoda useGadgets().
//        Creați clasa copil Speedster, careia să ii adăugați metoda speedRun().
//        Clasa Speedster, va avea trei clase copil: Flash, KidFlash si TornadoTwins.
//        Flash va avea metoda timeTravel(), KidFlash savePerson(), si TornadoTwins doubleRun().

//        Creați o instanță a fiecărui erou și apelați toate funcționalitățile acestuia.

        Superman superman = new Superman("Superman","Cark Kent");
        Batman batman = new Batman("Batman","Bruce Wayne");
        Flash flash = new Flash("Flash","Berry Allen");
        KidFlash kidFlash = new KidFlash("KidFlash","Wally West");
        TornadoTwins tornadoTwins = new TornadoTwins("Tornado Twins"," ?????");

        superman.atack();
        superman.fly();

        batman.atack();
        batman.useGadgets();

        flash.atack();
        flash.timeTravel();
        flash.speedRun();

        kidFlash.atack();
        kidFlash.savePerson();
        kidFlash.speedRun();



    }
}
