import java.util.*;
class Person {
    private String name;
    private int age;
    // his is our parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //here we copied the parent contructor...
    public Person(Person obj) {
        this.name = obj.name;
        this.age = obj.age;
    }

    // Method to display person details
    public void printData() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
public class PersonCopyConstructor{
	public static void main(String args[]){
		Person person = new Person("ayush", 23);
        System.out.println("this is our original person data--> ");
        person.printData();
        System.out.println("this is our copied person data--> ");
        Person person1 = new Person(person);
        person1.printData();
	}
}