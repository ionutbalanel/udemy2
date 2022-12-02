package p022MostenireExercitii2;

public class Tesla extends Automobil{
    int batteryPercentage;

    public Tesla(String marca, String model) {
        super(marca, model);
        this.batteryPercentage = 100;
    }

    public void drive(){
        if (batteryPercentage>=10){
            System.out.println("Tesla a pornit la drum");
            batteryPercentage-=10;
        }else {
            System.out.println("Tesla nu mai are baterie");
        }

    }
    public void charge(){
        batteryPercentage=100;

    }
}
