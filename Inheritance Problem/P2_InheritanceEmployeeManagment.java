import java.util.*;
class Employee {
    private String name;
    private int id;
    private double salary;
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public void displayDetails() {
        System.out.println("Emp. id--> " + id);
        System.out.println("name--> " + name);
        System.out.println("current salary--> " + salary);
    }
}
class Manager extends Employee {//subclass of manager.....
    private int teamSize;
    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("your team size is--> " + teamSize);
    }
}
class Developer extends Employee {// subclass of  developer....
    private String programmingLanguage;
    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("pragramming language you know is--> " + programmingLanguage);
    }
}
class Intern extends Employee {//subclass of intern.....
    public Intern(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
    }
}
public class  P2_InheritanceEmployeeManagment{
	public static void main(String args[]){
		Employee manager = new Manager("Kajal Mam", 111, 75000, 10);
        Employee developer = new Developer("Ayush Agarwal", 249, 100000, "Java");
        Employee intern = new Intern("mohit", 222, 20000);

        manager.displayDetails();
        System.out.println("=========================================");
        developer.displayDetails();
        System.out.println("=========================================");
        intern.displayDetails();
	}
}