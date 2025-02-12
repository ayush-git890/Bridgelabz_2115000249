import java.util.*;
class BookNode {
    String title, author, genre;
    int bookID;
    boolean isAvailable;
    BookNode next, prev;
    public BookNode(int bookID, String title, String author, String genre, boolean isAvailable) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isAvailable = isAvailable;
        this.next = this.prev = null;
    }
}
class LibraryManagement {
    private BookNode head, tail;
    private int count;
    public LibraryManagement() {
        head = tail = null;
        count = 0;
    }
    public void addBookAtBeginning(int bookID, String title, String author, String genre, boolean isAvailable) {
        BookNode nn = new BookNode(bookID, title, author, genre, isAvailable);
        if (head == null) {
            head = tail = nn;
        } else {
            nn.next = head;
            head.prev = nn;
            head = nn;
        }
        count++;
    }
    public void addBookAtEnd(int bookID, String title, String author, String genre, boolean isAvailable) {
        BookNode nn = new BookNode(bookID, title, author, genre, isAvailable);
        if (tail == null) {
            head = tail = nn;
        } else {
            tail.next = nn;
            nn.prev = tail;
            tail = nn;
        }
        count++;
    }
    public void deleteBook(int bookID) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.bookID == bookID) {
                if (temp == head) {
                    head = head.next;
                    if (head != null) head.prev = null;
                } else if (temp == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
                count--;
                return;
            }
            temp = temp.next;
        }
        System.out.println("not found book..............");
    }
    public void findBook(String q) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(q) || temp.author.equalsIgnoreCase(q)) {
                System.out.println("book founded.......");
                return;
            }
            temp = temp.next;
        }
        System.out.println("not found book..............");
    }
    public void updateAvailability(int bookID, boolean status) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.bookID == bookID) {
                temp.isAvailable = status;
                System.out.println("updated status............");
                return;
            }
            temp = temp.next;
        }
        System.out.println("not found book..............");
    }
    public void printForward() {
        BookNode temp = head;
        while (temp != null) {
            System.out.println(temp.bookID + ": " + temp.title + " by " + temp.author + temp.genre + " -> " + (temp.isAvailable ? "yes available" : "not available"));
            temp = temp.next;
        }
    }
    public void printBackward() {
        BookNode temp = tail;
        while (temp != null) {
            System.out.println(temp.bookID + ": " + temp.title + " by " + temp.author + temp.genre + " -> " + (temp.isAvailable ? "yes available" : "not available"));
            temp = temp.prev;
        }
    }
    public int totalBooks() {
        return count;
    }
}
public class DoublyLibrarySystem{
	public static void main(String[] args) {
        LibraryManagement ll = new LibraryManagement();
        ll.addBookAtEnd(1, "The Discovery of India", "Jawaharlal Nehru", "History", true);
		ll.addBookAtEnd(2, "Wings of Fire", "A.P.J. Abdul Kalam", "Autobiography", true);
		ll.addBookAtBeginning(3, "Godan", "Munshi Premchand", "Classic", false);
        System.out.println("forward print.........");
        ll.printForward();
        System.out.println("backward print.........");
        ll.printBackward();
        System.out.println("findind 1984............");
        ll.findBook("1984");
        System.out.println("updating book id 2");
        ll.updateAvailability(2, false);
        System.out.println("total books are---> " + ll.totalBooks());
    }
}