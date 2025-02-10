import java.util.*;
abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    private Vehicle next;
    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }
    public String getVehicleId() {
        return vehicleId;
    }
    public String getDriverName() {
        return driverName;
    }
    public double getRatePerKm() {
        return ratePerKm;
    }
    public abstract double calculateFare(double distance);
    public String getVehicleDetails() {
        return "veh. id-> " + getVehicleId() + ", driver-> " + getDriverName() + ", rate/km-> " + getRatePerKm();
    }
    public Vehicle getNext() {
        return next;
    }
    public void setNext(Vehicle next) {
        this.next = next;
    }
}
interface GPS {
    String getCurrentLocation();
    void updateLocation(String strNewLoc);
}
class Car extends Vehicle implements GPS {
    private String presentLoc;
    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.presentLoc = "void";
    }
    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }
    @Override
    public String getCurrentLocation() {
        return presentLoc;
    }
    @Override
    public void updateLocation(String strNewLoc) {
        this.presentLoc = strNewLoc;
    }
}
class Bike extends Vehicle implements GPS {
    private String presentLoc;
    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.presentLoc = "void";
    }
    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance * 10;
    }
    @Override
    public String getCurrentLocation() {
        return presentLoc;
    }
    @Override
    public void updateLocation(String strNewLoc) {
        this.presentLoc = strNewLoc;
    }
}
class Auto extends Vehicle implements GPS {
    private String presentLoc;
    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.presentLoc = "void";
    }
    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance * 2;
    }
    @Override
    public String getCurrentLocation() {
        return presentLoc;
    }
    @Override
    public void updateLocation(String strNewLoc) {
        this.presentLoc = strNewLoc;
    }
}
public class RideHailingApplication{
	public static void main(String args[]){
		Car c = new Car("1234", "AYush Agarwal", 15);
        Bike b = new Bike("4561", "rohit", 10);
        Auto a = new Auto("1247", "mohit", 12);
        c.setNext(b);
        b.setNext(a);
        double dis = 10;
        Vehicle flag = c;
        while (flag != null) {
            System.out.println(flag.getVehicleDetails());
            System.out.println("fare for " + dis + " km-> " + flag.calculateFare(dis));
            if (flag instanceof GPS) {
                GPS flag2 = (GPS) flag;
                flag2.updateLocation("gujarat");
                System.out.println("updated location here --> " + flag2.getCurrentLocation());
            }
            System.out.println("=======================================");
            flag = flag.getNext();
        }
	}
}