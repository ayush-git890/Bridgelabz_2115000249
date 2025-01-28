//program to divide N number of chocolates among M children. Print the number of chocolates each child will get and also the remaining chocolates
import java.util.*;
public class Program10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of chocolates: ");
        int numberOfChocolates = sc.nextInt();
        System.out.println("Enter the number of children: ");
        int numberOfChildren = sc.nextInt();

        int[] result = divideChocolates(numberOfChocolates, numberOfChildren);
        System.out.println("Each child gets: " + result[0] + " chocolates");
        System.out.println("Remaining chocolates: " + result[1]);

        sc.close();
    }

    // Method to calculate chocolates per child and remaining chocolates
    public static int[] divideChocolates(int totalChocolates, int totalChildren) {
        int chocolatesPerChild = totalChocolates / totalChildren;
        int remainingChocolates = totalChocolates % totalChildren;
        return new int[] { chocolatesPerChild, remainingChocolates };
    }
}