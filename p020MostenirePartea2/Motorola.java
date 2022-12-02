package p020MostenirePartea2;

public class Motorola extends Cellular{
    boolean clapOpen;

    public Motorola(String number, int price, boolean clapOpen) {
        super(number, price);
        this.clapOpen = clapOpen;
    }

    public void closeClap(){
        if (clapOpen){
            System.out.println("Am inchis clapa");
            clapOpen=false;
        }else {
            System.out.println("Am deschis clapa");
            clapOpen=true;
        }
    }
}
