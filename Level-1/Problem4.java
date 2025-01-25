import java.util.*;
public class Problem4 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double[] num = new double[10];
        double result = 0.0;
        int idx = 0;
        while (true) {
            System.out.print("Enter a number or enter 0 , -ve to stop");
            double temp = sc.nextDouble();
			//base condition.....
            if (temp <= 0 || idx >= 10) {
                break;
            }

            num[idx] = temp;
            idx++;
        }
        // the result
        for (int i = 0; i < idx; i++) {
            result += num[i];
        }
        System.out.println("your entered num:");
        for (int i = 0; i < idx; i++) {
            System.out.print(num[i]+" ");
        }
		
        System.out.println("final the sum: " + result);
        sc.close();
    }
}