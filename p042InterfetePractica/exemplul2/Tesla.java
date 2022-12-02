package p042InterfetePractica.exemplul2;

public class Tesla implements ElectricCar{
    @Override
    public void startEngine() {
        System.out.println("Tesla a pornit");
    }

    @Override
    public void stopEngine() {
        System.out.println("Tesla sa oprit");
    }

    @Override
    public void drive() {
        System.out.println("Conducem Tesla");
    }

    @Override
    public void charche() {
        System.out.println("Incarcam Tesla");
    }
}
