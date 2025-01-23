import java.util.*;
public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value:");
        int num = sc.nextInt();

        System.out.println("Enter the power:");
        int p = sc.nextInt();

        int answer = 1;

        for (int i = 1; i <= p; i++) {
            answer *= num; // multiply the answer by the base number
        }

        // Displaying the answer
        System.out.println(num + " raised to the power of " + p + " is: " + answer);

        sc.close();
    }
}