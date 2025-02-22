package RegexProblems;
import java.util.*;
import java.util.regex.*;
public class P12_ExtractProgrammingLanguage {
    public static void main(String[] args) {
        String str = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        
        List<String> arr = programmingLanguage(str);
        System.out.println(String.join(", ", arr));
    }
    public static List<String> programmingLanguage(String str) {
        String s = "\\b(JavaScript|Java|Python|C\\+\\+|C#|Ruby|Go|Swift|Kotlin|PHP|TypeScript|Rust|Dart)\\b";
        
        Pattern pattern = Pattern.compile(s);
        Matcher match = pattern.matcher(str);
        
        List<String> arr = new ArrayList<>();
        while (match.find()) {
            arr.add(match.group());
        }
        return arr;
    }
}