package JUnitProblems;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;
public class P6_TestingParametrized {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
    public static void main(String[] args) {
        System.out.println(isEven(2));
        System.out.println(isEven(5));
    }
}
class ParametirizedTestingTest {
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6})
    void testIsEvenTrue(int num) {
        assertTrue(P6_TestingParametrized.isEven(num));
    }

    @ParameterizedTest
    @ValueSource(ints = {7, 9})
    void testIsEvenFalse(int num) {
        assertFalse(P6_TestingParametrized.isEven(num));
    }
}