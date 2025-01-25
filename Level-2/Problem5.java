import java.util.*;
public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value:--> ");
        int val = sc.nextInt();

        int count = 0;
        int flag1 = val;
        while (flag1 != 0) {
            count++;
            flag1 /= 10;
        }
        int[] arr = new int[count];
        int idx = 0;
        flag1 = val;
        while (flag1 != 0) {
            arr[idx] = flag1 % 10;
            flag1 /= 10;
            idx++;
        }

        int[] flag = new int[count];
        for (int i = 0; i < count; i++) {
            flag[i] = arr[count - 1 - i];
        }
        System.out.print("Reversed val: ");
        for (int i = 0; i < count; i++) {
            System.out.print(flag[i]);
        }

        sc.close();
    }
}