//check whether a number is positive or negative
import java.util.*;
public class Program9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            boolean num = check(arr[i]);
            boolean num2 = eo(arr[i]);
            if (num) {
                System.out.print(arr[i] + " is positive");
                if (num2) {
                    System.out.println(" and is even");
                } else {
                    System.out.println(" and is odd");
                }
            } else {
                System.out.println(arr[i] + " is negative");
            }
        }
        int res = temp(arr);
        if (res == 1) {
            System.out.println("First is greater than last element");
        } else if (res == -1) {
            System.out.println("First is smaller than last element");
        } else {
            System.out.println("First is equal to last element");
        }
    }

    public static boolean check(int num) {
        if (num >= 0) {
            return true;
        }
        return false;
    }

    public static boolean eo(int num) {
        boolean num2 = check(num);
        if (num2) {
            if (num % 2 == 0) {
                return true;
            }
        }
        return false;
    }

    public static int temp(int a[]) {
        if (a[0] > a[a.length - 1]) {
            return 1;
        } else if (a[0] < a[a.length - 1]) {
            return -1;
        }
        return 0;
    }
}