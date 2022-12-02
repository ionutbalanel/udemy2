package p018CompozitieExercitii3;

public class Villain {
    String name;
    int health;
    int atack;

    Hero enemy;

    public Villain(String name, int health, int atack) {
        this.name = name;
        this.health = health;
        this.atack = atack;
    }

    public void setEnemy(Hero hero){
        this.enemy=hero;
    }

    public void atack() {
        if (enemy != null) {
            enemy.health -= this.atack;
            System.out.println("Am atacat inamicul " + enemy);
        }else {
            System.out.println("Nu avem nici un hero inamic");
        }
    }

    @Override
    public String toString() {
        return "Villain{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", atack=" + atack +
                ", enemy=" + enemy.name +
                '}';
    }
}
