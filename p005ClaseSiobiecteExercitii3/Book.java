package p005ClaseSiobiecteExercitii3;

public class Book {
    String name;
    String author;
    int totalPageNumber;
    int currentPageNumber;

    public Book(String name, String author, int totalPageNumber) {
        this.name = name;
        this.author = author;
        this.totalPageNumber = totalPageNumber;
        currentPageNumber = 1;
    }

    public void flipPageForwad() {
        if (currentPageNumber == totalPageNumber) {
            System.out.println("Nu mai avem pagini de rasfoit");
        } else {
            currentPageNumber++;
            System.out.println("Am dat la pagina " + currentPageNumber);
        }

    }

    public void flipPageBackword() {
        if (currentPageNumber == 1) {
            System.out.println("Suntem deja la prima pagina");
        } else {
            currentPageNumber--;
            System.out.println("Am dat la pagina " + currentPageNumber);
        }
    }

    public void printBookState() {
        System.out.println("Cartea " + name + " scrisa de " + author + " este deschisa la pagina " + currentPageNumber);

    }
}
