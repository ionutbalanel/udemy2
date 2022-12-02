package p004ClaseSiobiecteExercitii2;

public class Person {
    String name;
    int age;
    char sex;
    String address;

    public Person(String name, int age, char sex, String address) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
    }

    public void walk() {
        System.out.println(this.name + " merge pe strada.");
    }

    public void eat() {
        System.out.println(this.name + " mananca.");
    }

    public void sleep() {
        System.out.println(this.name + " doarme pana tarziu.");
    }

    public void showDetails() {
        System.out.println("Salut, ma numesc " + this.name + ", am " + this.age + " ani si locuiesc in " + this.address);
    }

}
