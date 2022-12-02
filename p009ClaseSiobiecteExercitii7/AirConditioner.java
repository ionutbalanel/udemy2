package p009ClaseSiobiecteExercitii7;

public class AirConditioner {
    boolean on;
    int temperature;
    boolean swinging;

    public void turnOn() {
        if (on) {
            System.out.println("AC-ul este deja pornit");
        } else {
            on = true;
            System.out.println("Am pornit AC-ul");
        }
    }

    public void turnOff() {
        if (on) {
            on = false;
            System.out.println("Am oprit AC-ul");
        } else {

            System.out.println("AC-ul este deja oprit");
        }
    }

    public void raiseTemperature() {
        if (on) {
            if (temperature == 30) {
                System.out.println("Temperatura este data la maxim");
            } else {
                temperature++;
                System.out.println("Am crescut temperatura");
            }
        } else {
            System.out.println("AC-ul trebuie pornit");
        }
    }

    public void lowerTemperature() {
        if (on) {
            if (temperature == 0) {
                System.out.println("AC-ul este dat pe minim");
            } else {
                temperature--;
                System.out.println("Am scazut temperatura");
            }
        } else {
            System.out.println("AC-ul trebuie pornit");
        }
    }

    public void swing() {
        if (on) {
            if (swinging) {
                System.out.println("Am oprit AC-ul din balans");
                swinging = false;
            } else {
                System.out.println("Am pornit balansul AC-ului");
                swinging = true;
            }
        } else {
            System.out.println("AC-ul trebuie pornit");
        }
    }

    @Override
    public String toString() {
        return "AirConditioner{" +
                "on=" + on +
                ", temperature=" + temperature +
                ", swinging=" + swinging +
                '}';
    }
}
