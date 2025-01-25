import java.util.*;
public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value--> ");
        int num = sc.nextInt();

        // Check if the num is a positive integer
        if (num <= 0) {
            System.out.println("not a +ve");
            sc.close();
            return;
        }

        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                // If i is a factor of the num, store it in the array
                if (index == maxFactor) {
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp;
                }
                factors[index++] = i;
            }
        }

        //here we have our answs
        System.out.println("Factors of " + num + " are:");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        sc.close();
    }
}