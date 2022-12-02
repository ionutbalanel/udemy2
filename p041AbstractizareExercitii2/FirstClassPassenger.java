package p041AbstractizareExercitii2;

public class FirstClassPassenger extends Passenger{
    public FirstClassPassenger(String name) {
        super(name);
    }

    @Override
    public void useBenefits() {
        System.out.println("Pasagerul "+this.name+" a primit alune, sampanie si are spatiu");
    }
}
