package RegexProblems;

public class P3_HexColor {
    public static void main(String[] args) {
        String[] arr = {"#FFA500", "#ff4500", "#123"};

        for (String s : arr) {
            System.out.println(s + " --> " + (validateHexColor(s) ? "Valid" : "Invalid"));
        }
    }
    public static boolean validateHexColor(String s) {
        String str = "^#([A-Fa-f0-9]{6})$";
        return s.matches(str);
    }
}