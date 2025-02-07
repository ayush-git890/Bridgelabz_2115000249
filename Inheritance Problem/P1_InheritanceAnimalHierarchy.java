import java.util.*;
class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void makeSound() {
        System.out.println("the animal sound");
    }
    public void printAnimalDetail() {
        System.out.println(name + " age is "+age+" years");
    }
}
class Dog extends Animal { //this is subclass of Dog which inherits the property of Animal....
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("dog barks");
    }
}
class Cat extends Animal { //this is subclass of Cat which inherits the property of Animal....
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("cat meows");
    }
}
class Bird extends Animal { //this is subclass of Bird with inherites the same property...
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("bird chirps");
    }
}
public class P1_InheritanceAnimalHierarchy{
	public static void main(String args[]){
		Animal dog = new Dog("bull dog",10);
        Animal cat = new Cat("normal cat",5);
        Animal bird = new Bird("crow", 8);

        dog.printAnimalDetail();
        dog.makeSound();
        System.out.println("====================================");
        cat.printAnimalDetail();
        cat.makeSound();
        System.out.println("====================================");
        bird.printAnimalDetail();
        bird.makeSound();
	}
}