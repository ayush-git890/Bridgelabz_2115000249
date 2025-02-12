import java.util.*;
class StudentNode {
    int rollNumber;
    String name;
    int age;
    char grade;
    StudentNode next;
    public StudentNode(int rollNumber, String name, int age, char grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}
class StudentRecordManagement {
    private StudentNode head;
    public void addStart(int rollNumber, String name, int age, char grade) { // to add a student at the beginning
        StudentNode temp = new StudentNode(rollNumber, name, age, grade);
        temp.next = head;
        head = temp;
    }
    public void addLast(int rollNumber, String name, int age, char grade) { // to add a student at the end
        StudentNode nn = new StudentNode(rollNumber, name, age, grade);
        if (head == null) {
            head = nn;
            return;
        }
        StudentNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = nn;
    }
    public void deleteStudent(int rollNumber) { // to delete a student by Roll Number
        if (head == null) {
            System.out.println("empty list........");
            return;
        }
        if (head.rollNumber == rollNumber) {
            head = head.next;
            return;
        }
        StudentNode temp = head;
        while (temp.next != null && temp.next.rollNumber != rollNumber) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("not found...........");
            return;
        }
        temp.next = temp.next.next;
    }
    public void searchStudent(int rollNumber) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                System.out.println("student name found--> ");
                return;
            }
            temp = temp.next;
        }
        System.out.println("not found..........");
    }
    public void updateGrade(int rollNumber, char newGrade) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                temp.grade = newGrade;
                System.out.println("grade updated.... " + rollNumber);
                return;
            }
            temp = temp.next;
        }
        System.out.println("not found......");
    }
    public void printData() {
        if (head == null) {
            System.out.println("no records.......");
            return;
        }
        StudentNode temp = head;
        while (temp != null) {
            System.out.println("Roll: " + temp.rollNumber + ", Name: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
            temp = temp.next;
        }
    }
}
public class SinglyStudentManagement{
	public static void main(String args[]){
		StudentRecordManagement ll = new StudentRecordManagement();
        ll.addStart(1, "Ayush Agarwal", 10, 'A');
        ll.addLast(2, "rohit", 11, 'A');
        ll.addLast(3, "mohit", 12, 'A');
        System.out.println("==========================================================");
        ll.printData();
		System.out.println("Searching for Ayush");
        ll.searchStudent(1);
        ll.updateGrade(2, 'B');
        ll.deleteStudent(3);
	}
}