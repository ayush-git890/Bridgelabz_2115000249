import java.util.*;
class Book {
    private String title;
    private String author;
    private double price;
    public Book() {
        this.title = "ayush by default";
        this.author = "ayush by default";
        this.price = 1000000;
    }
	//this is our paremetrized method....
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    public void setData(String title, String author, double price){
		this.title = title;
		this.author = author;
		this.price = price;
	}

    // Method to display book details
    public void printData() {
        System.out.println("title -> : " + getTitle());
        System.out.println("author-> " + getAuthor());
        System.out.println("price-> " + getPrice());
    }
}
public class BookDetails{
	public static void main(String args[]){
		Book book = new Book();
        book.printData();
        System.out.println();
        // using Parameterized Constructor
        Book book1 = new Book("IAS", "drishti", 50000);
        book1.printData();
	}
}