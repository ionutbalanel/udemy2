package p024ClasaObject;

public class Main {
    public static void main(String[] args) {
        Person ion = new Person("Ion",36);

        System.out.println(ion);

        Person ion2 = new Person("Ion",36);

        System.out.println(ion.equals(ion2));
    }
}
