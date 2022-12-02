package p020MostenirePartea2;

public class Smartphone extends Phone{

    public Smartphone(String number, int price) {
        super(number, price);
    }

    public void takeScreenShot(){
        System.out.println("Screenshot taker");
    }
    public void takePicture(){
        System.out.println("We took a good quality picture.");
    }
    public void playVideo(){
        System.out.println("Playing a high quality Video");
    }
}
