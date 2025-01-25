import java.util.*;
public class Problem2 {
    public static void main(String[] args) {
        int[] num = new int[5];
        Scanner sc = new Scanner(System.in);

        // Enter 5 num  here..........
        System.out.println("Enter 5 num:");
        for (int i = 0; i < num.length; i++) {
            System.out.print("number " + (i + 1) + ": ");
            num[i] = sc.nextInt();
        }

        // checking each number if it is +ve or -ve and odd or even
        for (int i = 0; i < num.length; i++) {
            if (num[i] > 0) {
                if (num[i] % 2 == 0) {
                    System.out.println(num[i] + " is positive + even");
                } else {
                    System.out.println(num[i] + " is positive + odd");
                }
            } else if (num[i] < 0) {
                System.out.println(num[i] + " is -ve");
            } else {
                System.out.println(num[i] + " is zero");
            }
        }

        // comparing the first and last numbers
        if (num[0] == num[4]) {
            System.out.println("both are equal");
        } else if (num[0] > num[4]) {
            System.out.println("first is greater");
        } else {
            System.out.println("last is greater");
        }

        sc.close();
    }
}