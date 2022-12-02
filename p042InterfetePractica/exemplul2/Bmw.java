package p042InterfetePractica.exemplul2;

public class Bmw implements Driveable{
    @Override
    public void startEngine() {
        System.out.println("Bmw-ul a pornit");
    }

    @Override
    public void stopEngine() {
        System.out.println("Bmw-ul sa oprit");
    }

    @Override
    public void drive() {
        System.out.println("Conducem bmw-ul");
    }
}
