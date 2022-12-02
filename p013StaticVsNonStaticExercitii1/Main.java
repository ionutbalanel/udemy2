package p013StaticVsNonStaticExercitii1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        1.Creați clasa Student. Studentul va avea un int id și un String name.
//        Suprascrieți metoda toString pentru a afișa toate detaliile studentului.
//        Creați 10 studenți, fiecare cu un id unic, care să fie incrementat în momentul initializarii.

        /*

        Student student1 = new Student("Ion");
        Student student2 = new Student("Vasile");
        Student student3 = new Student("Constantin");
        Student student4 = new Student("Mihai");
        Student student5 = new Student("Dumitru");
        Student student6 = new Student("Tudor");
        Student student7 = new Student("Eugen");
        Student student8 = new Student("Marcel");
        Student student9 = new Student("Veaceslav");
        Student student10 = new Student("Simion");

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
        System.out.println(student5);
        System.out.println(student6);
        System.out.println(student7);
        System.out.println(student8);
        System.out.println(student9);
        System.out.println(student10);

         */

//        2.Creați clasa Elev, cu fieldurile String name, int grade si static String school.
//        Fiecare student va avea metoda: printList(), iar clasa Student va avea metoda changeSchoolName(),
//        care va modifica numele școlii în care sunt înscriși toți studenții.
//        Inițializat 10 studenți și adăugați-i între o lista.
//        Printați toți studenții, schimbați numele școlii, după care printați-i din nou.

        /*

        Elev elev1 = new Elev("Tudor",10);
        Elev elev2 = new Elev("Ion",10);
        Elev elev3 = new Elev("Vasile",8);
        Elev elev4 = new Elev("Mihai",9);
        Elev elev5 = new Elev("Grigore",5);
        Elev elev6 = new Elev("Dumitru",7);
        Elev elev7 = new Elev("Elena",9);
        Elev elev8 = new Elev("Tatiana",10);
        Elev elev9 = new Elev("Alina",9);
        Elev elev10 = new Elev("Nicoleta",6);

        ArrayList<Elev> elevi = new ArrayList<>(Arrays.asList(elev1,elev2,elev3,elev4,elev5,
                elev6,elev7,elev8,elev9,elev10));

        Elev.changeSchoolName("Liceul Teoretic Stefanesti");
        printList(elevi);
        Elev.changeSchoolName("Liceul Teoretic Miron Costin");
        printList(elevi);

         */

//        3.Creați clasa T_Shirt, cu următoarele proprietăți: int size, String color.
//        Toate tricourile vor avea aceeași proprietate: brand, și metoda changeBrandName(String newBrandName).
//        Inițializat 3 tricouri, și printați detaliile acestora.
//        Schimbați numele brandului.
//        Inițializat încă 3 tricouri. Printate detaliile tuturor tricourilor la consolă.

        /*

        T_Shirt t_shirt1 = new T_Shirt(75,"black");
        T_Shirt t_shirt2 = new T_Shirt(45,"brown");
        T_Shirt t_shirt3 = new T_Shirt(65,"green");

        System.out.println(t_shirt1);
        System.out.println(t_shirt2);
        System.out.println(t_shirt3);

        T_Shirt.changeBrandName("Puma");

        T_Shirt t_shirt4 = new T_Shirt(75,"yellow");
        T_Shirt t_shirt5 = new T_Shirt(45,"blue");
        T_Shirt t_shirt6 = new T_Shirt(65,"red");

        System.out.println(t_shirt1);
        System.out.println(t_shirt2);
        System.out.println(t_shirt3);
        System.out.println(t_shirt4);
        System.out.println(t_shirt5);
        System.out.println(t_shirt6);

         */

//        4.Creați clasa Person. Fiecare persoană va avea un String firstName și un String lastName.
//        Găsiți o modalitate ca în oricare punct al programului nostru, să putem afla câte obiecte de tip Persan au fost inițializate.

        Person person1 = new Person("Ion", "Balan");
        Person person2 = new Person("Victor", "Balan");
        Person person3 = new Person("Igor", "Balan");

        System.out.println(Person.counter);

        Person person5 = new Person("Constantin", "Balan");
        Person person6 = new Person("Viorica", "Balan");
        Person person7 = new Person("Livia", "Balan");

        System.out.println(Person.counter);
    }
    public static void printList(ArrayList<Elev> elevi){
        for (Elev elev : elevi) {
            System.out.println(elev);
        }
    }
}
