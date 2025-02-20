import java.util.*;
class Patient implements Comparable<Patient> {
    private String name;
    private int severity;

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Patient other) {
        return Integer.compare(other.severity, this.severity);
    }

    @Override
    public String toString() {
        return name + " (Severity: " + severity + ")";
    }
}
public class P3_HospitalTriageSystem{
	public static void main(String args[]){
		PriorityQueue<Patient> q = new PriorityQueue<>();
        q.add(new Patient("rohit", 2));
        q.add(new Patient("mohit", 3));
        q.add(new Patient("shoit", 5));

        System.out.println("Treatment Order:");
        while (!q.isEmpty()) {
            System.out.println(q.poll());
        }
	}
}