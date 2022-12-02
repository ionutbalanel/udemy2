package p004ClaseSiobiecteExercitii2;

public class Main {
    public static void main(String[] args) {
        // 1. Să se creeze clasa Person. Aceasta să conțină atributele (câmpurile) name, age, sex, address și
        //    funcționalitățile (metodele) walk(), eat(), sleep().
        //    Creați 2 obiecte, un băiat și o fată, care să accesezi aceleași atribute și metode, dar cu rezultate diferite.
        //    Metodele vor afișa la consolă un text corespunzător.

        //    Afișați ambele obiecte sub forma:
        //    ,,Salut, mă numesc …, am … ani, locuiesc în … ” - //  accesând câmpurile
        //    ,,Johnny merge pe stradă.” // accesorii metodele
        //    ,,Maryi doarme până târziu.” // Scrieți voi logica și la celelalte metode

        /*

        Person baiat = new Person("Mihnea", 25, 'M',"Bucuresti");
        Person fata = new Person("Maria", 22, 'F',"Cluj");

        baiat.eat();
        baiat.sleep();
        baiat.walk();
        baiat.showDetails();

        fata.eat();
        fata.sleep();
        fata.walk();
        fata.showDetails();

         */

        // 2. Creați clasa Person cu următoarele fielduri: name, height, energy, weight și următoarele funcționalități:
        //    eat, learn, sleep, exercise.
        //    Fiecare metodă va schimba stare internă a persoanei.
        //    Creați un obiect de tip Person care va apela fiecare dintre cele 4 metode.
        //    Printați structura persoanei respective după apelarea fiecărei metode.

        /*

        Persoana persoana = new Persoana("Tudor",185, 75);
        persoana.eat();
        persoana.eat();
        persoana.sleep();
        persoana.exercise();
        persoana.exercise();
        persoana.exercise();

        System.out.println(persoana);

         */

        // 3. Creați clasa Car, cu următoarele câmpuri: String brand, String model, int year, boolean on,
        //    și următoarele metode: printDetails(), startEngine și stopEngine vor face lucruri diferite în funcție de starea internă a mașinii noastre,
        //    stare pe care pe care de asemenea o va modifica.
        //    Creați o mașină și apelați metodele acesteia.

        /*

        Car audi = new Car("Audi Q7",2010);

        audi.stopEngine();
        audi.startEngine();
        audi.stopEngine();

        audi.printDetails();

         */
    }
}
