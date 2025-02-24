package Annotations;
import java.util.*;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CacheResult {}

class Cache {
    private Map<Integer, Integer> hm = new HashMap<>();

    @CacheResult
    int findSquare(int num) {
        if (hm.containsKey(num)) {
            System.out.print("the returning cached is--> " + num);
            return hm.get(num);
        } else {
            System.out.print("the answer is-> " + num);
            int ans = num * num;
            hm.put(num, ans);
            return ans;
        }
    }
}
public class P7_CustomCachingSystem {
    public static void main(String[] args) throws Exception {
        Cache c = new Cache();

        System.out.println(c.findSquare(1));
        System.out.println(c.findSquare(2));
    }
}