package p015Compozitie;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Opel","Astra");
        Person person = new Person("Ion","Balan",car1);
        Person person2 = new Person("Igor","Balan",new Car("Audi","Q7"));

        System.out.println(person);
    }
}
