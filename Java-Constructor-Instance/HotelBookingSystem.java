import java.util.*;
class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;
    public HotelBooking() {
        this("ayush", "peremium", 5);
    }
	//this is our parameterized method....
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    //this is copy constructor...
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    // Display details method
    public void printData() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }
}
public class HotelBookingSystem{
	public static void main(String args[]){
		HotelBooking hotel1 = new HotelBooking();
        hotel1.printData();
        System.out.println();
        HotelBooking hotel2 = new HotelBooking("Ayush Agarwl", "peremium", 10);
        hotel2.printData();
        System.out.println();
        HotelBooking hotel3 = new HotelBooking(hotel2);
        hotel3.printData();
	}
}