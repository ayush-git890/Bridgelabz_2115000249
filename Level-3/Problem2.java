import java.util.*;
public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // enter number here....
        System.out.println("Enter value--->");
        int number = sc.nextInt();
        int count = 0;

        //using while loop......
        while (number != 0) {
            number /= 10;
            count++;
        }

        System.out.println("The answer is:--> " + count);

        sc.close();
    }
}