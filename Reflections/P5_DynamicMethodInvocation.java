package Reflections;
import java.util.*;
import java.lang.reflect.*;
class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
}
public class P5_DynamicMethodInvocation {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("please enter any method name here like add, subtract, multiply--> ");
            String m = sc.nextLine();
            System.out.print("enter 1st number here--> ");
            int n1 = sc.nextInt();
            System.out.print("enter 2nd number here--> ");
            int n2 = sc.nextInt();

            Class<?> c = MathOperations.class;
            Object o = c.getDeclaredConstructor().newInstance();

            Method method = c.getMethod(m, int.class, int.class);

            int ans = (int)method.invoke(o, n1, n2);
            System.out.println("so the answer is after operation--> " + ans);
            sc.close();
        } catch (Exception e) {
            System.out.println("invalid metod.....");
            e.printStackTrace();
        }
    }
}