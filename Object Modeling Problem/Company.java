import java.util.*;
class Employee { // here we created Employee class...
    private String name;
    private String empID;
    public Employee(String name, String empID) {
        this.name = name;
        this.empID = empID;
    }
    public void printEmployeeDetails() {
        System.out.println("the name of employee is " + name + ", id--> " + empID);
    }
}
class Department { // here we created Department class...
    private String deptName;
    private List<Employee> arr1; // here we created an ArrayList of Employee objects inside Department...

    public Department(String deptName) {
        this.deptName = deptName;
        this.arr1 = new ArrayList<>();
    }
    public String getDeptName() {
        return deptName;
    }
    public void addEmployee(String name, String empID) {
        arr1.add(new Employee(name, empID));
    }
    public void printDepartmentDetails() {
        System.out.println("the dept. name is --> " + deptName);
        for (Employee e : arr1) {
            e.printEmployeeDetails();
        }
    }
}
public class Company { // here we created Company class...
    private String companyName;
    private List<Department> arr; // here we created an ArrayList of Department objects inside Company...

    public Company(String companyName) {
        this.companyName = companyName;
        this.arr = new ArrayList<>();
    }

    public void addDepartment(String deptName) {
        arr.add(new Department(deptName));
    }
    public void addEmployeeToDepartment(String deptName, String empName, String empID) {
        for (Department d : arr) {
            if (d.getDeptName().equals(deptName)) {
                d.addEmployee(empName, empID);
                return;
            }
        }
        System.out.println("Department " + deptName + " not found in " + companyName);
    }
    public void printCompanyDetails() {
        System.out.println("The company name is " + companyName);
        for (Department d : arr) {
            d.printDepartmentDetails();
        }
        System.out.println();
    }
	public static void main(String[] args) {
        Company c1 = new Company("Capgemini");
        Company c2 = new Company("Google");

        c1.addDepartment("Java Full Stack");
        c2.addDepartment(".Net Full Stack");

        c1.addEmployeeToDepartment("Java Full Stack", "Ayush", "249");
        c2.addEmployeeToDepartment(".Net Full Stack", "Mukul", "289");

        c1.printCompanyDetails();
        c2.printCompanyDetails();
    }
}