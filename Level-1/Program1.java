import java.util.*;
public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter principal: ");  // here i am taking principal input...
        double principal = sc.nextDouble();

        System.out.print("enter ROI: ");
        double rate = sc.nextDouble();

        System.out.print("enter time in year: ");
        double time = sc.nextDouble();
        // calculating SI
        double SI = calculateSI(principal, rate, time);

        System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f, and Time %.2f years.\n",
                SI, principal, rate, time);

        sc.close();
    }

    // method to calculate SI.........
    public static double calculateSI(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
}