import java.util.*;
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}
abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;
	
    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }
    public abstract double calculateRentalCost(int days);
    public void printData(int days) {
        System.out.println("veh. number--> " + getVehicleNumber()+" veh. type--> " + getType()+" daily rent rate--> " + getRentalRate()+" total rent rate for " + days + " days: " + calculateRentalCost(days));
        if (this instanceof Insurable) {
            System.out.println(((Insurable) this).getInsuranceDetails());
        }
        System.out.println("==========================================");
    }
    public String getVehicleNumber() {
        return vehicleNumber;
    }
    public String getType() {
        return type;
    }
    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        if (rentalRate > 0) {
            this.rentalRate = rentalRate;
        } else {
            throw new IllegalArgumentException("rental rte can nit be -ve here--> ");
        }
    }
}
class Car extends Vehicle implements Insurable {
    private static final double insuranceRate = 0.10; // 10% of rental cost
    public Car(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Car", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return calculateRentalCost(1) * insuranceRate;
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance Cost: $" + calculateInsurance();
    }
}
class Bike extends Vehicle {
    public Bike(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Bike", rentalRate);
    }
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }
}
class Truck extends Vehicle implements Insurable {
    private static final double insuranceRate = 0.10; // 10% of rental cost
    public Truck(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Truck", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return calculateRentalCost(1) * insuranceRate;
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance Cost: $" + calculateInsurance();
    }
}
public class VehicleRentalSystem{
	public static void main(String args[]){
		List<Vehicle> arr = new ArrayList<>();
        arr.add(new Car("1234", 50));
        arr.add(new Bike("4561", 20));
        arr.add(new Truck("7894", 100));
        int rentalDays = 30;

        for (Vehicle vehicle : arr) {
            vehicle.printData(rentalDays);
        }
	}
}