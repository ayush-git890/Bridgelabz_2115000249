package RegexProblems;
import java.util.*;
import java.util.regex.*;
public class P4_ExtractAllMail {
    public static void main(String[] args) {
        String str = "Contact us at support@example.com and info@company.org";

        List<String> arr = extractEmails(str);
        for (String email : arr) {
            System.out.println(email);
        }
    }
    public static List<String> extractEmails(String str) {
        String s = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        Pattern pattern = Pattern.compile(s);
        Matcher match = pattern.matcher(str);

        List<String> arr = new ArrayList<>();
        while (match.find()) {
            arr.add(match.group());
        }
        return arr;
    }
}