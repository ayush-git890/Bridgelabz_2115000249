class Vehicle {
    private String ownerName;
    private String vehicleType;
	
    private static double registrationFee = 10000;
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("owner--> " + ownerName);
        System.out.println("vehicle name--> " + vehicleType);
        System.out.println("the fees--> " + registrationFee);
    }
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}
public class VehicleRegistration{
	public static void main(String args[]){
		Vehicle v1 = new Vehicle("Ayush Agarwal", "Bike");
        Vehicle v2 = new Vehicle("Rohit sharma", "car");
        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();
        System.out.println();

        //here i am updating the feess...
        Vehicle.updateRegistrationFee(20000);
        System.out.println("after updation of fees.....");
        v1.displayVehicleDetails();
        System.out.println();

        v2.displayVehicleDetails();
	}
}