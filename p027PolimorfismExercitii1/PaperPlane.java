package p027PolimorfismExercitii1;

public class PaperPlane extends Plane{

    public PaperPlane() {
        super(0);
    }

    @Override
    public void fly() {
        System.out.println("Avionul de hartie zboara incet.");
    }
}
