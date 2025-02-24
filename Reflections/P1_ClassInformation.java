package Reflections;
import java.util.*;
import java.lang.reflect.*;
public class P1_ClassInformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the class name here--> ");
        String str = sc.nextLine();
        classInformation(str);
        sc.close();
    }
    public static void classInformation(String str){
        try {
            Class<?> c = Class.forName(str);
            System.out.println("the class name is........ " + c.getName());//for getting the class name....
            System.out.println("these are the fields name in the class--> ");//for getting the field...
            Field[] arr = c.getDeclaredFields();
            for (Field f : arr) {
                System.out.println("  " + f);
            }

            System.out.println("these are the methods in class................");
            Method[] arr1 = c.getDeclaredMethods();
            for (Method m : arr1) {
                System.out.println("  " + m);
            }

            System.out.println("these are the constructor in the class................");
            Constructor<?>[] arr2 = c.getDeclaredConstructors();
            for (Constructor<?> cons : arr2) {
                System.out.println("  " + cons);
            }
        } catch (ClassNotFoundException e) {
            System.out.println("sry class not found here................." + e.getMessage());
        }
    }
}