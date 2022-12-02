package p030OverloadingvsOverriding;

public class Calculator {
    public void add(int a, int b){
        System.out.println("Suma este "+(a+b));
    }

    public void add(int a, int b, int c){
        System.out.println("Suma este "+(a+b+c));
    }

}
