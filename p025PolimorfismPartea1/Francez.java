package p025PolimorfismPartea1;

public class Francez extends Cetatean{
    public Francez(String nume) {
        super(nume);
    }

    @Override
    public void saluta() {
        System.out.println(this.nume+" Bonjour!");
    }
}
