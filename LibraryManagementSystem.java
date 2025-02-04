import java.util.*;
class Book {
    private static String libraryName = "GLA Central Library";
    private final String isbn;// it cannot be changed.....
    private String title;
    private String author;
	
    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }
    public void printData() {
        if (this instanceof Book) {
            System.out.println("the library name -->  " + libraryName);
            System.out.println("ISBN: " + isbn);
            System.out.println("Title: " + title);
            System.out.println("author: " + author);
            System.out.println();
        }
    }
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }
}
public class LibraryManagementSystem{
	public static void main(String args[]){
		Book.displayLibraryName();
        Book b1 = new Book("12345678", "The Great Taj Mahal", "Akhbar");
        Book b2 = new Book("789456123", "Constitution", "Subhash Chandra Bose");
        b1.printData();
		System.out.println("=======================================");
        b2.printData();
	}
}