package JUnitProblems;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class StringUtils {
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    public static boolean isPalindrome(String str) {
        int l = 0, r = str.length() - 1;
        while (l < r) {
            if (Character.toLowerCase(str.charAt(l)) != Character.toLowerCase(str.charAt(r))) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static String isUpperCase(String str) {
        return str.toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(reverse("ayush"));
        System.out.println(isPalindrome("aba"));
        System.out.println(isUpperCase("rohit"));
    }
}
class TestClass{
    StringUtils stringUtil = new StringUtils();

    @Test
    void testReverse() {
        assertEquals("hsuya", stringUtil.reverse("ayush"));
    }

    @Test
    void testIsPalindrome() {
        assertTrue(stringUtil.isPalindrome("aba"));
    }

    @Test
    void testToUpperCase() {
        assertEquals("ROHIT", stringUtil.isUpperCase("rohit"));
    }
}