package p019MostenirePartea1;

public class Main {
    public static void main(String[] args) {
        Audi audi = new Audi("Audi","Q7");
        Mercedes mercedes = new Mercedes("Mercedes","Benz");

//        audi.marca="Audi";
//        audi.model="Q7";
//
//        mercedes.marca="Mercedes";
//        mercedes.model="Benz";
        mercedes.startEngine();
        mercedes.accelerate();

        System.out.println(audi);
        System.out.println(mercedes);
    }
}
