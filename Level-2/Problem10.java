import java.util.*;
public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number---> ");
        int num = sc.nextInt();
        String str = String.valueOf(num);
		
        int[] arr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = Character.getNumericValue(str.charAt(i));
        }

        int[] freq = new int[10];

        for (int i = 0; i < str.length(); i++) {
            freq[arr[i]]++;
        }
        System.out.println("\nfreq of each digit:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("digit " + i + "comes : " + freq[i] + " times");
            }
        }
        sc.close();
    }
}