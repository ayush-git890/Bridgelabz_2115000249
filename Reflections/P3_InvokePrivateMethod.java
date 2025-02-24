package Reflections;
import java.lang.reflect.*;
class Calculator {
    private int multiply(int a, int b) {
        System.out.println("first num is-> "+a+" the second num is-> "+b);
        return a * b;
    }
}
public class P3_InvokePrivateMethod {
    public static void main(String[] args) throws Exception{
        Calculator calculate = new Calculator();
        Class<?> c = calculate.getClass();

        Method m = c.getDeclaredMethod("multiply", int.class, int.class);
        m.setAccessible(true);
        int ans = (int)m.invoke(calculate, 2, 2);

        System.out.println("after multiplication the answer is -> " + ans);
    }
}