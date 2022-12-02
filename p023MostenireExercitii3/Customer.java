package p023MostenireExercitii3;

import java.util.ArrayList;

public class Customer {
    String nume;
    int buget;
    ArrayList<Haine> produseCumparate;

    public Customer(String nume, int buget) {
        this.nume = nume;
        this.buget = buget;
        this.produseCumparate = new ArrayList<>();
    }

    public void buyGlothes(Haine haine) {
        if (this.buget >= haine.pret) {
            System.out.println("Clientul " + nume + " a cumparat " + haine);
            this.produseCumparate.add(haine);
            this.buget-=haine.pret;
        } else {
            System.out.println("Nu aveti suficienti bani pentru a cumpara " + haine);
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "nume='" + nume + '\'' +
                ", buget=" + buget +
                ", produseCumparate=" + produseCumparate +
                '}';
    }
}
