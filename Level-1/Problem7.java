import java.util.*;

public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // enter any month
        System.out.println("Enter the month like 1-12:");
        int m = sc.nextInt();

        // enter any day
        System.out.println("Enter the day like 1-31:");
        int d = sc.nextInt();

        boolean flag = false;

        if ((m == 3 && d >= 20 && d <= 31) || (m == 4 && d >= 1 && d <= 30) || (m == 5 && d >= 1 && d <= 31) ||
                (m == 6 && d >= 1 && d <= 20)) {
            flag = true;
        }

        if (flag) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }

        sc.close();
    }
}