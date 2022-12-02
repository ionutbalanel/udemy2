package p021MostenireExercitii1;

public class Superman extends Hero {
    public Superman(String name, String hidenIdentity) {
        super(name, hidenIdentity);
    }

    public void fly() {
        System.out.println(this.name + " is flying");

    }
}
