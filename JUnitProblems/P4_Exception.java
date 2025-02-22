package JUnitProblems;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class P4_Exception {
    public static int divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("divided by zero is not allowed....");
        return a / b;
    }
    public static void main(String[] args) {
        try {
            System.out.println(divide(20, 4));
            System.out.println(divide(10, 0));
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
class DivideExceptionTest {
    @Test
    void testDivide() {
        assertEquals(5, P4_Exception.divide(10, 2));
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> P4_Exception.divide(5, 0));
    }
}