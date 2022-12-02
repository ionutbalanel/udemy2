package p015Compozitie;

public class Person {
    String firstName;
    String lastName;
    Car masina;

    public Person(String firstName, String lastName, Car masina) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.masina = masina;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", masina=" + masina +
                '}';
    }
}
