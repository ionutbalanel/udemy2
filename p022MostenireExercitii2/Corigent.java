package p022MostenireExercitii2;

public class Corigent extends Student{
    public Corigent(String name, int grade) {
        super(name, grade);
    }

    public void invața(){
        System.out.println(this.name+" invata pentru a trece clasa.");
    }
}
