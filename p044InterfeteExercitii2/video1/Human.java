package p044InterfeteExercitii2.video1;

public class Human implements Swimable, Eatable{
    @Override
    public void eat() {
        System.out.println("Omul mananca");
    }

    @Override
    public void swim() {
        System.out.println("Omul inoata");

    }
}
