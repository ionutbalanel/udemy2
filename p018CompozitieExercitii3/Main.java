package p018CompozitieExercitii3;

public class Main {
    public static void main(String[] args) {
//        1.Creați clasa Hero, cu String name, int health și int atack.
//        Creați clasa Villain, cu String name, int health și int atack.
//        Orice erou va avea în structura sa un Villain “enemy”, iar un Villain va avea în structura sa un Hero “enemy"
//        Orice erou va avea metoda atack(), în care atacă inamicul său, villainul, scăzându-i punctele corespunzătoare atacului din viață.
//        Orice villian va avea metoda atack(), în care ataca inamicul său, eroul, scăzându-i punctele corespunzătoare atacului din viață.
//        Generați doi eroi și doi villaini, setați rivalitățile printr-o metodă specifică fiecărei clase în parte,
//        care preia un obiect de tip inamic și îi trece în structura obiectului nostru.
//        Start a fight.

        /*

        Hero hero1 = new Hero("Batman",1000,150);
        Hero hero2 = new Hero("Superman",1000,1150);

        Villain villain1 = new Villain("Joker",800,120);
        Villain villain2 = new Villain("Doomsday",1800,1900);

        hero1.setEnemy(villain1);
        hero2.setEnemy(villain2);

        villain1.setEnemy(hero1);
        villain2.setEnemy(hero2);

        hero1.atack();
        hero2.atack();

        villain1.atack();
        villain2.atack();

        System.out.println(hero1);
        System.out.println(hero2);
        System.out.println(villain1);
        System.out.println(villain2);

         */

//        2.Creați clasa Elev, cu proprietățile String nume, ArrayList<Integer> note,
//        Creați clasa Profesor, cu proprietățile String name, List<Student> students, metoda addGrade(int index, int grade),
//        care setează nota grade a studentului de pe poziția index din lista internă de elevi și metoda calculează mediile care CalculeazăMediile(),
//        calculează și printează mediile tuturor elevilor acestuia.

        /*

        Profesor profesor = new Profesor("Ion");
        Elev elev1 = new Elev("Ana");
        Elev elev2 = new Elev("Marius");
        Elev elev3 = new Elev("Dan");

        elev1.note.add(10);
        elev1.note.add(9);
        elev1.note.add(8);

        elev2.note.add(6);
        elev2.note.add(7);
        elev2.note.add(8);

        elev3.note.add(10);
        elev3.note.add(10);
        elev3.note.add(10);

        profesor.addStudent(elev1);
        profesor.addStudent(elev2);
        profesor.addStudent(elev3);

        profesor.calculeazaMediaElevilor();

         */

//        3.Creați clasa LocalAttraction, cu proprietățile String name, int coordinateX, coordinateY.
//        Creați clasa Town, cu proprietățile String name, ArrayList<LocalAttraction> localAtractions.
//        și metodele addAttraction(LocalAttraction localAttraction) si displayAttractions().
//        Creați două orașe cărora să le adăugați între 2 și 4 localAtractions.
//        Printați atracțiile fiecărui oraș.

        Town town1 = new Town("Bucharest");
        Town town2 = new Town("New York");

        LocalAttraction localAttraction1 = new LocalAttraction("Arcul de Triumf",1234,1235);
        LocalAttraction localAttraction2 = new LocalAttraction("Centrul Vechi",234,342);
        LocalAttraction localAttraction3 = new LocalAttraction("Time Square",3456,3456);

        town1.addAttraction(localAttraction1);
        town1.addAttraction(localAttraction2);

        town2.addAttraction(localAttraction3);

        town1.printLocalAttractions();
        System.out.println("     ");
        town2.printLocalAttractions();



    }
}
