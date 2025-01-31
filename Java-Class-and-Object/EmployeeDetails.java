class Employee {
    private String name;
    private int id;
    private double salary;
    // here I used of same class constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;    //this keyword is used to assign the value in the refrence of varible....
        this.salary = salary;
    }
    // this is our getter method.....
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public double getSalary() {
        return salary;
    }
    // this  is our setter method.....
    public void setData(String name, int id, double salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

    // Method to display employee details
    public void printDetail() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getId());
        System.out.println("Salary: $" + getSalary());
    }
}
public class EmployeeDetails{
	public static void main(String args[]){
        Employee em = new Employee("Ayush Agarwal", 249, 50000);

        //diplaying the data.....
        em.printDetail();
	}
}