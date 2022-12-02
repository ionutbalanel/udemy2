package p034ConstanteExercitii2;

public class Main {
    public static void main(String[] args) {

//        1.Creați clasa Student, cu proprietățile String name, int year si String major, setate prin constructor.
//        Odată ales un nume și un major pentru studenți, acestea nu vor mai putea fi modificate. Creați metoda passYear(),
//        care modifică structura internă a unui Student. Studenții pot fi în anii 1 - 4.
//        Inițializa-ți un student boboc, după care faceți-l el să absolve facultatea.

        /*

        Student student = new Student("Ion","Java");
        student.passYear();
        student.passYear();
        student.passYear();
        student.passYear();

         */


//        2.Creați clasa Teacher, cu proprietățile String name, int age si String subject.
//        Un profesor nu își va putea schimba niciodată materia predată.
//        Inițializati doi profesori, după care printați detaliile acestora.

        /*

        Teacher teacher1 = new Teacher("Ion",36,"Java");
        Teacher teacher2 = new Teacher("Elena",36,"C++");

        System.out.println(teacher1);
        System.out.println(teacher2);

         */


//        3.Creați clasa Car cu proprietățile String marca, String model, boolean on și metodele startEngine(), stopEngine() si accelerate().
//        Creați clasele copil Bmw, Dacia si Mercedes. Clasele copil nu vor putea suprascrie metodele startEngine() si stopEngine(),
//        însă vor avea propria implimentare a metodei accelerate().
//        Inițializați o mașină de fiecare tip, porniți-o și faceți-o să accelerezi.



        Bmw bmw = new Bmw();
        Dacia dacia = new Dacia();
        Mercedes mercedes = new Mercedes();

        bmw.startEngine();
        dacia.startEngine();
        mercedes.startEngine();

        bmw.accelerate();
        dacia.accelerate();
        mercedes.accelerate();

        bmw.stopEngine();
        dacia.startEngine();
        mercedes.startEngine();

    }
}
