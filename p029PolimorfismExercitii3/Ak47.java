package p029PolimorfismExercitii3;

public class Ak47 extends Shooter{
    public Ak47() {
        this.maxRange=500;
    }

    @Override
    public void shoot() {
        multiShoot();
    }

    public void multiShoot(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Bam Bam Bam Bam Bam");
        }
    }
}
