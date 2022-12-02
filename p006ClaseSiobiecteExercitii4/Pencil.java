package p006ClaseSiobiecteExercitii4;

public class Pencil {
    String color;
    int remainingInk;

    public Pencil(String color) {
        this.color = color;
        remainingInk = 1000;
    }

    public void write(String text) {
        // remainingInk -= text.length();
        char[] litere =text.toCharArray();
        for (char c : litere) {
            if (Character.isDigit(c)||Character.isLetter(c)){
                remainingInk--;
            }
        }
        System.out.println(text);
    }
}
