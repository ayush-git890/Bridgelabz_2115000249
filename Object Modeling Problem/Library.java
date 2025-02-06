import java.util.*;
class Book { // here we created Book class...
    private String title;
    private String author;
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public void printBookDetails() {
        System.out.println("the book namae is "+title+" and the author name is "+author);
    }
}
public class Library { // here we created Library created...
    private String libName;
    private List<Book> arr;// here we created a arraylist of book object inside Library...
    public Library(String libName) {
        this.libName = libName;
        this.arr = new ArrayList<>();
    }

    public void addBook(Book book) {
        arr.add(book);
    }
    public void printLiraryBookData() {
        System.out.println("the name of library is " + libName);
        for (Book b : arr) {
            b.printBookDetails();
        }
        System.out.println();
    }
	public static void main(String[] args) {
        Book b1 = new Book("Taj Mahal", "Akhbar");
        Book b2 = new Book("Time Machine", "Ayush");
        Library l1 = new Library("GLA Library");
        Library l2 = new Library("Central Library");
		
        l1.addBook(b1);
        l2.addBook(b2);

        l1.printLiraryBookData();
        l2.printLiraryBookData();
    }
}