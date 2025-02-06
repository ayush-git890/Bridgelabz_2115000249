import java.util.*;
class Doctor { // here we created Doctor class...
    private String doctorName;
    private List<Patient> arr;

    public Doctor(String doctorName) {
        this.doctorName = doctorName;
        this.arr = new ArrayList<>();
    }
    public void consult(Patient p) { // here we created consult method...
        arr.add(p);
        p.addDoctor(this);
        System.out.println("Dr. " + doctorName + " is consulting patient " + p.getPatientName());
    }
    public String getDoctorName() {
        return doctorName;
    }
}
class Patient { // here we created Patient class...
    private String patientName;
    private List<Doctor> arr1; // Association: Each patient can consult multiple doctors

    public Patient(String patientName) {
        this.patientName = patientName;
        this.arr1 = new ArrayList<>();
    }
    public void addDoctor(Doctor doctor) {
        arr1.add(doctor);
    }
    public String getPatientName() {
        return patientName;
    }
}
public class Hospital { // here we created Hospital class...
    private String hospitalName;
    private List<Doctor> arr1;
    private List<Patient> arr;

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.arr1 = new ArrayList<>();
        this.arr = new ArrayList<>();
    }
    public void addDoctor(Doctor doctor) {
        arr1.add(doctor);
    }
    public void addPatient(Patient patient) {
        arr.add(patient);
    }

    public void printHospitalDetails() {
        System.out.println("The hospital name is " + hospitalName);
        System.out.println("Doctors Available:");
        for (Doctor d : arr1) {
            System.out.println("- " + d.getDoctorName());
        }
        System.out.println("These are the registered patient in our hospitals--> ");
        for (Patient p : arr) {
            System.out.println("- " + p.getPatientName());
        }
        System.out.println();
    }
	public static void main(String[] args) {
        Hospital hospital = new Hospital("GLA Medical Center");

        Doctor d1 = new Doctor("Ayush Agarwal");
        Doctor d2 = new Doctor("Mukul Singh");

        Patient p1 = new Patient("Aditya Chauhan");
        Patient p2 = new Patient("Ajay Tyagi");

        hospital.addDoctor(d1);
        hospital.addDoctor(d2);
        hospital.addPatient(p1);
        hospital.addPatient(p2);

        hospital.printHospitalDetails();

        d1.consult(p1);
        d2.consult(p2);
    }
}