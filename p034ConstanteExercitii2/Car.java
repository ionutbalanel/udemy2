package p034ConstanteExercitii2;

public class Car {
    String marca;
    String model;
    boolean on;



    public final void startEngine() {
        if (on) {
            System.out.println("Motorul este deja pornit");
        } else {
            System.out.println("Am pornit motorul");
            on = true;
        }
    }

    public final void stopEngine() {
        if (on) {
            System.out.println("Am oprit motorul");
            on = false;
        } else {
            System.out.println("Motorul este deja oprit");
        }
    }

    public void accelerate() {
        System.out.println("Acceleram");
    }
}
