package p021MostenireExercitii1;

public class Speedster extends Hero{
    public Speedster(String name, String hidenIdentity) {
        super(name, hidenIdentity);
    }

    public void speedRun(){
        System.out.println(this.name+" runs very fast");

    }
}
