package p027PolimorfismExercitii1;

public class BMW extends Car{
    public BMW(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    @Override
    public void reachMaxSpeed() {
        System.out.println("Bmw-ul a ajuns la viteza maxima in 10 secunde");
    }
}
