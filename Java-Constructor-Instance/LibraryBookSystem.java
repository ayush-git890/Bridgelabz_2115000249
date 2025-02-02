import java.util.*;
class Book {
    private String title;
    private String author;
    private double price;
    private boolean available;
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }
    public boolean buyTheBook() { //this is the method i used to boroow the book
        if (available) {
            available = false;
            return true;
        }
        return false;
    }
    public void printData() {
        System.out.println("title--> " + title);
        System.out.println("author--> " + author);
        System.out.println("price--> " + price);
        System.out.println("Available: " + (available ? "yes" : "no"));
    }
}
public class LibraryBookSystem{
	public static void main(String args[]){
		Book book = new Book("Taj Mahal", "ahkbar", 50000);
        book.printData();
        System.out.println("Borrowing Book...");
        if (book.buyTheBook()) {
            System.out.println("book buyies successfully finished!!!");
        } else {
            System.out.println("book is not available sorry !!!");
        }
        System.out.println("this are the details after book buyied...");
        book.printData();
	}
}