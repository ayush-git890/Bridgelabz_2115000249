import java.util.*;
class Vehicle {
    private static double registrationFee = 10000;//it will be shared with allvehicle......
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
    public void printData() {
        if (this instanceof Vehicle) {
            System.out.println("your reg. number--> " + registrationNumber);
            System.out.println("vehicle owner name--> " + ownerName);
            System.out.println("type of vehicle--> " + vehicleType);
            System.out.println("reg. fees--> " + registrationFee);
        }
    }
    public static void updateRegistrationFee(double newFee) {//to update registration fees....
        registrationFee = newFee;
        System.out.println("here is your updated registration fess---> " + registrationFee);
    }
}
public class VehicleRegistrationSystem{
	public static void main(String args[]){
		Vehicle v1 = new Vehicle("UP80123", "Ayush Agarwal", "car");
        Vehicle v2 = new Vehicle("UP80122", "Rohit kumar", "car");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the registration that you want to update---> ");
		double flag = sc.nextDouble();
        v1.printData();
		
        v2.printData();

        Vehicle.updateRegistrationFee(flag);
		System.out.println("============================================");
        //after update....................
        v1.printData();
		
        v2.printData();
	}
}