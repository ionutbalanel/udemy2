package p001obiectePractica;

public class Car {

    // campuri
    public String model;
    public String nume;
    public int anDeFabricatie;

    // constructori
    public Car() {
    }
    //metode
    public void startEngine(){
        System.out.println("Motorul a pornit!");
    }
    public void stopEngine(){
        System.out.println("Motorul s-a oprit!");
    }

}
