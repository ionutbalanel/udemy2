package p008ClaseSiobiecteExercitii6;

public class Plane {
    String brand;
    String model;
    boolean isFlying;
    int maxPassagers;
    int passagersNumber;

    public Plane(String brand, String model, int maxPassagers) {
        this.brand = brand;
        this.model = model;
        this.maxPassagers = maxPassagers;
    }

    public void addPassager(){
        if (passagersNumber<maxPassagers){
            System.out.println("Un pasager s-a urcat la bord");
            passagersNumber++;
        }else {
            System.out.println("Avionul este la capacitate maxima");
        }
    }
    public void fly(){
        if (isFlying||passagersNumber<(maxPassagers/2)){
            System.out.println("Avionul nu isi poate lua zborul.");
        }else {
            System.out.println("Avionul si-a luat zborul.");
            isFlying=true;
        }
    }
    public void land(){
        if (isFlying){
            System.out.println("Avionul aterizeaza.");
            isFlying=false;
        }else {
            System.out.println("Avionul este deja la sol.");
        }
    }

}
