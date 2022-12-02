package p031OverloadingvsOverridingExercitii;

public class ProcesatorDeAsigurari {
    public static void proceseaza(Asigurare asigurare){
        System.out.println("Asigurarea " + asigurare +" a fost procesată");
    }
    public static void proceseaza(Asigurare asigurare, boolean aprovedByManager){
        System.out.println((aprovedByManager?"":"NU")+" am procesat asigurarea "+asigurare);
    }
}
