package p033ConstanteExercitii1;

public class TShirt {
    final String BRAND;
    int size;
    String color;

    public TShirt(String BRAND, int size, String color) {
        this.BRAND = BRAND;
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "TShirt{" +
                "BRAND='" + BRAND + '\'' +
                ", size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}
