import java.util.*;
public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take size 11
        double[] heightsOfSize = new double[11];
        double sum = 0.0;

        System.out.println("enter height:- ");
        for (int i = 0; i < heightsOfSize.length; i++) {
            System.out.print("heightsOfSize of player " + (i + 1) + ": ");
            heightsOfSize[i] = sc.nextDouble();
            sum += heightsOfSize[i];
        }

        //mean height
        double mean = sum / heightsOfSize.length;
        System.out.println("The mean height of team is: " + mean);
        sc.close();
    }
}