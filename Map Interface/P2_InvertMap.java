import java.util.*;
public class P2_InvertMap{
	public static void main(String args[]){
		Map<String, Integer> hm = new HashMap<>();
        hm.put("A", 1);
        hm.put("B", 2);
        hm.put("C", 1);

        System.out.println("Inverted Map: " + invertMap(hm));
	}
	public static <K, V> Map<V, List<K>> invertMap(Map<K, V> hm) {
        Map<V, List<K>> invertedMap = new HashMap<>();

        for (Map.Entry<K, V> entry : hm.entrySet()) {
            invertedMap.computeIfAbsent(entry.getValue(), k -> new ArrayList<>()).add(entry.getKey());
        }

        return invertedMap;
    }
}