package p033ConstanteExercitii1;

public class Main {
    public static void main(String[] args) {
//        1.Scrieți clasa DatePersonale, care să conțină următoarele constante statice: nume, prenume, adresa.
//        Printați în clasa Main  toate datele voastre personale.

        /*

        System.out.println(DatePersonale.NUME);
        System.out.println(DatePersonale.PRENUME);
        System.out.println(DatePersonale.ADRESA);

         */


//        2.Scrieți clasa TShirt, cu următoarele proprietăți: String brand, int size, String color.
//        Gândiți-vă ce proprietate nu ar trebui modificată și inițializați un tricou, modificând celelalte proprietăți,
//        prin intermediul unor metode corespunzătoare.

        /*

        TShirt tricou = new TShirt("Nike",4,"Black");
        tricou.size=5;
        tricou.color="brown";

        System.out.println(tricou);

         */

//        3.Creați clasa Animal, cu următoarele proprietăți: String name, int hungerLevel,  și metodele makeSound() si eat().
//        Creați clasele copil Lion, Dog si Cat, restricționând posibilitatea de a suprascrie metoda eat(). Fiecare animal în schimb va scoate sunetul corespunzător.
//        Inițializați un obiect din fiecare tip de dată copil. Faceți toate animalele să mănânce și să scoată sunete.

        /*

        Lion leu = new Lion("Simba");
        Cat pisica = new Cat("Avva");
        Dog caine = new Dog("Nala");

        leu.makeSound();
        leu.eat();

        pisica.makeSound();
        pisica.eat();

        caine.makeSound();
        caine.eat();

         */

//        4.Creați clasa Phone, cu următoarele proprietăți: String brand, String model, și metodele makeCall(String phoneNumber) si downloadAppFromStore(String appName).
//        Creați clasele copil Samsung, I_Phone și Huawei, restricționând posibilitatea de a suprascrie metoda makeCall().
//        Inițializați un obiect de fiecare tip de data copil. Faceți toate telefoanele să sune și să downloadeze o aplicație.

        Samsung samsung = new Samsung();
        I_Phone i_phone = new I_Phone();
        Huawei huawei = new Huawei();

        samsung.makeCall();
        samsung.downloadAppFromStore("Facebook");

        i_phone.makeCall();
        i_phone.downloadAppFromStore("Facebook");

        huawei.makeCall();
        huawei.downloadAppFromStore("Facebook");




    }
}
