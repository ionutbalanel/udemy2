package p010StaticVsNonStaticPractica1;

import java.util.Scanner;

public class Cititor {
    static Scanner cititorText = new Scanner(System.in);
    static Scanner cititorNumere = new Scanner(System.in);

    public static String citesteText(){
        return cititorText.nextLine();
    }
    public static int citesteNumar(){
        return cititorText.nextInt();
    }

}
