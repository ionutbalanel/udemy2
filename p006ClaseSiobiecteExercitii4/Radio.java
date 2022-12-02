package p006ClaseSiobiecteExercitii4;

import java.util.ArrayList;
import java.util.Arrays;

public class Radio {
    boolean on;
    int volume;
    int currentPostIndex;
    ArrayList<String> posts;

    public Radio() {
        currentPostIndex = 1;
        posts = new ArrayList<>(Arrays.asList("MagicFm", "RadioZu", "DigiFm"));
        posts.add("RockFm");
        posts.add("EuropaFm");
    }

    public void turnOn() {
        if (on) {
            System.out.println("Radioul este deja pornit");
        } else {
            System.out.println("Am pornit radioul");
            on = true;
        }
    }

    public void turnOff() {
        if (on) {
            System.out.println("Am oprit radioul");
            on = false;
        } else {
            System.out.println("Radioul este deja oprit");
        }
    }

    public void turnVolumeUp() {
        if (volume == 10) {
            System.out.println("Radioul este dat la volumul maxim");
        } else {
            volume++;
            System.out.println("Am schimbat volumul pe treapta " + volume);
            displayRadioStatus();
        }
    }

    public void turnVolumeDown() {
        if (volume == 0) {
            System.out.println("Radioul este deja pe mute");
        } else {
            volume--;
            System.out.println("Am schimbat volumul pe treapta " + volume);
            displayRadioStatus();
        }
    }

    public void changePostForward() {
        if (currentPostIndex == posts.size() - 1) {
            currentPostIndex = 0;
        } else {
            currentPostIndex++;
            displayRadioStatus();
        }

    }

    public void changePostBackwords() {
        if (currentPostIndex == 0) {
            currentPostIndex = posts.size() - 1;
        } else {
            currentPostIndex--;
            displayRadioStatus();
        }
    }

    public void displayRadioStatus() {
        if (!on) {
            System.out.println("Radioul este oprit");
        } else {
            System.out.println("Radioul este pe postul " + posts.get(currentPostIndex) + " dat la volumul " + volume);
        }
    }

}
