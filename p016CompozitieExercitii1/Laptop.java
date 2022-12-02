package p016CompozitieExercitii1;

public class Laptop {
    static int idCount = 1;

    int id;
    String marca;
    String model;

    public Laptop(String marca, String model) {
        id=idCount++;
        this.marca = marca;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
