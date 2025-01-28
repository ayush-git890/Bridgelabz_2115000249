//a program to calculate various trigonometric functions using Math class given an angle in degrees
import java.util.*;
public class Program12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("enter angles--> ");
        double temp = sc.nextDouble();
        double flag = (temp * 3.14) / 180;
        double[] arr = calculateTrigonometricFunctions(flag);
        System.out.println("sine;-> "+arr[0]);
        System.out.println("cosine-> "+arr[1]);
        System.out.println("tangent-> "+arr[2]);
		
		sc.close();
    }

    public static double[] calculateTrigonometricFunctions(double angle) {
        double sine = Math.sin(angle);
        double cosine = Math.cos(angle);
        double tangent = Math.tan(angle);
        return new double[] { sine, cosine, tangent };
    }
}