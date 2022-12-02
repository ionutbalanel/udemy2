package p030OverloadingvsOverriding;

public class Leopard extends Animal{
    @Override
    public void move() {
        System.out.println("Leopardul se misca repede");
    }
}
