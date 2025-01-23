import java.util.*;
public class Problem9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int num = sc.nextInt();

        int answer = 1;

        // using loop to find greates factor
        for (int i = num - 1; i >= 1; i--) {
            if (num % i == 0) {
                answer = i;
                break;
            }
        }

        System.out.println("the answer is " + answer);

        sc.close();
    }
}