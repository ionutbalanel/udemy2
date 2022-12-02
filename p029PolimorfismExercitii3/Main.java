package p029PolimorfismExercitii3;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        1.Creați clasa Shooter, cu proprietatea int maxRange și metoda shoot().
//        Sniper va moșteni Shooter, va avea un maxRange de 2000 de m și va împușca ținta în funcție de distanța maximă.
//        Pistol va moșteni Shooter, va avea un maxRange  de 100 de m și va împușca ținta în funcție de distanța maximă.
//        Ak47 va moșteni Shooter, va avea un maxRange de 500 de m și va avea metoda multiShoot().
//        În momentul în care un Ak47 va trece, se vor trage mai multe gloanțe deodată.

        /*

        Sniper sniper = new Sniper();
        Pistol pistol = new Pistol();
        Ak47 ak47 = new Ak47();

        sniper.shoot();
        pistol.shoot();
        ak47.shoot();

         */

//        2.Creați clasa VideoPlayer, cu metoda playVideo(String movieName).
//        Clasa VLCPlayer va porni video la o calitate bună.
//        Casa WindowsMediaPlayer va porni video la o calitate medie.
//        Clasa Winamp va porni video la o calitate slabă.

//        Creați un video player de fiecare tip de date definit.
//        Adăugați 5 filme într-o listă și faceți toate programele să ruleze filmele respective, descrescător.


        ArrayList<String> movies = new ArrayList<>(Arrays.asList("Lord of the Rings", "Star wars", "Shutter Island", "Inception"));

        VLCPlayer vlcPlayer = new VLCPlayer();
        WindowsMediaPlayer windowsMediaPlayer = new WindowsMediaPlayer();
        Winamp winamp = new Winamp();


        for (int i = movies.size()-1; i >=0; i--) {
            vlcPlayer.playVideo(movies.get(i));
            windowsMediaPlayer.playVideo(movies.get(i));
            winamp.playVideo(movies.get(i));
        }


    }
}
