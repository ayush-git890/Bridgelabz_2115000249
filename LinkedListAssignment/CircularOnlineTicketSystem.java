class Ticket {
    int ticketID;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;
    Ticket next;
    public Ticket(int ticketID, String customerName, String movieName, String seatNumber, String bookingTime) {
        this.ticketID = ticketID;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}
class TicketReservationSystem {
    private Ticket head = null;
    private Ticket tail = null;
    private int count = 0;

    public void bookTicket(int ticketID, String customerName, String movieName, String seatNumber, String bookingTime) {
        Ticket nn = new Ticket(ticketID, customerName, movieName, seatNumber, bookingTime);
        if (head == null) {
            head = tail = nn;
            tail.next = head;
        } else {
            tail.next = nn;
            tail = nn;
            tail.next = head;
        }
        count++;
        System.out.println("ticket booked...............");
    }
    public void cancelTicket(int ticketID) {
        if (head == null) {
            System.out.println("No tickets!!!.");
            return;
        }
        Ticket curr = head;
        Ticket prev = tail;
        boolean flag = false;
        while (curr != null && curr.next != head) {
            if (curr.ticketID == ticketID) {
                flag = true;
                if (curr == head) {
                    head = head.next;
                    tail.next = head;
                } else if (curr == tail) {
                    tail = prev;
                    tail.next = head;
                } else {
                    prev.next = curr.next;
                }
                count--;
                System.out.println("tickect cancelled......");
                return;
            }
            prev = curr;
            curr = curr.next;
        }
        if (curr.ticketID == ticketID) {
            flag = true;
            prev.next = head;
            tail = prev;
            count--;
            System.out.println("tickect cancelled......");
        }
        if (!flag) {
            System.out.println("not found");
        }
    }
    public void printTickects() {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }
        Ticket curr = head;
        System.out.println("Booked Tickets:");
        while (curr.next != head) {
            System.out.println("Ticket ID: " + curr.ticketID + ", Customer: " + curr.customerName + ", Movie: "+ curr.movieName + ", Seat: " + curr.seatNumber + ", Time: " + curr.bookingTime);
            curr = curr.next;
        }
        System.out.println("Ticket ID: " + curr.ticketID + ", Customer: " + curr.customerName + ", Movie: "+ curr.movieName + ", Seat: " + curr.seatNumber + ", Time: " + curr.bookingTime);
    }
    public void searchByCustomerOrMovie(String searchKey) {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }
        Ticket curr = head;
        boolean flag = false;
        while (curr.next != head) {
            if (curr.customerName.equalsIgnoreCase(searchKey) || curr.movieName.equalsIgnoreCase(searchKey)) {
                System.out.println("Ticket ID: " + curr.ticketID + ", Customer: " + curr.customerName + ", Movie: " + curr.movieName + ", Seat: " + curr.seatNumber + ", Time: "+ curr.bookingTime);
                flag = true;
            }
            curr = curr.next;
        }
        if (curr.customerName.equalsIgnoreCase(searchKey) || curr.movieName.equalsIgnoreCase(searchKey)) {
            System.out.println("Ticket ID: " + curr.ticketID + ", Customer: " + curr.customerName+ ", Movie: " + curr.movieName + ", Seat: " + curr.seatNumber + ", Time: "+ curr.bookingTime);
            flag = true;
        }

        if (!flag) {
            System.out.println("No matching ticket found.");
        }
    }
    public void totalTickets() {
        System.out.println("Total booked tickets: " + count);
    }
}
public class CircularOnlineTicketSystem {
    public static void main(String[] args) {
        TicketReservationSystem ll = new TicketReservationSystem();
        ll.bookTicket(1, "Ayush", "taj mahal", "A", "10:00 AM");
        ll.bookTicket(2, "rohit", "red fort", "B", "1:00 PM");
        ll.bookTicket(3, "mohit", "delhi gate", "C", "3:00 PM");
		System.out.println("here i am displaying the details...........");
        ll.printTickects();
		System.out.println("here i am cancelling ticket of 2");
        ll.cancelTicket(2);
		System.out.println("here i am searching the customer of taj mahal");
        ll.searchByCustomerOrMovie("taj mahal");
		System.out.println("totl ticket.............");
        ll.totalTickets();
    }
}