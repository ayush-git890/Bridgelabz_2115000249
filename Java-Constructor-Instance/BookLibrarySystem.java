import java.util.*;
class Book {
    public String ISBN;
    protected String title;
    private String author;
    public Book() {
        this.ISBN = "";
        this.title = "";
        this.author = "";
    }
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void printData() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class EBook extends Book {
    private double sizeFile;

    public EBook(String ISBN, String title, String author, double sizeFile) {
        this.ISBN = ISBN;
        this.title = title;     // Protected member
        this.setAuthor(author);
        this.sizeFile = sizeFile;
    }
    // tocces protect and public mmber.....
    public void displayEBook() {
        System.out.println("E-Book: " + title + " " + ISBN + ", Size: " + sizeFile + "mb");
    }
}

public class BookLibrarySystem {
    public static void main(String args[]) {
        Book b1 = new Book("279", "Java", "Ayush");
        b1.printData();

        //book name updated
        b1.setAuthor("Taj Mahal");
        System.out.println("Updated Author: " + b1.getAuthor());

        EBook e1 = new EBook("288", "DSA", "Robert", 4.4);
        e1.displayEBook();
    }
}