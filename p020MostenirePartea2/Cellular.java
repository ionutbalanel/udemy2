package p020MostenirePartea2;

public class Cellular extends Phone{

    public Cellular(String number, int price) {
        super(number, price);
    }

    public void takePicture(){
        System.out.println("We took a low quality picture.");
    }
    public void playVideo(){
        System.out.println("Playing a low quality Video");
    }
}
