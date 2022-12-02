package p030OverloadingvsOverriding;

public class Main {
    public static void main(String[] args) {
        Melc melc = new Melc();
        Leopard leopard = new Leopard();

        melc.move();
        leopard.move();

        Calculator calculator = new Calculator();

        calculator.add(2,4);
        calculator.add(2,4,6);

    }
}
