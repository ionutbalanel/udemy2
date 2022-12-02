package p029PolimorfismExercitii3;

public class Winamp extends VideoPlayer {
    @Override
    public void playVideo(String movieName) {
        System.out.println("Filmul " + movieName + " este rulat la o calitate slaba");
    }
}
