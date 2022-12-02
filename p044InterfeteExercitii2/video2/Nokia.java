package p044InterfeteExercitii2.video2;

public class Nokia implements TelephoneBehavior{
    @Override
    public void call(String telephoneNumber) {
        System.out.println("Nokia a sunat numarul "+telephoneNumber);
    }

    @Override
    public void charge() {
        System.out.println("Nokia este incarcat");
    }
}
