package p041AbstractizareExercitii2;

public abstract class Passenger {
    String name;

    public Passenger(String name) {
        this.name = name;
    }

    public abstract void useBenefits();
}
