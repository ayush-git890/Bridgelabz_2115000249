package RegexProblems;
import java.util.regex.*;
public class P9_CensorBadWords {
    public static void main(String[] args) {
        String s = "This is a damn bad example with some stupid words.";
        String[] arr = {"damn", "stupid"};

        String ans = badWords(s, arr);
        System.out.println(ans);
    }
    public static String badWords(String s, String[] arr) {
        for (String word : arr) {
            String reg = "\\b" + Pattern.quote(word) + "\\b";
            s = s.replaceAll(reg, "****");
        }
        return s;
    }
}