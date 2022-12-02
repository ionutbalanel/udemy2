package p023MostenireExercitii3;

public class Pantaloni extends Haine{
    int numarBuzunare;

    public Pantaloni(String marca, int pret, int numarBuzunare) {
        super(marca, pret);
        this.numarBuzunare = numarBuzunare;
    }

    @Override
    public String toString() {
        return "Pantaloni{" +
                "numarBuzunare=" + numarBuzunare +
                ", marca='" + marca + '\'' +
                ", pret=" + pret +
                '}';
    }
}
