import java.util.*;
class Patient {
    private static String hospitalName = "Agra Hospital";
    private static int count = 0;//it will count the total patients.....
    private final int patientID;
    private String name;
    private int age;
    private String ailment;

    public Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        count++;
    }
    public void printData() {
        if (this instanceof Patient) {
            System.out.println("patient ID--> " + patientID);
            System.out.println("name--> " + name);
            System.out.println("age of patient---> " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("hospital--> " + hospitalName);
        }
    }
    public static void getTotalPatients() {//to peint the total patients.....
        System.out.println("total patientwe have in our hospital is-> " + count);
    }
}
public class HospitalManagementSystem{
	public static void main(String args[]){
		Patient p1 = new Patient(111, "Rohit kumar", 20, "COVID");
        Patient p2 = new Patient(192, "Mohit", 15, "fever");
        p1.printData();
		System.out.println("====================================");
        p2.printData();

        Patient.getTotalPatients();
	}
}