package p031OverloadingvsOverridingExercitii;

public class Main {
    public static void main(String[] args) {
//        1.Scrieți clasa ConsolePrinter. ConsolePrinter va avea metoda statică printText().
//        care va primi ca parametru un String pe care îl va printa la consolă.
//        supraîncărcați metoda printText() pentru a primi textul nostru, dar și numărul de printări dorit la consolă.

        /*

        ConsolePrinter printer = new ConsolePrinter();
        printer.printText("Academia Programatorilor");
        System.out.println();
        printer.printText("Academia Programatorilor",4);

         */

//        2.Creați clasa Person. Persoana va avea un nume și va avea posibilitatea de a mânca - metoda eat().
//        Supraîncărcați metoda eat() pentru a primi ca parametrii 1 aliment, 2 alimente și 3 alimente de tip String,
//        și afișați un mesaj corespunzător la apelarea fiecăreia.

        /*

        Person person = new Person();
        person.eat("mere");
        person.eat("mere","banane");
        person.eat("mere","struguri","tort");

         */

//        3.Creați clasa Asigurare (proprietatea: String id) și ProcesatorDeAsigurari.
//        Procesatorul nostru va avea o metodă proceseaza(), care va primi ca parametru un obiect de tip Asigurare
//        și afișează un mesaj corespunzător "Asigurarea X au fost procesată".
//        Suprascrieți metoda procedează pentru a primi încă un parametru de tip boolean aprovedByManager.
//        Dacă asigurarea este aprobată, printați un mesaj corespunzător. La fel si dacă nu.

        /*

        ProcesatorDeAsigurari.proceseaza(new Asigurare());
        ProcesatorDeAsigurari.proceseaza(new Asigurare(),true);
        ProcesatorDeAsigurari.proceseaza(new Asigurare(),false);

         */

//        4.Creați clasa AcademiaProgramatorilor, cu metoda statică pass(String studentName), care va printa un mesaj
//        "Studentul X a absolvit cursurile Academiei programatorilor".
//        Supraîncărcați metoda pentru a putea primi oricât studenți dorește utilizatorul. (hint: sunt folosiți varchar: int_)


        AcademiaProgramatorilor academiaProgramatorilor = new AcademiaProgramatorilor();
        academiaProgramatorilor.pass("Ion");
        academiaProgramatorilor.pass("Ion","Mihaela");
        academiaProgramatorilor.pass("Ion","Mihaela", "Elena");

    }
}
