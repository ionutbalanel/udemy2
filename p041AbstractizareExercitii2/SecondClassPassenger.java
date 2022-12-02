package p041AbstractizareExercitii2;

public class SecondClassPassenger extends Passenger{
    public SecondClassPassenger(String name) {
        super(name);
    }

    @Override
    public void useBenefits() {
        System.out.println("Pasagerul "+this.name+" a primit alune si are spatiu decent");

    }
}
