package p011StaticVsNonStaticPractica2;

public class Main {
    public static void main(String[] args) {
        Elev elev1 = new Elev("Marius", 17);
        System.out.println(elev1);

        Elev elev2 = new Elev("Mircea", 16);
        System.out.println(elev2);

        Elev.profesor="Bodiu Marcel";

        Elev elev3 = new Elev("Ana", 15);
        System.out.println(elev3);
        System.out.println(elev1);

    }
}
