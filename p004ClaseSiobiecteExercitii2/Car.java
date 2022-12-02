package p004ClaseSiobiecteExercitii2;

public class Car {
    String brand;
    int year;
    boolean on;

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void printDetails(){
        System.out.print("Masina "+brand+", fabricata in anul "+year+" este ");
        System.out.println(on?" pornita":" oprita");

    }
    public void startEngine(){
        if (on) {
            System.out.println("Masina este deja pornita.");
        }else {
            System.out.println("Masina a pornit");
            on=true;
        }

    }
    public void stopEngine(){
        if (on) {
            System.out.println("Masina s-a oprit.");
            on=false;
        }else {
            System.out.println("Masina este deja oprita");
        }
    }
}
