package RegexProblems;
import java.util.*;
import java.util.regex.*;
public class P6_ExtractDates {
    public static void main(String[] args) {
        String str = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";

        List<String> arr = extractDates(str);
        System.out.println(arr);
    }
    public static List<String> extractDates(String str) {
        String s = "\\b(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(\\d{4})\\b";
        Pattern pattern = Pattern.compile(s);
        Matcher match = pattern.matcher(str);

        List<String> arr = new ArrayList<>();
        while (match.find()) {
            arr.add(match.group());
        }
        return arr;
    }
}