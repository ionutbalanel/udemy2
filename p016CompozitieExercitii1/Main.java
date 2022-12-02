package p016CompozitieExercitii1;

public class Main {
    public static void main(String[] args) {
//        1.Creați clasa Laptop, cu fieldurile id (unic pentru fiecare laptop), String brand și String model. Creați clasa Employee.
//        Fiecare angajat va avea un nume, prenume și un laptop.
//        Generați 3 angajați, fiecare cu laptopul lui personal, și printați detaliile fiecăruia la consolă.

        /*

        Laptop laptop1 = new Laptop("marca1","model1");
        Laptop laptop2 = new Laptop("marca2","model2");
        Laptop laptop3 = new Laptop("marca3","model3");

        Employee employee1 = new Employee("fN1","lN1",laptop1);
        Employee employee2 = new Employee("fN2","lN2",laptop2);
        Employee employee3 = new Employee("fN3","lN3",laptop3);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

         */

//        2.Creați clasa Person, fiecare persoană va avea un firstName, lastName de tip String și un bestFriend de tip Person.
//        Creați metoda printFriendship, în care fiecare persoană își va printa prietenul cel mai bun sub forma
//        ,,X is best friends with Y’’ unde X și Y reprezintă doar firstName-ul persoanei respective.

        /*

        Person person1 = new Person("Ion","Balan",null);
        Person person2 = new Person("Cristina","Vangheli",person1);
        Person person3 = new Person("Maria","Codreanu",person2);
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

         */


//        3.Creați clasa FamilyMember, cu proprietățile String name, int age și ArrayList<FamilyMember>familyMember.
//        Fiecare familyMember va avea o metodă addFamilyMember(FamilyMember familyMember), care va adăuga un nou membru al familiei în lista sa.
//        De asemenea, vom avea metoda printMyFamily(), care printează toate detalii familiei fiecărei persoane.
//        Testați funcționalitățile aplicației.

        /*

        FamilyMember member1 = new FamilyMember("Tudor",25);
        FamilyMember member2 = new FamilyMember("Diana",15);

        FamilyMember member3 = new FamilyMember("Ana",22);
        FamilyMember member4 = new FamilyMember("Maria",15);

        member1.addFamilyMember(member2);
        member1.addFamilyMember(member3);
        member1.addFamilyMember(member4);

        member1.printMyFamily();
        member2.printMyFamily();

         */

//        4.Creați clasa Tire, cu proprietatea int size.
//        Creați clasa Engine, cu proprietatea int capacity.
//        Creați clasa Car, cu proprietatea String brand, String model, Engine engine, Tire tire1, Tire tire2, Tire tire3, Tire tire4, Tire exchangeTire.
//        Toate cauciucurile mașinii trebuiesc să fie de același la inițializare. Dacă nu se va afișa mesaj corespunzător.
//        Generați 3 mașini fiecare cu piese diferite, apoi printați detaliile acestora.

        Car car = new Car("Audi","Q7", new Engine(3000),
                new Tire(40),new Tire(40),new Tire(40),new Tire(40),new Tire(40));
        System.out.println(car);

        Car car2 = new Car("Bmw","X3", new Engine(2500),
                new Tire(40),new Tire(40),new Tire(40),new Tire(30),new Tire(40));
        System.out.println(car2);
    }
}
