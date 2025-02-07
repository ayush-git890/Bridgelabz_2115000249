import java.util.*;
class Book {
    String title;
    int publicationYear;
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
    public void displayInfo() {
        System.out.println("title of book " + title+" publication year--> " + publicationYear);
    }
}
class Author extends Book {
    String name;
    String bio;
    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("author: " + name+" bio: " + bio);
        System.out.println();
    }
}
public class P4_SingleLibraryManagement{
	public static void main(String args[]){
		Author author = new Author("the taj mahal", 1955, "akhbar", "a popular king of agra");
 
        author.displayInfo();
	}
}