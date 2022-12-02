package p031OverloadingvsOverridingExercitii;

public class Person {
    String nume;

    public void eat(String aliment) {
        System.out.println("Am mancat " + aliment);
    }

    public void eat(String aliment1, String aliment2) {
        System.out.println("Am mancat 2 alimente: " + aliment1 + " si " + aliment2);
    }

    public void eat(String aliment1, String aliment2, String aliment3) {
        System.out.println("Am mancat 3 alimente: " + aliment1 + ", " + aliment2+" si "+aliment3);
    }
}
