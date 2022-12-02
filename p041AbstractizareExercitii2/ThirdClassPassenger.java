package p041AbstractizareExercitii2;

public class ThirdClassPassenger extends Passenger{
    public ThirdClassPassenger(String name) {
        super(name);
    }

    @Override
    public void useBenefits() {
        System.out.println("Pasagerul "+this.name+" nu a primit nimic");

    }
}
