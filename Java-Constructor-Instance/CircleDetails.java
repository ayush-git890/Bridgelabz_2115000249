import java.util.*;
class Circle {
    private double radius;
    public Circle() {
        this(5); // it calls the parameterized constructor just as shown in next line or below
    }
    // this is our parameterized Constructor
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() { //this is getter
        return radius;
    }
    public void setRadius(double radius) { //this is setter....
        this.radius = radius;
    }
    public double area() {
        return Math.PI * radius * radius;
    }

    // Method to display details
    public void printData() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area());
    }
}
public class CircleDetails{
	public static void main(String args[]){
		Circle circle = new Circle();
        circle.printData();
        System.out.println();
        Circle circle1 = new Circle(50);
        circle1.printData();
	}
}