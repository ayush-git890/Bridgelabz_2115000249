import java.util.*;
public class P2_GenerateBinaryNumber{
	public static void main(String args[]){
		int n = 5;
        System.out.println("First " + n + " binary numbers: " + binaryNumber(n));
	}
	public static List<String> binaryNumber(int n) {
        List<String> arr = new ArrayList<>();
        Queue<String> q = new LinkedList<>();
        q.add("1");

        for (int i = 0; i < n; i++) {
            String s = q.remove();
            arr.add(s);
            q.add(s + "0");
            q.add(s + "1");
        }

        return arr;
    }
}