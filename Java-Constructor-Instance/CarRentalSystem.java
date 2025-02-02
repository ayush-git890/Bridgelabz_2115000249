import java.util.*;
class CarRental{
    private String customerName;
    private String carModel;
    private int rentalDays;
    private static final double rate = 50000;

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // here i used private method to calculate total cost
    private double totalCost() {
        return rentalDays * rate;
    }

    public void printData() {
        System.out.println("the customer name--> " + customerName);
        System.out.println("model name is --> " + carModel);
        System.out.println("total rent days--> " + rentalDays);
        System.out.println("total amount--> " + totalCost());
    }
}
public class CarRentalSystem{
	public static void main(String args[]){
		CarRental rental = new CarRental("Ayush", "Mercedes", 2);
        rental.printData();
	}
}