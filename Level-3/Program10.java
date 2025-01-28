import java.util.*;
public class Program10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();
        System.out.print("Enter x3: ");
        double x3 = sc.nextDouble();
        System.out.print("Enter y3: ");
        double y3 = sc.nextDouble();
        if (cs(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Points are collinear using slope formula.");
        } else {
            System.out.println("Points are not collinear using slope formula.");
        }
        if (ca(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Points are collinear using area formula.");
        } else {
            System.out.println("Points are not collinear using area formula.");
        }
    }
    public static boolean cs(double x1, double y1, double x2, double y2, double x3, double y3) {
        if (x1 == x2) {
            return x1 == x3; // Handle vertical lines
        } else {
            double slope1 = (y2 - y1) / (x2 - x1);
            double slope2 = (y3 - y2) / (x3 - x2);
            return slope1 == slope2;
        }
    }
    public static boolean ca(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return Math.abs(area) < 1e-9; // Account for potential floating-point errors
    }
}