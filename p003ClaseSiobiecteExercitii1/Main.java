package p003ClaseSiobiecteExercitii1;

public class Main {
    public static void main(String[] args) {
        // 1. Creați o clasă numită Student cu variabila string name și variabila int age.
        //    Alocați valoarea age cu 22 și cea a numelui cu John prin crearea unui obiect al clasei Student.

        /*

        Student student1 = new Student("John", 22);
//        student1.name="John";
//        student1.age=22;

        System.out.println(student1.name);

         */

        // 2. Modificați clasa Student adăugând un field String telephoneNumber. Creații metoda call, care va primi
        //    ca parametru un String number. Metoda vă afișa următorul text: ,,Studentul X, având numărul
        //    de telefon Y, a făcut un call către numărul de telefon Z”.

        /*

        Student student2 = new Student("John", 22, "069543039");
        student2.call("025049462");

         */

        // 3. Scrieți un program care să afișeze informațiile (numele, anul înscrierii, salariul, adresa) a trei angajați
        //    prin crearea unei clase numită Employee afișarea trebuie să fie următoarea:

        //    Name		Year of joining	Address
        //    Robert	1994			64C - Wall Street
        //    Sam		2000			68D - Wall Street
        //    John		1999			26B - Wall Street

        /*

        Employee employee1 = new Employee("Andrei", 2010, "Bucuresti", 10000);
        Employee employee2 = new Employee("Tudor", 2019, "Bucuresti", 1000);
        Employee employee3 = new Employee("Gabi", 2018, "Bucuresti", 1000);


        employee1.showDetails();
        employee2.showDetails();
        employee3.showDetails();

         */

    }
}
