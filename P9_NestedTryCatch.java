import java.util.*;
public class P9_NestedTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("enter the leangth of an array---> ");
            int n = sc.nextInt();
            int[] arr = new int[n];

            System.out.println("enter values in an array--> ");
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            System.out.print("enter the index here--> ");
            int idx = sc.nextInt();
            try {
                int num = arr[idx];
                System.out.print("enter divisor here--> ");
                int div = sc.nextInt();

                try {
                    int ans = num / div;
                    System.out.println("Result: " + ans);
                } catch (ArithmeticException e) {
                    System.out.println("Cannot divide by zero!");
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index!");
            }

        } catch (InputMismatchException e) {
            System.out.println("only enter numeric number....");
        }
        sc.close();
    }
}