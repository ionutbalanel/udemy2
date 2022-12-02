package p018CompozitieExercitii3;

import java.util.ArrayList;

public class Town {
    String name;
    ArrayList<LocalAttraction> localAtractions = new ArrayList<>();

    public Town(String name) {
        this.name = name;
    }

    public void addAttraction(LocalAttraction localAttraction){
        this.localAtractions.add(localAttraction);

    }

    public void printLocalAttractions(){
        for (LocalAttraction localAtraction : localAtractions) {
            System.out.println(localAtraction);
        }
    }

    @Override
    public String toString() {
        return "Town{" +
                "name='" + name + '\'' +
                ", localAtractions=" + localAtractions +
                '}';
    }
}
