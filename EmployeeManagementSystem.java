import java.util.*;
class Employee {
    private static String companyName = "Capgemini";
    private static int count = 0;//it will count total employee...
    private final int id;// it cannot be changed that's why we use final keyword here....
    private String name;
    private String designation;

    public Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        count++;
    }
    public void printData() {
        if (this instanceof Employee) {
            System.out.println("This is Company name--> " + companyName);
            System.out.println("Emp. ID--> " + id);
            System.out.println("Emp. Name--> " + name);
            System.out.println("Emp. Role--> " + designation);
            System.out.println();
        }
    }
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + count);
    }
}
public class EmployeeManagementSystem{
	public static void main(String args[]){
		Employee.displayTotalEmployees();
        Employee e1 = new Employee(249, "Ayush Agarwal", "Java Full Stack Developer");
        Employee e2 = new Employee(123, "Rohit Kumar", ".Net Full Stack Developer");
        e1.printData();
		System.out.println("=====================================");
        e2.printData();
        Employee.displayTotalEmployees();
	}
}