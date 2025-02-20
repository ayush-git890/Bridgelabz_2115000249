import java.util.*;
class Employee {
    private String name;
    private String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return name;
    }
}
public class P5_GroupObjectProperty{
	public static Map<String, List<Employee>> groupEmployeesByDepartment(List<Employee> employees) {
        Map<String, List<Employee>> hm = new HashMap<>();

        for (Employee employee : employees) {
            hm.computeIfAbsent(employee.getDepartment(), k -> new ArrayList<>()).add(employee);
        }

        return hm;
    }
	public static void main(String args[]){
		List<Employee> employees = Arrays.asList(
            new Employee("ayush", "IT"),
            new Employee("rohit", "IT"),
            new Employee("mohit", "HR")
        );

        Map<String, List<Employee>> gd = groupEmployeesByDepartment(employees);

        gd.forEach((department, employeeList) -> {
            System.out.println(department + ": " + employeeList);
        });
	}
}