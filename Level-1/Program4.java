// Method to compute the number of rounds user needs to do to complete 5km run
import java.util.*;
public class Program4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("enter first side of triangle:- ");
        double a = sc.nextDouble();
		System.out.println("enter second side of triangle:- ");
        double b = sc.nextDouble();
		System.out.println("enter third side of triangle:- ");
        double c = sc.nextDouble();
		
		//formula to calculate no. ofrounds here.....
        double flag = 5000 / trianglePerimeter(a, b, c);
		
        System.out.println(flag);
		
		sc.close();
    }

    public static double trianglePerimeter(double a, double b, double c) {
        double temp = a + b + c;
        return temp;
    }
}