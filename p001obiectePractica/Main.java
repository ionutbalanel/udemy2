package p001obiectePractica;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();

        c1.nume="Audi";
        c1.model="A6";
        c1.anDeFabricatie=2010;

        System.out.println("Masina mea este de marca "+c1.nume+" "+c1.model);
        c1.startEngine();

        c1.nume="BMW";
        c1.model="X3";
        c1.anDeFabricatie=2020;

        System.out.println("Masina mea este de marca "+c1.nume+" "+c1.model);
        c1.stopEngine();
    }
}
