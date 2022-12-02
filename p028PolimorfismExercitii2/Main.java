package p028PolimorfismExercitii2;

public class Main {
    public static void main(String[] args) {
//        1.Creați clasa CoffeMaker, cu metoda prepareCoffe() și addCoffe(). Metoda addCoffe() va fi apelată în metoda prepareCoffe().
//        Clasa CappucinoMaker va moșteni clasa CoffeMaker, va avea metoda addMilk() si addSugar().  Când preparăm un cappuccino se va adăuga cafea,
//        se va adăuga lapte, iar apoi se va adăuga zahăr.
//        Clasa EspressoMaker va moșteni clasa CoffeMaker și va avea metoda addMilk(), care va întreba utilizatorul dacă dorește lapte la espresso,
//        și metoda makeItDouble(), care de asemenea va întreba utilizatorul dacă dorește un espresso dublu.
//        Când preparăm un espresso vom adăuga cafea, vom întreba utilizatorul dacă dorește o cafea dublă, iar dacă da vom adăuga din nou cafea.
//        Preparați un Cappuccino și un Espresso.

        /*

        CappucinoMaker cappucinoMaker = new CappucinoMaker();
        EspressoMaker espressoMaker = new EspressoMaker();

        cappucinoMaker.prepareCoffe();
        System.out.println();
        espressoMaker.prepareCoffe();

         */
//
//        2.Creați clasa Shaorma, cu metodele adaugaCarne(), adaugaCartofi(), adaugaSalate() si metoda pregatesteShaorma().
//        ShaormaDulce va extinde Shaorma și va avea metoda adaugaKetchupDulce(). Prepararea ei va include toate metodele existente în clasa.
//        ShaormaPicanta va extinde Shaorma și va avea metodele  adaugaKetchupPicant() si adaugaUsturoi(). Prepararea ei va include toate metodele existente în clasă.
//        Preparați o shaorma dulce și una picantă

        ShaormaDulce shaormaDulce = new ShaormaDulce();
        ShaormaPicanta shaormaPicanta = new ShaormaPicanta();

        shaormaDulce.pregatesteShaorma();
        System.out.println();
        shaormaPicanta.pregatesteShaorma();

    }
}
