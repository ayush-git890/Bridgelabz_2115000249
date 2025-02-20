import java.util.*;
public class P3_KeyHighestValue{
	public static void main(String args[]){
		Map<String, Integer> hm = new HashMap<>();
        hm.put("A", 10);
        hm.put("B", 20);
        hm.put("C", 15);

        System.out.println("Key with max value: " + highestValue(hm));
	}
	public static String highestValue(Map<String, Integer> map) {
        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        return maxKey;
    }
}