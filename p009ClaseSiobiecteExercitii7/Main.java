package p009ClaseSiobiecteExercitii7;

public class Main {
    public static void main(String[] args) {

//        1.Creați clasa Aragaz, cu următoarele fielduri: boolean isGasConnected, eyeOneIsLit, eyeTwoIsLit, eyeThreeIsLit, eyeFourIsLit
//        și următoarele metode: coupleGas(), decoupleGas(), pressFirstEyeButton(), pressSecondEyeButton(), pressThirdEyeButton(),
//        pressForthEyeButton(). Fiecare metodă va prinde ochiul respectiv dacă este stins și îl va stinge dacă este aprins.
//        Dacă la un moment dat utilizatorul aprinde toate cele 4 ochiuri ca o metoda de siguranță, toate ochiurile se vor stinge
//        și gazul va fi decuplat automat.
//        Creați un cuptor și testați toate funcționalitățile acestuia.

        /*

        Aragaz aragaz = new Aragaz();

        aragaz.coupleGas();

        aragaz.pressFirstEyeButton();
        aragaz.pressFirstEyeButton();
        aragaz.pressFirstEyeButton();

        aragaz.pressSecondEyeButton();
        aragaz.pressThirdEyeButton();
        aragaz.pressForthEyeButton();

         */


//        2.Creați clasa AirConditioner, cu fieldurile boolean on, int temperature, boolean swinging si metodele turnOn(),
//        turnOff(), raiseTemperature(), lowerTemperature() si swing().
//        Suprascrieți metoda toString pentru a printa starea actuală a fiecărui aer condiționat.
//        Creați un aer condiționat și testați funcționalitățile acestuia.

        AirConditioner ac = new AirConditioner();

        ac.turnOn();
        ac.raiseTemperature();
        ac.raiseTemperature();
        ac.raiseTemperature();
        ac.raiseTemperature();
        ac.swing();
        System.out.println(ac);
        ac.swing();
        ac.lowerTemperature();
        System.out.println(ac);


    }
}
