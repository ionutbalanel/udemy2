package p027PolimorfismExercitii1;

public class NormalPlane extends Plane{


    public NormalPlane(int maxPassagers) {
        super(maxPassagers);
    }

    @Override
    public void fly() {
        System.out.println("Avionul zboara normal.");
    }
}
