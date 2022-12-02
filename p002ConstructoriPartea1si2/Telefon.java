package p002ConstructoriPartea1si2;

public class Telefon {

    // variabile de instanta
    String marca;
    String model;
    int memorieRam;
    double pret;

    // constructor

    public Telefon(String marca, String model) {
        System.out.println("Un telefon a fost generat de marca " + marca);
        this.marca = marca;
        this.model = model;
    }

    public Telefon(String marca, String model, int memorieRam) {
        this(marca,model);
        this.memorieRam = memorieRam;
    }

    public Telefon(String marca, String model, int memorieRam, double pret) {
        this(marca, model,memorieRam);
        this.pret = pret;
    }

   public void suna() {
       System.out.println("Telefonul "+marca+" suna");
    }


    @Override
    public String toString() {
        return "Telefon{" +
                "marca='" + marca + '\'' +
                ", model='" + model + '\'' +
                ", memorieRam=" + memorieRam +
                ", pret=" + pret +
                '}';
    }
}
