import java.lang.Math;
class Circle {
    private double radius;
    // here I used of same class constructor
    public Circle(double radius) {
        this.radius = radius;   //this keyword is used to assign the value in the refrence of varible....
    }
    // this is our getter method.....
    public double getRadius() {
        return radius;
    }
    // this  is our setter method.....
    public void setRadius(double radius) {
        this.radius = radius;
    }
    // Method to calculate area of the circle
    public double evaluateArea() {
        return Math.PI * radius * radius;
    }
    // Method to calculate circumference of the circle
    public double evaluateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display area and circumference
    public void printDetail() {
        System.out.println("Circle Details:");
        System.out.println("Radius: " + getRadius());
        System.out.println("Area: " + evaluateArea());
        System.out.println("Circumference: " + evaluateCircumference());
    }
}
public class AreaOfCircle{
	public static void main(String args[]){
        Circle circle = new Circle(5);

        //displaying the details of area like area & Circumference....
        circle.printDetail();
	}
}