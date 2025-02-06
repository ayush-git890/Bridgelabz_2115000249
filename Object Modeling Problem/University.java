import java.util.*;
class Department { // here we created Department class...
    private String departmentName;
    private List<Faculty> arr;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.arr = new ArrayList<>();
    }
    public void addFaculty(Faculty faculty) {
        arr.add(faculty);
    }
    public void printDepartmentDetails() {
        System.out.println("the dept. nam eis --> " + departmentName);
        System.out.print("thses are the faculty members--> ");
        for (Faculty f : arr) {
            System.out.print(f.getFacultyName() + " ");
        }
        System.out.println();
    }
}
class Faculty { // here we created Faculty class...
    private String facultyName;

    public Faculty(String facultyName) {
        this.facultyName = facultyName;
    }
    public String getFacultyName() {
        return facultyName;
    }
}
public class University { // here we created University class...
    private String universityName;
    private List<Department> arr1;

    public University(String universityName) {
        this.universityName = universityName;
        this.arr1 = new ArrayList<>();
    }
    public void addDepartment(String departmentName) {
        arr1.add(new Department(departmentName));
    }
    public void printUniversityDetails() {
        System.out.println("The university name is " + universityName);
        for (Department d : arr1) {
            d.printDepartmentDetails();
        }
        System.out.println();
    }
    public void deleteUniversity() {
        arr1.clear(); // deleting university also deletes all departments
        System.out.println("University " + universityName + " deleted. All departments removed.");
    }
	public static void main(String[] args) {
        University uni = new University("GLA University");
		Scanner sc = new Scanner(System.in);
		
        Faculty f1 = new Faculty("Pramod Sir");
        Faculty f2 = new Faculty("Kajal mam");
        uni.addDepartment("Computer Science");

        Department cs = new Department("Computer Science");
        cs.addFaculty(f1);
        cs.addFaculty(f2);
        uni.printUniversityDetails();
        cs.printDepartmentDetails();
		System.out.println("do you want to delete the university name with all details enter 'yes' or 'no' ");
		String option = sc.nextLine();
		if(option.equals("yes")){
			uni.deleteUniversity();
		}
        else{
			System.out.println("ok");
		}
    }
}