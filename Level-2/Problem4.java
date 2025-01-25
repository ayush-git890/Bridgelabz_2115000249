import java.util.*;
public class Problem4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value ");
        int arr = sc.nextInt();
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int idx = 0;

        while (arr != 0) {
            digits[idx] = arr % 10;
            arr /= 10;
            idx++;

            if (idx == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }
                digits = temp;
            }
        }

        // finding the lar and second lar digit
        int lar = -1;
        int slar = -1;

        for (int i = 0; i < idx; i++) {
            if (digits[i] > lar) {
                slar = lar;
                lar = digits[i];
            } else if (digits[i] > slar && digits[i] != lar) {
                slar = digits[i];
            }
        }

        if (slar == -1) {
            System.out.println("no second largest element.");
        } else {
            System.out.println("largest digit: " + lar);
            System.out.println("Second largest digit: " + slar);
        }

        sc.close();
    }
}