package p023MostenireExercitii3;

public class Hanorac extends Haine{
    boolean areGluga;

    public Hanorac(String marca, int pret, boolean areGluga) {
        super(marca, pret);
        this.areGluga = areGluga;
    }

    @Override
    public String toString() {
        return "Hanorac{" +
                "areGluga=" + areGluga +
                ", marca='" + marca + '\'' +
                ", pret=" + pret +
                '}';
    }
}
