import java.util.*;
public class PracticeProblem12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter height");

        double height = sc.nextDouble();
        System.out.println("enter base");
        double base = sc.nextDouble();

        //area of triangle will be
        double area = 0.5*base*height;

        double areaInch = area/6.452;

        System.out.println("The area of the triangle is "+area+" square cm and "+areaInch+" square inches");

        sc.close();
    }
}
