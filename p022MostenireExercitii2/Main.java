package p022MostenireExercitii2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        1.Creați clasa Student, cu proprietățile String name și int grade.
//        Creați clasele Premiant, StudentNormal și Corigent, fiecare moștenind clasa Student.
//        Premiantul va avea metoda mulțumește(), studentul normal va avea metoda citește(), iar corigentul va avea metoda învață().
//        Creați 3 studenți de fiecare tip și adăugați-i în liste specifice. Faceți toți studenții să apeleze metodele lor particulare.

        /*

        ArrayList<Premiant> premiants = new ArrayList<>(Arrays.asList(
                new Premiant("Tudor",10),
                new Premiant("Maria",10),
                new Premiant("Ion",10)
        ));

        ArrayList<StudentNormal> studentNormals = new ArrayList<>(Arrays.asList(
                new StudentNormal("Andrei",5),
                new StudentNormal("Sandu",8),
                new StudentNormal("Samuel",6)
        ));

        ArrayList<Corigent> corigents = new ArrayList<>(Arrays.asList(
                new Corigent("Sorin",2),
                new Corigent("Calin",3),
                new Corigent("Alex",4)
        ));

        for (Premiant premiant : premiants) {
            premiant.multumeste();
        }

        for (StudentNormal studentNormal : studentNormals) {
            studentNormal.citeste();
        }

        for (Corigent corigent : corigents) {
            corigent.invața();
        }

         */

//        2.Creați clasa Automobil, cu proprietatea String marca;, String model, boolean started si metodele startEngine() si stopEngine().
//        Fiecare metodă va opri și va porni mașina în funcție de câmpul "started".
//        Creați clasa Autobuz care să moștenească Automobil. Autobuzul va avea proprietățile int maxPassagers, int currentPassagers si metoda addPassagers().
//        Creați clasa Tesla care să moștenească Automobil. Mașina va avea proprietatea int batteryPercentage, care poate varia intre 0 si 100.
//        Va avea de asemenea metodele drive() și charge().
//        De fiecare dată când mașina este condusă, bateria va scădea 10%. De fiecare dată când este încărcată, bateria se va umple.
//        Creați un autobuz și o Tesla și apelați toate funcționalitățile acestora.

        Autobuz autobuz = new Autobuz("Mercedes", "Benz",30);

        Tesla tesla = new Tesla("Tesla", "3");

        for (int i = 0; i < 35; i++) {
            autobuz.addPassagers();
        }
        autobuz.startEngine();
        autobuz.stopEngine();

        tesla.startEngine();
        tesla.charge();
        for (int i = 0; i <12; i++) {
            tesla.drive();
        }
        tesla.charge();
        tesla.drive();
        tesla.startEngine();


    }
}
