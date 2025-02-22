package JUnitProblems;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class PasswordValidator {
    public static boolean ValidPassword(String pass) {
        return pass.length() >= 8 && pass.matches(".*[A-Z].*") && pass.matches(".*\\d.*");
    }
    public static void main(String[] args) {
        System.out.println(ValidPassword("AYUSH"));
        System.out.println(ValidPassword("ayush"));
        System.out.println(ValidPassword("Ayush1"));
    }
}
class PasswordValidatorTest {
    @Test
    void testValidPasswords() {
        assertTrue(PasswordValidator.ValidPassword("AYUSH"));
        assertTrue(PasswordValidator.ValidPassword("Ayush1"));
    }

    @Test
    void testInvalidPasswords() {
        assertFalse(PasswordValidator.ValidPassword("ayush"));
    }
}