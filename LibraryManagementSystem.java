import java.util.*;
interface Reservable {
    void reserveItem(String flag);
    boolean checkAvailability();
}
abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    private boolean isReserved;
    private String flag;//borrowwer
    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.isReserved = false;
        this.flag = null;
    }
    public abstract int getLoanDuration();// Abstract method for loan duration
    public void getItemDetails() {
        System.out.println("item id--> " + itemId+" title--> " + getTitle()+" author--> " + author+" loan dur--> " + getLoanDuration() + " day"+" availability: " + (isReserved ? "reserved by " + flag : "available"));
        System.out.println("===================================by ayush agarwal========================================");
    }
    public boolean isReserved() {
        return isReserved;
    }
    public void setReserved(boolean reserved, String flag) {
        this.isReserved = reserved;
        this.flag = flag;
    }
    public String getTitle() {
        return title;
    }
}
class Book extends LibraryItem implements Reservable {
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }
    @Override
    public int getLoanDuration() {
        return 50; // Books can be borrowed for 50 days
    }
    @Override
    public void reserveItem(String flag) {
        if (!isReserved()) {
            setReserved(true, flag);
            System.out.println(flag + " reserved the book-> " + getTitle());
        } else {
            System.out.println("book is reserved already :)");
        }
    }
    @Override
    public boolean checkAvailability() {
        return !isReserved();
    }
}
class Magazine extends LibraryItem {
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 15; // Magazines can be borrowed for 15 days
    }
}
class DVD extends LibraryItem implements Reservable {
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }
    @Override
    public int getLoanDuration() {
        return 10; // DVDs can be borrowed for 10 days
    }
    @Override
    public void reserveItem(String flag) {
        if (!isReserved()) {
            setReserved(true, flag);
            System.out.println(flag + " reserved the DVD-> " + getTitle());
        } else {
            System.out.println("dvd is reaservde already :)");
        }
    }
    @Override
    public boolean checkAvailability() {
        return !isReserved();
    }
}
public class LibraryManagementSystem{
	public static void main(String args[]){
		List<LibraryItem> arr = new ArrayList<>();
        arr.add(new Book("1234", "java", "ayush"));
        arr.add(new Magazine("4561", "dsa", "kumar"));
        arr.add(new DVD("7894", "gaon", "william"));
        for (LibraryItem item : arr) {
            item.getItemDetails();
        }
        if (arr.get(0) instanceof Reservable) {//to reverse a book.....
            ((Reservable) arr.get(0)).reserveItem("Ayush");
        }
        if (arr.get(2) instanceof Reservable) {//to reverse the dvd....
            ((Reservable) arr.get(2)).reserveItem("Rohit");
        }

        System.out.println("\nafter resevre");
        for (LibraryItem item : arr) {
            item.getItemDetails();
        }
	}
}