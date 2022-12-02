package p010StaticVsNonStaticPractica1;

public class Main {
    public static void main(String[] args) {
        System.out.print("Introduceti un text: ");
        String textIntrodus = Cititor.citesteText();
        System.out.println(textIntrodus);

        System.out.print("Introduceti un numar: ");
        int numarIntrodus = Cititor.citesteNumar();
        System.out.println(numarIntrodus);

        int suma = Calculator.aduna(10,20);
        int diferenta = Calculator.scade(100,40);

        System.out.println(suma);
        System.out.println(diferenta);

    }
}
