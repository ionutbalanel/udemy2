package p038IncapsulareGetterSiSetterExercitii.exercitiiNoi;

public class Main {
    public static void main(String[] args) {
//        1.Creați clasa IceCreamMachine, cu câmpurile următoare:
//        Vom avea o listă de tip String, în care vom trece aromele aparatului nostru: ciocolată, vanilie, căpșuni etc
//        Clasa noastră va avea metoda prepareIceCream(String desiredFlavor).
//        Aparatul nostru de înghețată va putea prepara înghețate doar dacă clientul nostru
//        introduce ca parametru o aromă valabilă din structura aparatului nostru
//        Testați funcționalitățile.

        IceCreamMachine iceCreamMachine = new IceCreamMachine();

        iceCreamMachine.prepareIceCream("ciocolata");
        iceCreamMachine.prepareIceCream("vanilie");
        iceCreamMachine.prepareIceCream("scortisoare");
        iceCreamMachine.prepareIceCream("capsuni");

        System.out.println();

//        2.Modificați funcționalitatea clasei noastre adăugați metoda addFlavor(String newFlavor),
//        care o va adăuga un nou tip de înghețată în mașina noastră
//        Testați funcționalitățile aplicație

        iceCreamMachine.addFlavor("ciocolata");
        iceCreamMachine.addFlavor("scortisoare");
        iceCreamMachine.addFlavor("capsuni");


        iceCreamMachine.prepareIceCream("ciocolata");
        iceCreamMachine.prepareIceCream("vanilie");
        iceCreamMachine.prepareIceCream("scortisoare");
        iceCreamMachine.prepareIceCream("capsuni");
    }
}
