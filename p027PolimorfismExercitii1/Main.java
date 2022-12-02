package p027PolimorfismExercitii1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        1.Creați clasa părinte Car și clasele copil Dacia, Mercedes și BMW.
//        Fiecare mașină va avea proprietatea String model, int maxSpeed și metoda reachMaxSpeed().
//        BMW-ul va ajunge la viteza maximă în 10 secunde.
//        Mercedes va ajunge la viteza maximă în 15 secunde.
//        Dacia va avea în plus metoda crushEngine(). Va ajunge la viteza maximă în 20 de secunde, iar în acel moment,
//        motorul va pica și se va afișa un mesaj corespunzător.
//        Adăugați o mașină de fiecare tip într-o listă, și faceți toate mașinile să ajungă la viteza maximă.

        /*

        ArrayList<Car> masini = new ArrayList<>(Arrays.asList(
                new Dacia("Sandero",120),
                new BMW("Seria 5",280),
                new Mercedes("Benz",190)
        ));
        for (Car masina : masini) {
            masina.reachMaxSpeed();
        }

         */


//        2.Creați clasa Plane, cu proprietatea int maxPassagers și metoda fly().
//        Clasa JetPlane va avea întotdeauna un maxim de 2 pasageri, și va zbura cu viteză mare.
//        Clasa NormalPlane va avea un număr maxim de pasageri setat prin constructor, care nu are niciodată voie să fie mai mic de 30.
//        În momentul în care avionul va zbura, o va face cu viteza normală.
//        Clasa PaperPlane întotdeauna va avea 0 pasageri. În momentul în care avioanele noastre de hârtie vor zbura ,o vor face încet.
//        Băgați într-o listă un avion de fiecare tip declarat, și faceți toate avioanele să zboare.

        ArrayList<Plane> avioane = new ArrayList<>();
        avioane.add(new JetPlane());
        avioane.add(new NormalPlane(40));
        avioane.add(new PaperPlane());

        for (Plane avion : avioane) {
            avion.fly();
        }

    }
}
