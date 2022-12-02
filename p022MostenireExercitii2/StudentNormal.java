package p022MostenireExercitii2;

public class StudentNormal extends Student{
    public StudentNormal(String name, int grade) {
        super(name, grade);
    }

    public void citeste(){
        System.out.println(this.name+" citeste o carte");
    }
}
