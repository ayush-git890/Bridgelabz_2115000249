package RegexProblems;
import java.util.regex.*;
public class P15_ValidateSSN {
    public static void main(String[] args) {
        String str = "My SSN is 123-45-6789.";
        validateSSN(str);
    }
    public static void validateSSN(String str) {
        String s = "\\b\\d{3}-\\d{2}-\\d{4}\\b";
        Pattern pattern = Pattern.compile(s);
        Matcher match = pattern.matcher(str);

        boolean flag = false;
        while (match.find()) {
            String ssn = match.group();
            System.out.println(ssn + " is valid");
            flag = true;
        }

        if (!flag) {
            System.out.println("invalid");
        }
    }
}