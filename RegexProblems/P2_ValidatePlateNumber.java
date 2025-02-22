package RegexProblems;
public class P2_ValidatePlateNumber {
    public static void main(String[] args) {
        String[] arr = {"AB1234", "A12345"};

        for (String plate : arr) {
            System.out.println(plate + " is " + (validatePlateNumber(plate) ? "Valid" : "Invalid"));
        }
    }
    public static boolean validatePlateNumber(String plate) {
        String str = "^[A-Z]{2}\\d{4}$";
        return plate.matches(str);
    }
}