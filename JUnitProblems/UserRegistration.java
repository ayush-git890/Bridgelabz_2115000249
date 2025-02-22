package JUnitProblems;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class UserRegistration {
    public static void registerUser(String username, String email, String password) {
        if (username == null || username.isEmpty() || username.length() < 3) {
            throw new IllegalArgumentException("Invalid username");
        }
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new IllegalArgumentException("Invalid email");
        }
        if (password == null || password.length() < 8 || !password.matches(".*[A-Z].*") || !password.matches(".*\\d.*")) {
            throw new IllegalArgumentException("Password must be at least 8 characters long, contain one uppercase letter, and one digit");
        }
        System.out.println("User registered successfully");
    }
    public static void main(String[] args) {
        try {
            registerUser("Ayush", "agrwalayushkumar@gmail.com", "ayush@123");
            registerUser("abc", "abc@gmai.com", "Pass123");
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }
}
class UserRegistrationTest {
    @Test
    void testValidUserRegistration() {
        assertDoesNotThrow(() -> UserRegistration.registerUser("Ayush ", "agrwalayushkumar@gmail.com", "ayush@123"));
    }

    @Test
    void testInvalidUsername() {
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("", "abc@gmail.com", "Pass1"));
    }

    @Test
    void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("Ayush", "", "ayush@123"));
    }

    @Test
    void testInvalidPassword() {
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("abc", "abc@gmail.com", ""));
    }
}