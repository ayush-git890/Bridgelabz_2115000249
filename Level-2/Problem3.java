import java.util.*;
public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value ");
        int number = sc.nextInt();
        int maxDigit = 10;
        int[] arr = new int[maxDigit];
        int idx = 0;
        while (number != 0 && idx < maxDigit) {
            arr[idx] = number % 10;
            number /= 10;
            idx++;
        }

        int lar = -1;
        int slar = -1;

        for (int i = 0; i < idx; i++) {
            if (arr[i] > lar) {
                slar = lar;
                lar = arr[i];
            } else if (arr[i] > slar && arr[i] != lar) {
                slar = arr[i];
            }
        }
        if (slar == -1) {
            System.out.println("no second largest element");
        } else {
            System.out.println("largest digit:---> " + lar);
            System.out.println("Second largest digit:---> " + slar);
        }

        sc.close();
    }
}