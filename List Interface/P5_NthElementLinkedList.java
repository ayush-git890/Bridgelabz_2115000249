import java.util.*;
public class P5_NthElementLinkedList{
	public static void main(String args[]){
		LinkedList<String> ll = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the nth number--> ");
		int n = sc.nextInt();
		
		System.out.println("your original list is this--> "+ll);
		System.out.println("the "+n+"th element from the last of list is-> "+fromLast(ll,n));
	}
	public static String fromLast(LinkedList<String> ll,int n){
		Iterator<String> fast = ll.iterator();
		Iterator<String> slow = ll.iterator();
		for (int i = 0; i < n; i++) {
            if (fast.hasNext()) {
                fast.next();
            }
        }
		
		while (fast.hasNext()) {
            fast.next();
            slow.next();
        }
		
		return slow.next();
	}
}