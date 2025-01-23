import java.util.*;
public class Problem16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a value:");
        int num = sc.nextInt();

        if (num > 0) {
            // iterate from 1 to the number
            for (int i = 1; i <= num; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is an even.");
                } else {
                    System.out.println(i + " is an odd.");
                }
            }
        } else {
            System.out.println("The value " + num + " not a natural number.");
        }

        sc.close();
    }
}