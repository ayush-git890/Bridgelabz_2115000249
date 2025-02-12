import java.util.*;
class MovieNode {
    String title;
    String director;
    int yearOfRelease;
    double rating;
    MovieNode prev, next;
    public MovieNode(String title, String director, int yearOfRelease, double rating) {
        this.title = title;
        this.director = director;
        this.yearOfRelease = yearOfRelease;
        this.rating = rating;
        this.prev = this.next = null;
    }
}
class MovieManagementSystem {
    private MovieNode head, tail;
    public void addMovie(String title, String director, int yearOfRelease, double rating, boolean atEnd) {
        MovieNode nn = new MovieNode(title, director, yearOfRelease, rating);
        if (head == null) {
            head = tail = nn;
        } else if (atEnd) {
            tail.next = nn;
            nn.prev = tail;
            tail = nn;
        } else {
            nn.next = head;
            head.prev = nn;
            head = nn;
        }
    }
    public void removeMovie(String title) {
        MovieNode curr = head;
        while (curr != null && !curr.title.equalsIgnoreCase(title)) {
            curr = curr.next;
        }
        if (curr == null) {
            System.out.println("there is no movie here.............");
            return;
        }

        if (curr == head) head = head.next;
        if (curr == tail) tail = tail.prev;

        if (curr.prev != null) curr.prev.next = curr.next;
        if (curr.next != null) curr.next.prev = curr.prev;
		
        System.out.println("movei removed.........");
    }
    public MovieNode findMovie(String ss, boolean flag) {
        MovieNode curr = head;
        while (curr != null) {
            if (flag && curr.director.equalsIgnoreCase(ss)) {
                return curr;
            } else if (!flag) {
                try {
                    double ratingkey = Double.parseDouble(ss);
                    if (curr.rating == ratingkey) return curr;
                } catch (NumberFormatException e) {
                    System.out.println("wrong key................");
                    return null;
                }
            }
            curr = curr.next;
        }
        return null;
    }
    public void printMovies(boolean rev) {
        if (head == null) {
            System.out.println("there is no movie here.............");
            return;
        }
        MovieNode curr = rev ? tail : head;
        while (curr != null) {
            System.out.println(curr.title + " o " + curr.director + " o " + curr.yearOfRelease + " o ratings--> " + curr.rating);
            curr = rev ? curr.prev : curr.next;
        }
    } 
    public void updateRating(String title, double newRating) { // Update movie rating............
        MovieNode curr = head;
        while (curr != null) {
            if (curr.title.equalsIgnoreCase(title)) {
                curr.rating = newRating;
                System.out.println("updating ratings of -> " + title + " <- to this -> " + newRating);
                return;
            }
            curr = curr.next;
        }
    }
}
public class DoublyMovieSystem {
    public static void main(String args[]) {
        MovieManagementSystem ll = new MovieManagementSystem();
        ll.addMovie("The god of high school", "mohit sharma", 2025, 10, true);
        ll.addMovie("golden book", "rohit", 2024, 5, true);
        ll.printMovies(false);
        MovieNode foundMovie = ll.findMovie("rohit", true);
        if (foundMovie != null) {
            System.out.println("movie found :)");
        } else {
            System.out.println("not found movie (:");
        }     
        ll.updateRating("The god of high school", 9);
		System.out.println("trying to remove golden book....");
        ll.removeMovie("golden book");
    }
}
