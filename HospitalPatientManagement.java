import java.util.*;
interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}
abstract class Patient {
    private int patientId;
    private String name;
    private int age;
    private List<String> medicalHistory; // encapsulated medical records
    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.medicalHistory = new ArrayList<>();
    }
    public abstract double calculateBill();// abstract method for calculating the bill
    public void getPatientDetails() {
        System.out.println("pat. id--> : " + patientId+" name-->  " + name+" age--> " + age);
    }
    protected void addMedicalHistory(String record) {
        medicalHistory.add(record);
    }
    protected void viewMedicalHistory() {
        System.out.println("medical hierarchy--> " + name + ":");
        for (String record : medicalHistory) {
            System.out.println("-> " + record);
        }
    }
}
class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double dailyCharge;
    public InPatient(int patientId, String name, int age, int daysAdmitted, double dailyCharge) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }
    @Override
    public double calculateBill() {
        return daysAdmitted * dailyCharge;
    }
    @Override
    public void addRecord(String record) {
        addMedicalHistory(record);
    }
    @Override
    public void viewRecords() {
        viewMedicalHistory();
    }
}
class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    public OutPatient(int patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }
    @Override
    public double calculateBill() {
        return consultationFee;
    }
    @Override
    public void addRecord(String record) {
        addMedicalHistory(record);
    }
    @Override
    public void viewRecords() {
        viewMedicalHistory();
    }
}
public class HospitalPatientManagement{
	public static void main(String args[]){
		List<Patient> arr = new ArrayList<>();
        InPatient a1 = new InPatient(1, "rohan", 40, 5, 2000);
        OutPatient b1 = new OutPatient(2, "mohan", 30, 500);
        InPatient a2 = new InPatient(3, "sohan", 20, 3, 2500);
        OutPatient b2 = new OutPatient(4, "gohan", 10, 700);
        arr.add(a1);
        arr.add(b1);
        arr.add(a2);
        arr.add(b2);
        
        System.out.println("Hospital Patient Details and Billing:");// Displaying patient details and bills
        for (Patient patient : arr) {
            patient.getPatientDetails();
            System.out.println("Total Bill-> " + patient.calculateBill());
            System.out.println("=============================by ayush agarwal===========================");
        }
        System.out.println("\nViewing Medical Records:"); // Viewing medical records
        for (Patient patient : arr) {
            if (patient instanceof MedicalRecord) {
                ((MedicalRecord) patient).viewRecords();
                System.out.println("====================by ayush agarwal==================================");
            }
        }
	}
}