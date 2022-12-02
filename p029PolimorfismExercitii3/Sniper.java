package p029PolimorfismExercitii3;

public class Sniper extends Shooter {

    public Sniper() {
        this.maxRange = 2000;
    }

    @Override
    public void shoot() {
        System.out.println("Sniperul a atins tinta la o distanta de " + maxRange + " metri");
    }
}
