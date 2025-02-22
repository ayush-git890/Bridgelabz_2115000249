package RegexProblems;
import java.util.regex.*;
public class P10_ValidateIPAddress {
    public static void main(String[] args) {
        String[] arr = {"192.168.1.1","255.255.255.255","192.168.1",};

        for (String s : arr) {
            System.out.println(s + " is--> " + (validateIP(s) ? "Valid" : "Invalid"));
        }
    }
    public static boolean validateIP(String s) {
        String str = "^((25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9][0-9]?|0)\\.){3}" + "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9][0-9]?|0)$";
        
        Pattern pattern = Pattern.compile(str);
        Matcher match = pattern.matcher(s);
        return match.matches();
    }
}