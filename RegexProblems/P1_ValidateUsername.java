package RegexProblems;
public class P1_ValidateUsername {
    public static void main(String[] args) {
        String[] arr = {"user_123", "123user", "us"};
        
        for (String username : arr) {
            System.out.println(username + " --> " + (validateUsername(username) ? "Valid" : "Invalid"));
        }
    }
    public static boolean validateUsername(String username) {
        String str = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";// it is our regex pattern....
        return username.matches(str);
    }
}