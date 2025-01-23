import java.util.*;

public class Problem18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // enter the number here...
        System.out.println("Enter the number to find its multiplication table from 6 to 9:");
        int number = sc.nextInt();

        // Using a for loop to find the multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        sc.close();
    }
}