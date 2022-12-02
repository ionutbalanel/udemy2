package p027PolimorfismExercitii1;

public class Dacia extends Car{

    public Dacia(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    @Override
    public void reachMaxSpeed() {
        System.out.println("Bmw-ul a ajuns la viteza maxima in 20 secunde");
        crushEngine();
    }
    public void crushEngine(){
        System.out.println("Dacia sa oprit");
    }
}
