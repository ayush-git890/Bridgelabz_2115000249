import java.util.*;
public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //enter your age here...
        System.out.println("Enter the person's age:");
        int age = sc.nextInt();

        //checking the vote criteria...........
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote");
        }

        sc.close();
    }
}