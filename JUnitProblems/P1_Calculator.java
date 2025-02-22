package JUnitProblems;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class P1_Calculator {
    public int add(int a, int b) { return a + b; }
    public int subtract(int a, int b) { return a - b; }
    public int multiply(int a, int b) { return a * b; }
    public int divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("divided by zero not allowed...");
        return a / b;
    }
    public static void main(String[] args) {
        P1_Calculator c = new P1_Calculator();
        System.out.println(c.add(5, 3));
        System.out.println(c.subtract(10, 4));
        System.out.println(c.multiply(6, 2));
        System.out.println(c.divide(9, 3));
    }
}
class CalculatorTest {
    P1_Calculator c = new P1_Calculator();

    @Test
    void testAdd() { assertEquals(5, c.add(2, 3)); }

    @Test
    void testSubtract() { assertEquals(1, c.subtract(4, 3)); }

    @Test
    void testMultiply() { assertEquals(6, c.multiply(2, 3)); }

    @Test
    void testDivide() { assertEquals(2, c.divide(6, 3)); }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> c.divide(5, 0));
    }
}