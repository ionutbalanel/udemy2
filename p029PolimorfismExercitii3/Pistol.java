package p029PolimorfismExercitii3;

public class Pistol extends Shooter{
    public Pistol() {
        this.maxRange=100;
    }

    @Override
    public void shoot() {
        System.out.println("Pistolul a atins tinta la o distanta de " + maxRange + " metri");
    }
}
