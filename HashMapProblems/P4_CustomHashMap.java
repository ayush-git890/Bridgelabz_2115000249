import java.util.*;
import java.lang.Math;
class CustomHashMap<K, V> {
    private static final int defaultCapacity = 20;//we can modiy it........
    private LinkedList<Entry<K, V>>[] ll;
	
	private static class Entry<K, V> {//inner class
        K key;
        V value;
        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
    public CustomHashMap() {
        ll = new LinkedList[defaultCapacity];
        for (int i = 0; i < defaultCapacity; i++) {
            ll[i] = new LinkedList<>();
        }
    }
    private int getIndex(K key) {// to get a index.....
        return Math.abs(key.hashCode() % defaultCapacity);
    }
    public void put(K key, V value) {//to insert or update key value pair....
        int idx = getIndex(key);
        LinkedList<Entry<K, V>> linkedArr = ll[idx];
        for (Entry<K, V> e : linkedArr) {
            if (e.key.equals(key)) {
                e.value = value;
                return;
            }
        }
        linkedArr.add(new Entry<>(key, value));
    }
    public V get(K key) {//to get a value.....
        int idx = getIndex(key);
        LinkedList<Entry<K, V>> linkedArr = ll[idx];
        for (Entry<K, V> e : linkedArr) {
            if (e.key.equals(key)) {
                return e.value;
            }
        }
        return null;
    }
    public void remove(K key) {//to remove the key and value....
        int idx = getIndex(key);
        LinkedList<Entry<K, V>> linkedArr = ll[idx];
        Iterator<Entry<K, V>> iterator = linkedArr.iterator();
        while (iterator.hasNext()) {
            Entry<K, V> e = iterator.next();
            if (e.key.equals(key)) {
                iterator.remove();
                return;
            }
        }
    }
    public void display() {// to display.......
        for (int i = 0; i < defaultCapacity; i++) {
            if (!ll[i].isEmpty()) {
                for (Entry<K, V> e : ll[i]) {
                    System.out.print(e.key + " -> " + e.value);
                }
                System.out.println();
            }
        }
    }
}
public class P4_CustomHashMap{
	public static void main(String args[]){
		CustomHashMap<String, Integer> chm = new CustomHashMap<>();
        chm.put("Ayush", 10);
        chm.put("rohit", 20);
        chm.put("mohit", 30);
		
        System.out.println("HashMap contents:");
        chm.display();
        System.out.println("value for rohit is-> " + chm.get("rohit"));
        chm.remove("mohit"); //removinf mohit from the map.....
        System.out.println("after removing mohit-> ");
        chm.display();
	}
}