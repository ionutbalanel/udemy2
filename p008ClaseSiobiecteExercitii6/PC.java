package p008ClaseSiobiecteExercitii6;

public class PC {
    boolean on;
    int ram;
    String procesor;

    public PC(int ram, String procesor) {
        this.ram = ram;
        this.procesor = procesor;
    }

    public void pressPowerButton(){
        if (on){
            System.out.println("Am oprit calculatorul!");
            on=false;
        }else {
            System.out.println("Am pornit calculatorul!");
            on=true;
        }
    }
}
