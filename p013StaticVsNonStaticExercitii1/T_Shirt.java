package p013StaticVsNonStaticExercitii1;

public class T_Shirt {
    String color;
    int size;
    static String brand = "Nike";


    public T_Shirt(int size, String color) {
        this.size = size;
        this.color = color;
    }

    public static void changeBrandName(String newBrandName) {
        brand=newBrandName;
    }

    @Override
    public String toString() {
        return "T_Shirt{" +
                "size=" + size +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
