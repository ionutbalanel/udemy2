package p020MostenirePartea2;

public class Phone {
    String number;
    int price;

    public Phone(String number, int price) {
        this.number = number;
        this.price = price;
    }

    public void call() {
        System.out.println(number + " made a call.");

    }

    public void showDetails() {
        System.out.println("Telefon: number " + number + " , price: " + price);

    }
}
