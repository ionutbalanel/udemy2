package p039Abstractizare;

public abstract class Car {
    String marca;
    String model;

    public Car(String marca, String model) {
        this.marca = marca;
        this.model = model;
    }
    public void startEngine(){
        System.out.println("Am pornit");
    }
    public abstract void accelerate();
}
