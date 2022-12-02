package p008ClaseSiobiecteExercitii6;

public class Bus {
    String brand;
    int maxPassagers;
    int passagersNumber;
    int maxSpeed;

    public Bus(String brand, int maxPassagers, int maxSpeed) {
        this.brand = brand;
        this.maxPassagers = maxPassagers;
        this.maxSpeed = maxSpeed;
    }

    public void addPassager() {
        if (passagersNumber == maxPassagers) {
            System.out.println("Nu mai putem adauga persoane");
        } else {
            System.out.println("Un pasager a urcat la bord");
            passagersNumber++;
        }
    }

    public void reachNextStation() {
        if (passagersNumber < maxPassagers / 2) {
            System.out.println("Mergem cu viteza maxima de " + maxSpeed);
        } else {
            System.out.println("Mergem cu viteza de " + (maxSpeed / 2));
        }
    }

}
