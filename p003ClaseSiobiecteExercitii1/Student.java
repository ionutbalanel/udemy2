package p003ClaseSiobiecteExercitii1;

public class Student {
    String name;
    int age;
    String telephoneNumber;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, String telephoneNumber) {
        this(name, age);
        this.telephoneNumber = telephoneNumber;
    }

    public void call(String numarTelefon) {
        System.out.println("Studentul " + name + ", avand numarul de telefon " + numarTelefon + " a facut un call catre numarul de telefon " + this.telephoneNumber);
    }
}
