import java.util.*;
public class Problem2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("enter age of " + arr[i] + ": ");
            ages[i] = sc.nextInt();

            System.out.print("enter hieght of " + arr[i] + ": ");
            heights[i] = sc.nextDouble();
        }

        //young height
        int smallAge = ages[0];
        String youngPerson = arr[0];
        for (int i = 1; i < 3; i++) {
            if (ages[i] < smallAge) {
                smallAge = ages[i];
                youngPerson = arr[i];
            }
        }

        //taller friend
        double tallHeight = heights[0];
        String tf = arr[0];
        for (int i = 1; i < 3; i++) {
            if (heights[i] > tallHeight) {
                tallHeight = heights[i];
                tf = arr[i];
            }
        }

        System.out.println("youngest one is " + youngPerson + " of age " + smallAge + ".");
        System.out.println("tallest one is " + tf + " of height " + tallHeight + " m");

        sc.close();
    }
}