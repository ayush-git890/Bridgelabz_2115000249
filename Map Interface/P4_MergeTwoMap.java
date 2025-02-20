import java.util.*;
public class P4_MergeTwoMap{
	public static void main(String args[]){
		Map<String, Integer> hm1 = new HashMap<>();
        hm1.put("A", 1);
        hm1.put("B", 2);

        Map<String, Integer> hm2 = new HashMap<>();
        hm2.put("B", 3);
        hm2.put("C", 4);

        System.out.println("here is our merged map..." + mergeTwoMaps(hm1, hm2));
	}
	public static Map<String, Integer> mergeTwoMaps(Map<String, Integer> hm1, Map<String, Integer> hm2) {
        Map<String, Integer> hm = new HashMap<>(hm1);

        for (Map.Entry<String, Integer> entry : hm2.entrySet()) {
            hm.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }

        return hm;
    }
}