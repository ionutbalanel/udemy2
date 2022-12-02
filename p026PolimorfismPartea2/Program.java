package p026PolimorfismPartea2;

import java.util.ArrayList;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) {

//        test1();
//        test2();
//        test3();
        teste4();


//        1. Scrieți o clasă Car și alte două clase derivate  ConvertibleCar și MiniVan.

//        2. Declară două metode în clasa de bază, describeCar() și showDetails() care sa afișeze la consolă un text
//           cu detalii comune.

//        3. Apelează metoda showDetails()  în metoda describeCar().

//        4. Implementează în clasa ConvertibleCar metoda showDetails() prin ascunderea metodei din clasa de
//           bază și definirea alteia nouă.  (Suprascrieți metoda)

//        5. Implementează în clasa MiniVan metoda showDetails() prin extinderea metodei din clasa de bază și
//           modificare a textului afișat la consolă.

//        6. Scrieți o metodă statică testul1() în clasa Program. În aceasta, declară trei obiecte, câte unul de tipul
//           fiecărei clase și apelează metoda describeCar() cu fiecare obiect. Apelează metoda test1() în metoda main()
//           și observă diferențele.

//        7. Scrieți o metodă statică test2() în clasa Program. În aceasta declară o listă cars,  de tip Car, care să
//           conțină 3 obiecte noi de tipul  fiecărei clase.  Apelează metoda describeCar() prin fiecare obiect din
//           listă, folosind un loop. Apelează metoda test2(). Observă diferențele.

//        8. Scrie o metodă test3() în clasa Program. Declar un obiect de tip ConvertibleCar  și altul de tip
//           MiniVan. Apelează metoda showDetails() prin fiecare. Apelează metoda test3(). Observă diferențele.

//        9. Scrie o metodă de test4() în clasa Program. Declară un obiect de tip ConvertibleCar  și salvează-l întro
//           variabilă de tip Car și altul de tip MiniVan și salvează-l tot într-o variabila de tip Car. Apelează metoda
//           showDetails() prin fiecare. Apelează metoda test3(). Observă diferențele.

    }

    private static void test1() {
        Car car = new Car();
        ConvertibleCar convertibleCar = new ConvertibleCar();
        MiniVan miniVan = new MiniVan();

        car.describeCar();
        System.out.println(" ");
        convertibleCar.describeCar();
        System.out.println(" ");
        miniVan.describeCar();
    }
    public static void test2(){
        Car car = new Car();
        ConvertibleCar convertibleCar = new ConvertibleCar();
        MiniVan miniVan = new MiniVan();

        ArrayList<Car> masini = new ArrayList<>(Arrays.asList(car,convertibleCar, miniVan));
        for (Car masina : masini) {
            masina.describeCar();
            System.out.println(" ");
        }
    }
    public static void test3(){
        ConvertibleCar convertibleCar = new ConvertibleCar();
        MiniVan miniVan = new MiniVan();

        convertibleCar.showDetails();
        System.out.println(" ");
        miniVan.showDetails();
    }
    public static void teste4(){
        Car minivan = new MiniVan();
        Car convertible = new ConvertibleCar();

        minivan.showDetails();
        System.out.println(" ");
        convertible.showDetails();
    }


}
