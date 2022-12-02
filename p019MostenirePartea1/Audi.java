package p019MostenirePartea1;

public class Audi extends Car{
    public Audi(String marca, String model) {
        super(marca, model);
        System.out.println("Un audi a fost generat.");
    }

    @Override
    public String toString() {
        return "Audi{" +
                "marca='" + marca + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
