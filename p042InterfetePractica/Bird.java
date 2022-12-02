package p042InterfetePractica;

public class Bird implements Flyable,Eatable{
    @Override
    public void eat() {
        System.out.println("Pasarea maninca");

    }

    @Override
    public void fly() {
        System.out.println("Pasarea zboara");
    }

}
