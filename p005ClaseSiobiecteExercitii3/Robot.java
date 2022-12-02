package p005ClaseSiobiecteExercitii3;

public class Robot {
    String name;
    int attackPower;
    String material;

    public Robot(String name, int attackPower, String material) {
        this.name = name;
        this.attackPower = attackPower;
        this.material = material;
    }

    public void atack() {
        System.out.println("Robotul " + name + " ataca cu valoarea " + attackPower);
    }
}
