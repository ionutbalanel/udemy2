package p022MostenireExercitii2;

public class Autobuz extends Automobil{
    int maxPassagers;
    int currentPassagers;

    public Autobuz(String marca, String model, int maxPassagers) {
        super(marca, model);
        this.maxPassagers = maxPassagers;
        this.currentPassagers = 0;
    }

    public void addPassagers(){
        if (currentPassagers>=maxPassagers){
            System.out.println("Autobusul a ajuns la capacitatea maxima");
        }else {
            currentPassagers++;
            System.out.println("A urcat un pasager");
        }
    }
}
