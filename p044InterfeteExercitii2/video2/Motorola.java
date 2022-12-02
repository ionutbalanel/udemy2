package p044InterfeteExercitii2.video2;

public class Motorola implements TelephoneBehavior{
    @Override
    public void call(String telephoneNumber) {
        System.out.println("Motorola a sunat numarul "+telephoneNumber);
    }

    @Override
    public void charge() {
        System.out.println("Motorola este incarcat");
    }
}
