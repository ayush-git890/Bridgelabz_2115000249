//generat otp
import java.util.*;
public class Program7{
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = OTP();
        }
        if (uniqueOTP(arr)) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("Some OTPs are not unique.");
        }
    }
    public static int OTP() {
        Random num = new Random();
        return num.nextInt(900000) + 100000;
    }
    public static boolean uniqueOTP(int[] otps) {
        for (int i = 0; i < otps.length - 1; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}