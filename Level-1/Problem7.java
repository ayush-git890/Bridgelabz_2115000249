import java.util.*;
public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value: ");
        int number = sc.nextInt();
        //here we are checking whether it natural number or no.....
        if (number <= 0) {
            System.out.println("not a natural");
            sc.close();
            return;
        }

        int[] od = new int[number / 2 + 1];
        int[] ev = new int[number / 2 + 1];

        // Initialize index variables
        int oidx = 0, eidx = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                ev[eidx++] = i; //it is for a even
            } else {
                od[oidx++] = i; // it is for a odd
            }
        }
        //odd array
        System.out.println("Odd numbers: ");
        for (int i = 0; i < oidx; i++) {
            System.out.print(od[i] + " ");
        }
        //even array
        System.out.println("\nEven numbers: ");
        for (int i = 0; i < eidx; i++) {
            System.out.print(ev[i] + " ");
        }
        sc.close();
    }
}