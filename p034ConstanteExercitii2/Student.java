package p034ConstanteExercitii2;

public class Student {
    final String name;
    int year;
    final String major;

    public Student(String name, String major) {
        this.name = name;
        this.major = major;

        year = 1;
    }

    public void passYear(){
        if (year<4){
            System.out.println("Studentul a trecut in anul "+ ++year);
        }else {
            System.out.println("Studentul a absolvit");
        }

    }
}
