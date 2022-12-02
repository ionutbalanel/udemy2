package p005ClaseSiobiecteExercitii3;

public class Main {
    public static void main(String[] args) {
        // 1. Creați clasa Phone cu următoarele câmpuri: brand, model, storage (int)
        //    Creati 5 telefoane si printati detaliile fiecarui obiect in parte la consola, suprascriind metoda toString().

        /*

        Phone telefon1 = new Phone("Iphone", "7", 32);
        Phone telefon2 = new Phone("Iphone", "12", 64);
        Phone telefon3 = new Phone("Samsung", "S7", 32);
        Phone telefon4 = new Phone("Samsung", "S9", 32);
        Phone telefon5 = new Phone("Samsung", "A21s", 32);

        System.out.println(telefon1);
        System.out.println(telefon2);
        System.out.println(telefon3);
        System.out.println(telefon4);
        System.out.println(telefon5);

         */

        // 2. Creați clasa Robot cu următoarele câmpuri: name, attackPower, material și metoda atack(),
        //    care se va folosi de câmpurile obiectului pentru a printa un mesaj corespunzător.
        //    Adăugați într-o listă 5 roboți ale căror detalii vor fi introduse de la tastatură.
        //    Faceți ca toți roboții din lista voastră să atace.

        /*

        ArrayList<Robot> roboti = new ArrayList<>();
        Scanner scText = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Introduceti numele robotului: ");
            String nume = scText.nextLine();
            System.out.println("Introduceti valoarea atacului: ");
            int valoareAtac = scInt.nextInt();
            System.out.println("Introduceti materialul robotului: ");
            String material = scText.nextLine();

            roboti.add(new Robot(nume,valoareAtac,material));
        }
        for (Robot robot : roboti) {
            robot.atack();
        }

         */

        // 3. Creați clasa Book cu următoarele fielduri: String name, String author, int totalPageNumber, int currentPageNumber
        //    și metodele flipPageForwad(), flipPageBackword() și printBookState()
        //    Metoda printBookState() va printa starea cărții noastre sub forma ,,Cartea M, scrisă de N, având 0 pagini,
        //    este deschisă la pagina P”.
        //    Metodele flipPageForwad(), flipPageBackword() vor modifica starea internă a cărții noastre.
        //    HINT: Unei cărți nu i se poate da pagini înapoi dacă pagina curentă este 1.
        //    De asemenea nu i se poate da o pagină înainte dacă pagina curentă este ultima pagină.
        //    Creați o carte și rasfoit-o.

        /*

        Book harryPoter = new Book("Harry Poter","J.K. Rowling",250);
        harryPoter.flipPageBackword();
        harryPoter.flipPageForwad();
        harryPoter.flipPageForwad();
        harryPoter.flipPageForwad();
        harryPoter.flipPageForwad();
        harryPoter.flipPageForwad();
        harryPoter.printBookState();
        harryPoter.flipPageBackword();

         */

        //    4. Pe baza exercițiului anterior, creați în clasa Program o metodă în care primește ca parametru o carte
        //    și ii răsfoiește toate paginile. Apelat metoda pentru trei cărți diferite

        /*

        Book harryPoter2 = new Book("Harry Poter2","J.K. Rowling",300);
        Book harryPoter3 = new Book("Harry Poter3","J.K. Rowling",350);

        rasfoiesteCartea(harryPoter2);
        rasfoiesteCartea(harryPoter3);

         */

    }
    public static void rasfoiesteCartea(Book book) {
        for (int i = book.currentPageNumber; i < book.totalPageNumber; i++) {
            book.flipPageForwad();
        }
    }
}
