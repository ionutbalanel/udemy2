package p028PolimorfismExercitii2;

public class ShaormaDulce extends Shaorma{

    public void adaugaKetchupDulce(){
        System.out.println("Am adaugat ketchup dulce");

    }

    @Override
    public void pregatesteShaorma() {
        super.pregatesteShaorma();
        adaugaKetchupDulce();
    }
}
