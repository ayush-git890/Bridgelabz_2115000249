import java.util.*;
public class Problem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num to find its factors:");
        int num = sc.nextInt();

        //print factors of the num using loop
        System.out.println("The factors are:- ");
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}