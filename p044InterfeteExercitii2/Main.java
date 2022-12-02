package p044InterfeteExercitii2;

import p020MostenirePartea2.IPhone;
import p044InterfeteExercitii2.video2.Motorola;
import p044InterfeteExercitii2.video2.Nokia;
import p044InterfeteExercitii2.video2.Samsung;
import p044InterfeteExercitii2.video2.iPhone;

public class Main {
    public static void main(String[] args) {
//        1.Declarați clasele Human, Cat, Submarine și interfețele Swimable, cu metoda void swim() si Eatable.
//        cu metoda void eat().
//        Stabiliți contractele necesare.
//        Inițializat un obiect de tip Human, Cat și Submarine și Apelați funcționalitățile specifice.

        /*

        Cat cat = new Cat();
        Human human = new Human();
        Submarine submarine = new Submarine();

        cat.eat();

        human.eat();
        human.swim();

        submarine.swim();

         */

//        2.Se dau interfețele TelephoneBehavior si SmartphoneBehavior.
//        Un telefon poate sună și poate fi încărcat.
//        Un smartphone poate suna, poate fi încărcat, poate face screenshoturi și poate descărca aplicații de pe Store.
//        Definiți clasele Nokia, Motorola, Samsung și iPhone și legați-le de interfețele specifice. Testați funcționalitățile.

        Samsung samsung = new Samsung();
        iPhone iPhone = new iPhone();
        Nokia nokia = new Nokia();
        Motorola motorola = new Motorola();

        samsung.call("0245684225");
        samsung.charge();
        samsung.downloadAppFromStore("Instagram");
        samsung.takeScreenshot();

        iPhone.call("454547878312");
        iPhone.charge();
        iPhone.downloadAppFromStore("Facebook");
        iPhone.takeScreenshot();

        nokia.call("454974212121");
        nokia.charge();

        motorola.call("44121212124550");
        motorola.charge();






    }
}
