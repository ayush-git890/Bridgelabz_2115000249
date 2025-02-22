package RegexProblems;
import java.util.regex.*;
public class P11_ValidateCreditCard {
    public static void main(String[] args) {
        String[] arr = {"4111111111111111","5500000000000004","400000123456789",};

        for (String s : arr) {
            System.out.println(s + " is " + (validateCreditCard(s) ? "Valid" : "Invalid"));
        }
    }
    public static boolean validateCreditCard(String s) {
        String str = "^(4[0-9]{15}|5[1-5][0-9]{14})$";
        
        Pattern pattern = Pattern.compile(str);
        Matcher match = pattern.matcher(s);
        return match.matches();
    }
}