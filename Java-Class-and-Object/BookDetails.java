class Book {
    private String title;
    private String author;
    private double price;
    // here I used of same class constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;    //this keyword is used to assign the value in the refrence of varible....
        this.price = price;
    }
    // this is our getter method.....
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    // this  is our setter method.....
    public void setData(String title,String author, double price){
		this.title = title;
		this.author = author;
		this.price = price;
	}

    // Method to display book details
    public void printDetail() {
        System.out.println("Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
}
public class BookDetails{
	public static void main(String args[]){
        Book book = new Book("About Ayush", "Ayush Agarwal", 5000);

        //displaying the details of book....
        book.printDetail();
	}
}