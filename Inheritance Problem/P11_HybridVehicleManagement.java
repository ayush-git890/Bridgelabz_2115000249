import java.util.*;
class Vehicle {
    String model;
    int maxSpeed;
    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
    public void displayInfo() {
        System.out.println(model+" speed: " + maxSpeed + " km/h");
    }
}
interface Refuelable {// Interface Refuelable
    void refuel();
}
class ElectricVehicle extends Vehicle {// ElectricVehicle extends Vehicle
    int batteryCapacity;
    public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }
    public void charge() {
        System.out.println(model + " is charging with a battery capacity of " + batteryCapacity + " kw");
    }
}
class PetrolVehicle extends Vehicle implements Refuelable {
    int fuelTankCapacity;
    public PetrolVehicle(String model, int maxSpeed, int fuelTankCapacity) {
        super(model, maxSpeed);
        this.fuelTankCapacity = fuelTankCapacity;
    }

    @Override
    public void refuel() {
        System.out.println(model + " is refueling with " + fuelTankCapacity + " litre");
    }
}
public class P11_HybridVehicleManagement{
	public static void main(String args[]){
		ElectricVehicle e = new ElectricVehicle("maruti suzuki", 100, 75);
        PetrolVehicle p = new PetrolVehicle("merceded", 250, 1000);
        e.displayInfo();
        e.charge();
        System.out.println("=======================================");
        p.displayInfo();
        p.refuel();
	}
}