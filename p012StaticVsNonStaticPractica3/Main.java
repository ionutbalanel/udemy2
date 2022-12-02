package p012StaticVsNonStaticPractica3;

public class Main {
    public static void main(String[] args) {
        Telefon telefon1 = new Telefon("Samsung", "S10");
        Telefon telefon2 = new Telefon("Iphone", "12");
        Telefon telefon3 = new Telefon("Iphone", "7");

        System.out.println("Am generat " + Telefon.numarTelefoaneGenerate + " telefoane");
        Telefon telefon4 = new Telefon("Iphone", "10");

        System.out.println("Am generat " + Telefon.numarTelefoaneGenerate + " telefoane");

        Produs produs1 = new Produs("Pantaloni",50);
        Produs produs2 = new Produs("Blugi",40);
        Produs produs3 = new Produs("Geaca",50);
        Produs produs4 = new Produs("Manusi",60);

        System.out.println(produs1);
        System.out.println(produs2);
        System.out.println(produs3);
        System.out.println(produs4);


    }
}
