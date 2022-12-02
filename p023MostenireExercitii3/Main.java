package p023MostenireExercitii3;

public class Main {
    public static void main(String[] args) {
//        1.Scrieți clasa Staff, cu proprietățile String name, int salary.
//        Clasa Programator va moșteni clasa Staff și va avea metoda code();
//        Clasa Cleaner va moșteni clasa Staff și va avea metoda clean().
//        Clasa TeamLeader va moșteni clasa Staff. Va avea în structura ei o listă de programatori numită ‘team’ și metoda assingWork(),
//        care îi va face pe toți programatorii din echipă să scrie cod.
//        Clasa Manager va moșteni clasa Staff și va avea metoda raiseSalary(Staff staff, int amount),
//        care va crește salariul angajatului păsat ca parametru cu valoarea amountului
//
//        Testați toate funcționalitățile programului.

        /*

        TeamLeader teamLeader = new TeamLeader("Tudor",10000);
        teamLeader.addPeopleInTheTeam(new Programator("Tedy",7000));
        teamLeader.addPeopleInTheTeam(new Programator("Mircea",7700));
        teamLeader.addPeopleInTheTeam(new Programator("Ana",6000));
        teamLeader.addPeopleInTheTeam(new Programator("Maria",8000));
        teamLeader.addPeopleInTheTeam(new Programator("Ionut",9000));

        teamLeader.assingWork();

        Cleaner cleaner = new Cleaner("Marian", 5000);
        cleaner.clean();

        Manager manager = new Manager("Gabi",10000);
        manager.raiseSalary(teamLeader,1000);
        manager.raiseSalary(cleaner,1000);

        System.out.println(teamLeader);
        System.out.println(cleaner);
        System.out.println(manager);

         */

//        2.Clientul va cere următoarele aplicației:
//        “Firma noastră va vinde haine. Toate hainele noastre vor avea în comun o marcă și un preț.
//        Vom vinde pantaloni, care vor avea un număr specific de buzunare.
//        Vom vinde hanorace, care pot sau nu pot avea glugă.
//        Vom vinde adidași, care pot sau nu pot avea șireturi.
//
//        Clienții noștri vor avea un nume, un buget și o listă de haine cumpărate.
//        De asemenea, vrem ca clienții noștri să poată cumpăra oricând hainele noastre.”
//        Creați aplicația și testați cazurile.

        Adidasi adidasi = new Adidasi("Nike",1000, true);
        Hanorac hanorac = new Hanorac("Puma",500, false);
        Pantaloni pantaloni = new Pantaloni("Adidass",300, 4);


        Customer client = new Customer("Tudor",10000);

        client.buyGlothes(adidasi);
        client.buyGlothes(hanorac);
        client.buyGlothes(pantaloni);

        System.out.println(client);


    }
}
