package p041AbstractizareExercitii2;

import java.util.Random;

public abstract class Cryptocurrency {
    protected Random generator = new Random();
    double valueInUSD;

    public Cryptocurrency(double valueInUSD) {
        this.valueInUSD = valueInUSD;
    }

    public abstract void changeValue();
}
