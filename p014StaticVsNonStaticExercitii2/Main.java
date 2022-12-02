package p014StaticVsNonStaticExercitii2;

public class Main {
    public static void main(String[] args) {
//        1.Vom crea un joc video. Se va crea clasa Player, cu următoarele proprietăți: String name și int health.
//        Jocul nostru va suporta un maxim de 300 de sloturi, iar fiecare player generat va ocupa 50 de sloturi.
//        În momentul în care jocuri nostru atinge capacitatea maximă de jucători, se va afișa un mesaj corespunzător.

        /*

        Player player1 = new Player("Ion",1000);
        Player player2 = new Player("Ion2",2000);
        Player player3 = new Player("Ion3",3000);
        Player player4 = new Player("Ion4",4000);

        Player player5 = new Player("Ion5",6000);
        Player player6 = new Player("Ion6",7000);

        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(player4);
        System.out.println(player5);
        System.out.println(player6);

         */

//        2.Creați clasa Employee, cu proprietățile String name, int age, ArrayList<String> soldProducts, și metoda
//        sellProduct(String productName).
//        Toți angajații lucrează la aceeași firmă, care au inițial o reputație de rang 500.
//        De fiecare dată când un angajat vinde un produs, acest produs va fi adăugat în lista lui de produse vândute,
//        iar reputația companiei va crește cu 1
//        Creați 3 angajați. Fiecare angajat va vinde între 3 și 4 produse.
//        Printați situația fiecărui angajat și reputația finală a firmei.

        /*

        Employee angajat1 = new Employee("Ana", 22);
        Employee angajat2 = new Employee("Maria", 32);
        Employee angajat3 = new Employee("Sandu", 42);

        angajat1.sellProduct("Masina");
        angajat1.sellProduct("Casa");
        angajat1.sellProduct("Dulap");

        angajat2.sellProduct("Masina");
        angajat2.sellProduct("Apartament");
        angajat2.sellProduct("Birou");

        angajat3.sellProduct("Calculator");
        angajat3.sellProduct("Laptop");
        angajat3.sellProduct("Sifonier");
        angajat3.sellProduct("Videoproiector");

        System.out.println(angajat1);
        System.out.println(angajat2);
        System.out.println(angajat3);

        System.out.println(Employee.rang);

         */

//        3.Creați clasa Book cu Câmpurile String name, String authorName, și metoda brown().
//        De fiecare dată când o carte este împrumutată, se va contoriza și incrementa numărul total de studenți care
//        au împrumutat vreodată cărți.
//        Biblioteca noastră va cuprinde 5 cărți.
//        Printați numărul total de studenți care au împrumutat cărți de la bibliotecă noastră.

        /*

        Book book1 = new Book("Harry Poter 1", "J.K.Rowling");
        Book book2 = new Book("Harry Poter 2", "J.K.Rowling");
        Book book3 = new Book("Harry Poter 3", "J.K.Rowling");
        Book book4 = new Book("Harry Poter 4", "J.K.Rowling");
        Book book5 = new Book("Harry Poter 5", "J.K.Rowling");

        book1.brown();
        book1.brown();
        book1.brown();
        book2.brown();
        book2.brown();
        book2.brown();
        book2.brown();
        book3.brown();
        book4.brown();
        book4.brown();
        book5.brown();

        System.out.println("Totalul numarului de studenti care au imprumutat carti este: " + Book.totalStudent);

         */

//        4.Creați clasa ChromeTab, cu fieldul String currentSiteName si metoda changeCurrentSite(String newSite),
//        care navighează browser nostru către un nou site.
//        Clasa noastră va avea un field String history, care va cuprinde toate site-urile accesate în toate taburile noastre.
//        Deschideți 4 taburi de chrome, schimbați 2/3 ori site-ul în fiecare, după care printați la consolă history-ul browser-ului.

        ChromeTab tab1 = new ChromeTab();
        ChromeTab tab2 = new ChromeTab();
        ChromeTab tab3 = new ChromeTab();
        ChromeTab tab4 = new ChromeTab();
        ChromeTab tab5 = new ChromeTab();

        tab1.changeCurrentSite("https://www.youtube.com/");
        tab2.changeCurrentSite("https://www.google.com/");
        tab3.changeCurrentSite("https://www.facebook.com/");
        tab4.changeCurrentSite("https://www.skype.com/");
        tab5.changeCurrentSite("https://www.gmail.com/");

        System.out.println("Istoric: "+ChromeTab.history);

    }
}
