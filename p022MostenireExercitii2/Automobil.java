package p022MostenireExercitii2;

public class Automobil {
    String marca;
    String model;
    boolean started;

    public Automobil(String marca, String model) {
        this.marca = marca;
        this.model = model;
        started=false;
    }

    public void startEngine(){
        if (started){
            System.out.println("Automobilul este deja pornit");
        }else {
            started=true;
            System.out.println("Automobilul a pornit");
        }
    }

    public void stopEngine(){
        if (started){
            started=false;
            System.out.println("Am oprit automobilul");
        }else {

            System.out.println("Automobilul este deja oprit");
        }
    }
}
