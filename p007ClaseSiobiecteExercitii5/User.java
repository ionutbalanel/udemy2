package p007ClaseSiobiecteExercitii5;

public class User {
    String username;
    String password;

    public User(String username, String password, String confirmPassword) {

        checkUsernameLength(username);
        checkPasswordLength(password);
        checkPasswordDigits(password);
        checkPasswords(password, confirmPassword);

        this.username = username;
        this.password = password;
    }

    private static void checkPasswords(String password, String confirmPassword) {
        if (!password.equals(confirmPassword)){
            System.out.println("Problema: Parolele introduse nu coincid!");
        }
    }

    private static void checkPasswordDigits(String password) {
        char[] caractereParola = password.toCharArray();
        int numarCifre = 0;
        for (char c : caractereParola) {
            if (Character.isDigit(c)){
                numarCifre++;
            }
        }
        if (numarCifre<2){
            System.out.println("Problema: Parola trebuie sa contina minim 2 cifre");
        }
    }

    private static void checkPasswordLength(String password) {
        if (password.length()<8) {
            System.out.println("Problema: Parola introdus are mai putin de 8 caractere!");
        }
    }

    private static void checkUsernameLength(String username) {
        if (username.length()<7){
            System.out.println("Problema: Username-ul introdus are mai putin de 7 caractere!");
        }
    }
}
