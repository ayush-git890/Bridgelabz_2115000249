import java.util.*;
public class Problem1 {
    public static void main(String[] args) {
        int[] fkag = new int[10];
        Scanner sc = new Scanner(System.in);

		//enter student age
        System.out.println("enter student age upto 10:-");
        for (int i = 0; i < fkag.length; i++) {
            System.out.print("Student " + (i + 1) + " age: ");
            fkag[i] = sc.nextInt();
        }
        for (int i = 0; i < fkag.length; i++) {
            if (fkag[i] < 0) {
                System.out.println("Invalid age: " + fkag[i]);
            } else if (fkag[i] >= 18) {
                System.out.println("The student with the age " + fkag[i] + " can vote");
            } else {
                System.out.println("The student with the age " + fkag[i] + " cannot vote");
            }
        }
        sc.close();
    }
}