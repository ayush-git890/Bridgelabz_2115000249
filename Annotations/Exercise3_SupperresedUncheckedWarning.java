package Annotations;
import java.util.*;
public class Exercise3_SupperresedUncheckedWarning {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        @SuppressWarnings("rawtypes")
        List arr = new ArrayList(); 
        arr.add("ayush");
        arr.add(1000000);

        System.out.println(arr);
    }
}