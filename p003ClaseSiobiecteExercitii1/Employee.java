package p003ClaseSiobiecteExercitii1;

public class Employee {
    String nume;
    int anInscriere;
    String adresa;
    int salariu;

    public Employee(String nume, int anInscriere, String adresa, int salariu) {
        this.nume = nume;
        this.anInscriere = anInscriere;
        this.adresa = adresa;
        this.salariu = salariu;
    }

    public void showDetails() {
        System.out.println(nume + "\t" + anInscriere + "\t" + adresa + "\t" + salariu);
    }

}
