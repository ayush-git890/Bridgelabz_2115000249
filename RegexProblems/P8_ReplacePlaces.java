package RegexProblems;
public class P8_ReplacePlaces {
    public static void main(String[] args) {
        String s1 = "This   is  an   example   with    multiple   spaces.";
        String s2 = replaceSpaces(s1);
        System.out.println(s2);
    }
    public static String replaceSpaces(String s1) {
        return s1.replaceAll("\\s+", " ");
    }
}