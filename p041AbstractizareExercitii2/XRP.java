package p041AbstractizareExercitii2;

public class XRP extends Cryptocurrency{
    public XRP(double valueInUSD) {
        super(valueInUSD);
    }

    @Override
    public void changeValue() {
        int probabilitate = generator.nextInt(11);
        if (probabilitate<=2){
            valueInUSD-=30.0;
            System.out.println("XRP a scazut cu 30");
        }else {
            valueInUSD+=10;
            System.out.println("XRP a crescut cu 10");
        }
    }
}
