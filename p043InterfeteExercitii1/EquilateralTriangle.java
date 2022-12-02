package p043InterfeteExercitii1;

public class EquilateralTriangle implements RegularPolygon{
    int sideLength;

    public EquilateralTriangle(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public int getNumSides() {
        return 3;
    }

    @Override
    public int getSideLength() {
        return this.sideLength;
    }
}
