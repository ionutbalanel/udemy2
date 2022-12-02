package p028PolimorfismExercitii2;

import java.util.Scanner;

public class EspressoMaker extends CoffeMaker{
    Scanner sc = new Scanner(System.in);


    public void addMilk(){
        System.out.println("Doriti lapte la espresso? (yes OR no): ");
        String raspuns = sc.nextLine();

        if (raspuns.equals("yes")){
            System.out.println("Am adaugat lapte la espresso.");
        } else if (raspuns.equals("no")) {
            System.out.println("Nu am adaugat lapte la espresso.");
        }else {
            System.out.println("Nu ai introdus un raspuns valabil");
        }

    }
    public void makeItDouble(){
        System.out.println("Doriti un espresso dublu? (yes OR no):");
        String raspuns = sc.nextLine();
        if (raspuns.equals("yes")){
            addCoffe();
        } else if (raspuns.equals("no")) {
            System.out.println("Nu am facut un espresso dublu.");
        }else {
            System.out.println("Nu ai introdus un raspuns valabil");
        }
    }

    @Override
    public void prepareCoffe() {
        addCoffe();
        addMilk();
        makeItDouble();
    }
}
