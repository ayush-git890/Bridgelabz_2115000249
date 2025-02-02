import java.util.*;
class Employee {
    public int employeeID;
    protected String department;
    private double salary;
    public Employee() {
        this.employeeID = 0;
        this.department = "";
        this.salary = 0;
    }
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }
    // Public Method to Set Salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
    public void displayEmployee() {
        System.out.println("employee id--> " + employeeID);
        System.out.println("dept. name--> " + department);
        System.out.println("Base salary --> " + salary);
    }
}
class Manager extends Employee { //this is our subclass.....
    public String team;

    public Manager(int employeeID, String department, double salary, String team) {
        this.employeeID = employeeID;    
        this.department = department;
        this.setSalary(salary);
        this.team = team;
    }

    public void displayManager() {
        System.out.println("manager (ID: " + employeeID + ") of " + department + " " + team);
    }
}
public class EmployeeRecord{
	public static void main(String args[]){
		Employee e1 = new Employee(101, "SDE", 600000);
        e1.displayEmployee();
        Manager m1 = new Manager(201, "hr", 80000, "recruiter");
        m1.displayManager();
	}
}