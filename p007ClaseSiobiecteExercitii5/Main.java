package p007ClaseSiobiecteExercitii5;

public class Main {
    public static void main(String[] args) {

//    1.Creați clasa User, cu următoarele fielduri: String username, String password.
//    Constructorul clasei va primi următorii parametri: username, password și confirmPassword.
//    În constructor se va efectua următoarele verificări. Fiecare încălcare a acestor reguli va fișa la consolă un mesaj corespunzător:
//    Username-ul trebuie să aibă minim 7 caractere.
//    Parola trebuie să aibă minim 8 caractere
//    Parola trebuie să conțină cel puțin 2 cifre
//    Parola pasată ca parametru trebuie să fie aceeași cu parola confirmată
//    Creați un user care să respecte toate cerințele aplicației
//    Creați câte un user care să încalce câte o cerință a aplicație

        /*

        User user1 = new User("TudorAndrei95","pass12345","pass12345");
        User user2 = new User("Tudor","pass12345","pass12345");
        User user3 = new User("TudorAndrei95","pass","pass1");

         */

//    2.Creați clasa FacebookUser, cu următoarele fielduri: firstName, lastName, birthYear, List<String> posts.
//    FacebookUserul va avea metoda writePost(String content), care va adăuga o nouă postare în lista lui de postari,
//    și metoda printAllPosts(), care va printa toate postările.
//    Creați doi useri. Fiecare user va scrie între 2 și 4 postări. Printați postările pentru fiecare user.

        FacebookUser user1 =new FacebookUser("Tudor","Andrei",1995);
        FacebookUser user2 =new FacebookUser("Ana","Maria",1992);

        user1.writePost("Afara ploua");
        user1.writePost("numai ploua");

        user2.writePost("Vand Golf4");
        user2.writePost("S-a vandut");
        user2.writePost("Check in Caraibe");

        user1.printAllPosts();
        user2.printAllPosts();


    }
}
