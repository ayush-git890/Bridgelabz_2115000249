import java.util.*;
import java.io.*;
class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private String department;
    private double salary;
    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', department='" + department + "', salary=" + salary + "}";
    }
}
public class P4_Serialization {
    private static final String FILE = "employees.dat";

    public static void serializeEmployees(List<Employee> employees) {
        try (ObjectOutputStream objectOutput = new ObjectOutputStream(new FileOutputStream(FILE))) {
            objectOutput.writeObject(employees);
            System.out.println("Employees serialized.....");
        } catch (IOException e) {
            System.out.println("there is an error...." + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public static List<Employee> deserialEmpl() {
        try (ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream(FILE))) {
            Object obj = objectInput.readObject();
            if (obj instanceof List<?>) {
                return (List<Employee>) obj;
            } else {
                System.out.println("invalid....");
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("thiere is an error...." + e.getMessage());
        }
        return new ArrayList<>();
    }
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(1, "rohit", "it", 50000));
        emp.add(new Employee(2, "sohit", "hr", 60));
        emp.add(new Employee(3, "mohit", "sales", 70));
        
        serializeEmployees(emp);
        
        List<Employee> list = deserialEmpl();
        System.out.println("Deserialized Employees:");
        list.forEach(System.out::println);
    }
}