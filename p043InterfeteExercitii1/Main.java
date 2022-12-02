package p043InterfeteExercitii1;

public class Main {
    public static void main(String[] args) {
//        Începeți prin a crea o aplicație normală cu aceste caracteristici:

//        O interfață numită RegularPolygon cu două metode abstracte: getNumSides() si getSideLength().

//        o clasă EquilateralTriangle care implementează interfața, are getNumSides() return 3 si getSideLength()
//        care returnează o variabilă de instanță setată de constructor

//        o clasă Square care implementează interfața, are getNumSides() return 4 si getSideLength() return
//        o variabilă de instanță setată de constructor

//        în clasa Main, creați două metode:
//        o metodă statică getTotalSides(), care așteaptă un parametru de tip RegularPolygon și returnează
//        numărul total de laturi ale tuturor elementelor.

//        o metodă statică getPerimeter(RegularPolygon p) care returnează perimetrul formei passate

        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(5);
        Square square = new Square(10);

        int numarLaturiTriunghi = getTotalSides(equilateralTriangle);
        int numarLaturiPatrat = getTotalSides(square);

        System.out.println("Triunghiul echilateral are "+numarLaturiTriunghi+" laturi");
        System.out.println("Patratul are "+numarLaturiPatrat+" laturi");

        int perimetruTriunghi = getPerimeter(equilateralTriangle);
        int perimetruPatrat = getPerimeter(square);

        System.out.println("Perimetrul triunghiul echilateral este egal cu "+perimetruTriunghi);
        System.out.println("Perimetrul patratului este egal cu "+perimetruPatrat);

    }

    private static int getTotalSides(RegularPolygon regularPolygon) {
        return regularPolygon.getNumSides();
    }

    private static int getPerimeter(RegularPolygon regularPolygon) {
        return regularPolygon.getNumSides()*regularPolygon.getSideLength();
    }

}
