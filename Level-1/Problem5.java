import java.util.*;
public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a number between 6 and 9: ");
        int number = sc.nextInt();

        if (number < 6 || number > 9) {
            System.out.println("Please enter a number between 6 and 9");
            sc.close();
            return;
        }
        int[] multiplicationResult = new int[10];
        for (int i = 0; i < multiplicationResult.length; i++) {
            multiplicationResult[i] = number * (i + 1);
        }
        System.out.println("Multiplication table for " + number + ":");
        for (int i = 0; i < multiplicationResult.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + multiplicationResult[i]);
        }
        sc.close();
    }
}