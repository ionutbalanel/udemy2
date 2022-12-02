package p027PolimorfismExercitii1;

public class Mercedes extends Car{
    public Mercedes(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    @Override
    public void reachMaxSpeed() {
        System.out.println("Bmw-ul a ajuns la viteza maxima in 15 secunde");
    }
}
