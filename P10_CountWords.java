import java.io.*;
import java.util.*;
public class P10_CountWords {
    public static void main(String[] args) {
        Map<String, Integer> hm = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader("temp.txt"))) {
            String str;
            while ((str = br.readLine()) != null) {
                String[] words = str.toLowerCase().replaceAll("[^a-zA-Z ]", "").split("\\s+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        hm.put(word, hm.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("there is an error--> " + e.getMessage());
            return;
        }
        List<Map.Entry<String, Integer>> ls = new ArrayList<>(hm.entrySet());
        System.out.println("the top 5 most frequent words are--> ");
        for (int i = 0; i < Math.min(5, ls.size()); i++) {
            System.out.println(ls.get(i).getKey() + ": " + ls.get(i).getValue());
        }
    }
}