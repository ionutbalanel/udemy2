package p031OverloadingvsOverridingExercitii;

public class AcademiaProgramatorilor {
    public void pass(String student){
        System.out.println("Studentul "+student+" a absolvit AcademiaProgramatorilor");
    }
    public void pass(String... studenti){
        for (String student : studenti) {
            System.out.println("Studentul "+student+" a absolvit AcademiaProgramatorilor");
        }

    }
}
