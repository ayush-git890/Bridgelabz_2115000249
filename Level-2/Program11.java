//a program quad to find the roots of the equation ax2+ bx + c
import java.util.*;
import java.lang.Math;
public class Program11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int arr[] = quad(a, b, c);
        if (arr.length == 2) {
            System.out.println("Two roots: " + arr[0] + " and " + arr[1]);
        } else if (arr.length == 1) {
            System.out.println("One root: " + arr[0]);
        }
    }

    public static int[] quad(int a, int b, int c) {
        int flag = (b * b) - (4 * a * c);
        if (flag == 0) {
            int x = (-b) / (2 * a);
            return new int[] { x };
        }
        if (flag < 0) {
            return new int[] { -1 };
        }
        int x1 = 0, x2 = 0;
        if (flag > 0) {
            x1 = (-b + (int) Math.sqrt(flag)) / (2 * a);
            x2 = (-b - (int) Math.sqrt(flag)) / (2 * a);
        }
        return new int[] { x1, x2 };
    }
}