package RegexProblems;
import java.util.*;
import java.util.regex.*;
public class P5_ExtractCapitalizedWords {
    public static void main(String[] args) {
        String str = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York";
        
        List<String> arr = extractWords(str);
        System.out.println(arr);
    }
    public static List<String> extractWords(String str) {
        String s = "\\b[A-Z][a-z]*\\b";
        Pattern pattern = Pattern.compile(s);
        Matcher match = pattern.matcher(str);

        List<String> arr = new ArrayList<>();
        while (match.find()) {
            arr.add(match.group());
        }
        return arr;
    }
}