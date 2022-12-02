package p027PolimorfismExercitii1;

public class JetPlane extends Plane{
    public JetPlane() {
        super(2);
    }

    @Override
    public void fly() {
        System.out.println("Avionul Jet zboara repede.");

    }
}
