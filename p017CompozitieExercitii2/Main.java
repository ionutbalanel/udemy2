package p017CompozitieExercitii2;

public class Main {
    public static void main(String[] args) {
//        1.Creați clasa Heart, cu metoda beat().
//        Creați clasa Stomach, cu proprietatea boolean needsFood.
//        Creații clasa Brain, cu proprietatea int iq;
//        Creați clasa Human, cu proprietățile String name, Heart heart, Stomach stomach, Brain brain și metodele eat(), read(), live().
//        Fiecare metodă a persoanei va influența starea sau comportamentul organelor acestuia.
//        Creați un om, apelați-i metodele și printați constant starea acestuia.

        /*

        Human human = new Human("Ion",new Heart(),new Stomach(),new Brain());

        System.out.println(human);

        human.eat();
        human.read();
        human.live();

        System.out.println(human);

         */

//        2.Creați clasa Pokemon, cu proprietatea String name și metoda sayHello(), care va printa la consolă de 3 ori numele pokemonului nostru.
//        Creați clasat Trainer, cu proprietățile String name, ArrayList<Pokemon> pokemons,
//        metoda addPokemonToCollection(Pokemon pokemon) și metoda releaseAllPokemons().
//        Toți pokemonii trainerului vor saluta când sunt scoși din minge.
//        Generați un trainer căruia să-i adăugați 5 pokemoni. Eliberați toți pokemonii.

        /*

        Trainer trainer = new Trainer("Ash");

        trainer.addPokemonToCollection(new Pokemon("Pikachu"));
        trainer.addPokemonToCollection(new Pokemon("Charizard"));
        trainer.addPokemonToCollection(new Pokemon("Eeye"));
        trainer.addPokemonToCollection(new Pokemon("Charmender"));
        trainer.addPokemonToCollection(new Pokemon("Bulbasaur"));

        trainer.releaseAllPokemons();

         */


//        3.Creați clasa Monitor, cu proprietățile String brand, int diagonala și int price.
//        Creați clasa Keyboard, cu proprietățile String brand și int price.
//        Creați clasa Mouse cu proprietățile String brand, String color și int price.
//        Creați clasa Calculator, cu proprietățile String brand, int price, Mouse mouse, Keyboard keyboard și Monitor monitor.
//        Clasa Calculator va avea de asemenea o metodă non statică printTotalPrice(),
//        care va calcula și va printa suma tuturor prețurilor, produselor componente.
//        Generații două calculatoare, fiecare cu piese diferite, apoi printatile prețul amândurora.

        Calculator calculator = new Calculator("Samsung",1000,
                new Mouse("Samsung","Negru",200),
                new Keyboard("Samsung",150),
                new Monitor("Samsung",18,500));

        Calculator calculator2 = new Calculator("Apple",1500,
                new Mouse("Apple","Negru",200),
                new Keyboard("Apple",150),
                new Monitor("Apple",18,500));

        calculator.printTotalPrice();
        calculator2.printTotalPrice();

    }
}
