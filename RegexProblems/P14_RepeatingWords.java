package RegexProblems;
import java.util.*;
import java.util.regex.*;
public class P14_RepeatingWords {
    public static void main(String[] args) {
        String str = "This is is a repeated repeated word test.";

        Set<String> hs = findRepeatingWords(str);
        System.out.println(String.join(", ", hs));
    }
    public static Set<String> findRepeatingWords(String str) {
        String s = "\\b(\\w+)\\b(?:.*\\b\\1\\b)";
        Pattern pattern = Pattern.compile(s, Pattern.CASE_INSENSITIVE);
        Matcher match = pattern.matcher(str);

        Set<String> hs = new HashSet<>();
        while (match.find()) {
            hs.add(match.group(1));
        }
        return hs;
    }
}