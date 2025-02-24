package Reflections;
import java.lang.reflect.*;
interface Greeting {
    void sayHello();
}
class Greeting2 implements Greeting {
    public void sayHello() {
        System.out.println("Hi :)");
    }
}
class Handler implements InvocationHandler {
    private Object target;
    public Handler(Object target) {
        this.target = target;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("we calling--> " + method.getName());
        return method.invoke(target, args);
    }
}
public class P10_CustomLoggingProxy {
    public static void main(String[] args) {
        Greeting a = (Greeting) Proxy.newProxyInstance(Greeting.class.getClassLoader(),new Class[] { Greeting.class },new Handler(new Greeting2()));
        a.sayHello();
    }
}