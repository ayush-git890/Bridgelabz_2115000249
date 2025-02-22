package RegexProblems;
import java.util.*;
import java.util.regex.*;
public class P13_ExtractCurrencyValue {
    public static void main(String[] args) {
        String str = "The price is $45.99, and the discount is 10.50.";

        List<String> arr = currencyValues(str);
        System.out.println(String.join(", ", arr));
    }
    public static List<String> currencyValues(String str) {
        String s = "\\$?\\d+\\.\\d{2}";
        Pattern pattern = Pattern.compile(s);
        Matcher match = pattern.matcher(str);

        List<String> arr = new ArrayList<>();
        while (match.find()) {
            arr.add(match.group());
        }
        return arr;
    }
}