package p025PolimorfismPartea1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cetatean> cetateans =new ArrayList<>();

        cetateans.add(new American("Josh"));
        cetateans.add(new American("Smith"));
        cetateans.add(new Roman("Tudor"));
        cetateans.add(new Roman("Gabi"));
        cetateans.add(new Francez("Pierre"));
        cetateans.add(new Francez("Celine"));

        for (Cetatean cetatean : cetateans) {
            cetatean.saluta();
        }

    }
}
