import java.util.*;
interface Department {
    void assignDepartment(String departmentName);
    String getDepartmentDetails();
}
abstract class Employee {// Abstract class Employee with encapsulation
    private String employeeId;
    private String name;
    private double baseSalary;
	
    public Employee(String employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public abstract double calculateSalary();
    public void printData() {
        System.out.println("emp. id:--> " + getEmployeeId()+" name:--> " + getName()+" Base Salary:" + getBaseSalary()+" Total Salary:" + calculateSalary());
    }
    public String getEmployeeId() {
        return employeeId;
    }
    public String getName() {
        return name;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(double baseSalary) {
        if (baseSalary > 0) {
            this.baseSalary = baseSalary;
        } else {
            throw new IllegalArgumentException("salary can not be -ve here -----");
        }
    }
}
class FullTimeEmployee extends Employee implements Department {
    private String department;
    public FullTimeEmployee(String employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary();
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}
class PartTimeEmployee extends Employee implements Department {
    private int workHours;
    private String department;
    public PartTimeEmployee(String employeeId, String name,int workHours) {
        super(employeeId, name, 0); // base salary not used for part-time employees
        this.workHours = workHours;
    }

    @Override
    public double calculateSalary() {
        return workHours;
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}
public class EmployeeManagementSystem{
	public static void main(String args[]){
		List<Employee> arr = new ArrayList<>();
        FullTimeEmployee e1 = new FullTimeEmployee("1234", "Ayush Agarwal", 5000000);
        e1.assignDepartment("it");
        PartTimeEmployee e2 = new PartTimeEmployee("7894", "rohit", 20000);
        e2.assignDepartment("assistant support");
        arr.add(e1);
        arr.add(e2);
        for (Employee e : arr) {
            e.printData();
            if (e instanceof Department) {
                System.out.println(((Department) e).getDepartmentDetails());
            }
            System.out.println("===============by ayush agarwal =============================");
        }
	}
}