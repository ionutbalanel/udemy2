package p018CompozitieExercitii3;

public class Hero {
    String name;
    int health;
    int atack;

    Villain enemy;

    public Hero(String name, int health, int atack) {
        this.name = name;
        this.health = health;
        this.atack = atack;
    }

    public void setEnemy(Villain villain){
        this.enemy=villain;
    }

    public void atack() {
        if (enemy != null) {
            enemy.health -= this.atack;
            System.out.println("Am atacat inamicul " + enemy);
        }else {
            System.out.println("Nu avem nici un villain inamic");
        }
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", atack=" + atack +
                ", enemy=" + enemy.name +
                '}';
    }
}
