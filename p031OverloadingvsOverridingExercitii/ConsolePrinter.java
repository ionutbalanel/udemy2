package p031OverloadingvsOverridingExercitii;

public class ConsolePrinter {
    public void printText(String text){
        System.out.println(text);
    }
    public void printText(String text, int numarRepetitii){
        for (int i = 0; i < numarRepetitii; i++) {
            System.out.println(text);
            
        }
    }
}
