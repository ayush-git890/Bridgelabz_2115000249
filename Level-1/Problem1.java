import java.util.*;
public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int number = sc.nextInt();

        boolean isDivisible = (number % 5 == 0);
        System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);

        sc.close();
    }
}