import java.util.*;
class Device { //this is our superclass
    String deviceId;
    String status;
    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }
    public void displayStatus() {
        System.out.println("id--> " + deviceId);
        System.out.println("status--> " + status);
    }
}
class Thermostat extends Device { //this is our subclass 
    double temperatureSetting;
    public Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status);//it referes to parent class that with extends...
        this.temperatureSetting = temperatureSetting;
    }

    @Override//this is our annotation for acknowledging override method....
    public void displayStatus() {
        super.displayStatus();
        System.out.println("temp. setting" + temperatureSetting + "°C");
    }
}
public class P5_SingleSmartHome{
	public static void main(String args[]){
		Thermostat thermostat = new Thermostat("123456", "active", 48);
        thermostat.displayStatus();
	}
}