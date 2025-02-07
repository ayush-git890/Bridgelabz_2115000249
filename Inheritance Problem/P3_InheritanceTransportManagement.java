import java.util.*;
class Vehicle {
    private int maxSpeed;
    private String fuelType;
    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }
    public void displayInfo() {
        System.out.println("it has speed  of--> " + maxSpeed + " km/h");
        System.out.println("it has fuel type of--> " + fuelType);
    }
}
class Car extends Vehicle {
    private int seatCapacity;
    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("it has seat capacity of--> " + seatCapacity);
    }
}
class Truck extends Vehicle {
    private double capacity;

    public Truck(int maxSpeed, String fuelType, double capacity) {
        super(maxSpeed, fuelType);
        this.capacity = capacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("capacity--> " + capacity + " tons");
    }
}
class Motorcycle extends Vehicle {
    private boolean isHasSidecar;
    public Motorcycle(int maxSpeed, String fuelType, boolean isHasSidecar) {
        super(maxSpeed, fuelType);
        this.isHasSidecar = isHasSidecar;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("has Sidecar--> " + (isHasSidecar ? "Yes" : "No"));
    }
}
public class P3_InheritanceTransportManagement{
	public static void main(String args[]){
		Vehicle[] veh = {
            new Car(1234, "petrol", 60),
            new Truck(123456, "diesel", 100),
            new Motorcycle(1234, "petrol", true)
        };
        for (Vehicle v : veh) {
            v.displayInfo();
            System.out.println("=================================");
        }
	}
}