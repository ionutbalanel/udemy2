package p008ClaseSiobiecteExercitii6;

public class Main {
    public static void main(String[] args) {

//        1.Creați clasele PC și Monitor. PC-ul va avea următoarele caracteristici: boolean on, int ram. String procesor, pressPowerButton().
//        Monitorul va avea următoarele caracteristici: boolean on, double diagonala, pressPowerButton().
//        Pentru ambele clase, metoda pressPowerButton() va porni PC-ul / monitorul dacă este închis, și îl va închide dacă este pornit.
//        Creați un pc și un monitor. Porniți-le și opriți-le.

        /*

        PC calculator = new PC(8,"i7");
        Monitor monitor = new Monitor(18.5);

        calculator.pressPowerButton();
        calculator.pressPowerButton();
        calculator.pressPowerButton();

        monitor.pressPowerButton();
        monitor.pressPowerButton();
        monitor.pressPowerButton();

         */

//        2.Creați clasa Bus, cu următoarele proprietăți: String brand, int maxPassagers, int passagerNumber, int maxSpeed si metodele addPassager()
//        si reachNextStation().
//        Un autobuz nu poate primi mai mulți pasageri decât capacitatea sa maximă.
//        Dacă un autobuz are mai mult de jumătate din capacitatea maximă de pasageri la bord, va merge la următoarea stație
//        cu jumătate din viteza sa maximă. Dacă are mai puțin de jumătate, va merge cu viteza maximă.
//        Creați două autobuze în care să adăugați pasageri.
//        Faceți ambele autobuz să ajungă la următoarea stație în moduri diferite (max speed/half speed - în funcție de numărul pasagerilor).

        /*

        Bus bus1 = new Bus("Mercedes",20,60);
        for (int i = 0; i < 16; i++) {
            bus1.addPassager();
        }

        Bus bus2 = new Bus("Mercedes",15,50);
        for (int i = 0; i < 3; i++) {
            bus2.addPassager();
        }

        bus1.reachNextStation();
        bus2.reachNextStation();

         */

//        3.Creați clasa Plane, cu câmpurile String brand, String model, boolean isFlying, int maxPassagers si metodele addPassager(),
//        fly() si land(). Un avion își va lua zborul dacă este la sol și dacă are la bord cel puțin jumătate din capacitatea maximă de pasageri.
//        Un avion va ateriza doar dacă zboară. Creați un avion căruia să îi apelați și să îi testați toate funcționalitățile, în fiecare caz.

        /*

        Plane plane1 = new Plane("Boeing","737",30);

        plane1.land();
        plane1.fly();
        for (int i = 0; i < 16; i++) {
            plane1.addPassager();
        }
        plane1.fly();
        plane1.land();

         */
    }
}
