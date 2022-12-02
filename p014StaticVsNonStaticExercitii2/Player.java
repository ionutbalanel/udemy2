package p014StaticVsNonStaticExercitii2;

public class Player {
    static int slots=0;
    String name;
    int health;

    public Player(String name, int health) {
        slots+=50;
        this.name = name;
        this.health = health;
        if (slots>=300){
            System.out.println("Am depasit capacitatea maxima de jucatori.");
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                "name='" + name + '\'' +
                ", slots=" + slots +
                '}';
    }
}
