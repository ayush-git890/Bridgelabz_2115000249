import java.util.*;

public class Problem12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value:- ");
        int flag = sc.nextInt();

        System.out.println("The multiples are:- ");
        for (int i = 100; i >= 1; i--) {
            if (i % flag == 0) {
                System.out.print(i+" "); // Print the multiple
            }
        }

        sc.close();
    }
}