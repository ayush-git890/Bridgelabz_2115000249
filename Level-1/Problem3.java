import java.util.*;
public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int number = sc.nextInt();

        //here i initialize the size of the array
        int[] flag = new int[10];
        for (int i = 0; i < flag.length; i++) {
            flag[i] = number * (i + 1);
        }
        for (int i = 0; i < flag.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + flag[i]); //priting the answerr heree...
        }
        sc.close();
    }
}