package p028PolimorfismExercitii2;

public class ShaormaPicanta extends Shaorma{
    public void adaugaKetchupPicant(){
        System.out.println("Am adaugat ketchup picant");

    }
    public void adaugaUsturoi(){
        System.out.println("Am adaugat usturoi");

    }

    @Override
    public void pregatesteShaorma() {
        super.pregatesteShaorma();
        adaugaKetchupPicant();
        adaugaUsturoi();
    }
}
