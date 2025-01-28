//program to find the young friends among 3 Amar, Akbar and Anthony
import java.util.*;
public class Program8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age[] = new int[3];
        double height[] = new double[3];
		
		System.out.println("enter a age:-> ");
        for (int i = 0; i < 3; i++) {
            age[i] = sc.nextInt();
        }
		System.out.println("enter a height-> ");
        for (int i = 0; i < 3; i++) {
            height[i] = sc.nextDouble();
        }
		
        System.out.println("the young age is -> "+young(age));
        System.out.println("the older age is -> "+tall(height));
		
		sc.close();
    }

    public static int young(int age[]) {
        int min = age[0];
        for (int i = 1; i < age.length; i++) {
            if (age[i] <= min) {
                min = age[i];
            }
        }
        return min;
    }

    public static double tall(double height[]) {
        double max = height[0];
        for (int i = 1; i < height.length; i++) {
            if (height[i] > max) {
                max = height[i];
            }
        }
        return max;
    }
}