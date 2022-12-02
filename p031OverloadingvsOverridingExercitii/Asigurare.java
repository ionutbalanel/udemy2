package p031OverloadingvsOverridingExercitii;

public class Asigurare {

    static int cursor = 1;

    String id;

    public Asigurare() {
        this.id = String.valueOf(cursor++);
    }

    @Override
    public String toString() {
        return "Asigurare{" +
                "id='" + id + '\'' +
                '}';
    }
}
