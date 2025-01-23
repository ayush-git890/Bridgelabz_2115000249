import java.util.*;
public class Problem3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // you please a number here......
        System.out.println("enter number");
        int num = sc.nextInt();
        int sum = 0;
        int flag = num;

        while (num != 0) {
            sum += num % 10; 
            num /= 10;
        }

        // Check if the number is divisible by the sum of its digits
        if (flag % sum == 0) {
            System.out.println(flag + " hurray it is Harshad number.");
        } else {
            System.out.println(flag + " not a Harshad number.");
        }

        sc.close();
    }
}