package p011StaticVsNonStaticPractica2;

public class Elev {
    static String profesor = "Ion Balan";
    String nume;
    int varsta;

    public Elev(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        return "Elev{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", profesor=" + profesor +
                '}';
    }
}
