package p023MostenireExercitii3;

public class Haine {
    String marca;
    int pret;

    public Haine(String marca, int pret) {
        this.marca = marca;
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Haine{" +
                "marca='" + marca + '\'' +
                ", pret=" + pret +
                '}';
    }
}
