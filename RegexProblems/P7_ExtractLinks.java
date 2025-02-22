package RegexProblems;
import java.util.*;
import java.util.regex.*;
public class P7_ExtractLinks {
    public static void main(String[] args) {
        String str = "Visit https://www.google.com and http://example.org for more info.";

        List<String> arr = extractLink(str);
        System.out.println(arr);
    }
    public static List<String> extractLink(String str) {
        String s = "\\bhttps?://[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}(\\S*)?";
        Pattern pattern = Pattern.compile(s);
        Matcher match = pattern.matcher(str);

        List<String> arr = new ArrayList<>();
        while (match.find()) {
            arr.add(match.group());
        }
        return arr;
    }
}