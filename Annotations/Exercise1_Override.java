package Annotations;
class Animal {
    public void makeSound() {
        System.out.println("making sound by animal....");
    }
}
class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("making sound by dogs.....");
    }
}
public class Exercise1_Override {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
    }
}