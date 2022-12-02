package p028PolimorfismExercitii2;

public class CappucinoMaker extends CoffeMaker{
    @Override
    public void prepareCoffe() {
        addCoffe();
        addMilk();
        addSugar();
    }
    public void addMilk(){
        System.out.println("Am adaugat lapte");
    }
    public void addSugar(){
        System.out.println("Am adaugat zahar");
    }

}

