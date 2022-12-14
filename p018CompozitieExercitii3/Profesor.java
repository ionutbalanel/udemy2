package p018CompozitieExercitii3;

import java.util.ArrayList;

public class Profesor {
    String name;
    ArrayList<Elev> elevi=new ArrayList<>();

    public Profesor(String name) {
        this.name = name;
    }

    public void addStudent(Elev elev){
        elevi.add(elev);
    }

    public void addGrade(int index, int grade){
        elevi.get(index).note.add(grade);
    }
    public void calculeazaMediaElevilor(){
        for (Elev elev : elevi) {
            printeazaMediaElevului(elev);
        }
    }

    private static void printeazaMediaElevului(Elev elev) {
        int medie=0;
        for (int nota : elev.note) {
            medie+=nota;
        }
        medie/= elev.note.size();
        System.out.println("Avem o medie de "+medie);
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "name='" + name + '\'' +
                ", elevi=" + elevi +
                '}';
    }
}
