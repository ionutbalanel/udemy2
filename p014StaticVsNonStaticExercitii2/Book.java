package p014StaticVsNonStaticExercitii2;

public class Book {
    static int totalStudent = 0;
    String name;
    String authorName;

    public Book(String name, String authorName) {
        this.name = name;
        this.authorName = authorName;
    }
    public void brown(){
        System.out.println("Cartea "+name+" a fost imprumutata");
        totalStudent++;
    }
}
