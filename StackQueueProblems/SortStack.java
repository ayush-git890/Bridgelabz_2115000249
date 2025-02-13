import java.util.*;
public class SortStack{
	public static void main(String args[]){
		Stack<Integer> st = new Stack<>();
		st.push(5);
		st.push(4);
		st.push(3);
		st.push(2);
		st.push(1);
		System.out.println("this is he real stack-> "+st);
		sortStack(st);
		System.out.println("the stack after sorting-> "+st);
	}
	public static void sortStack(Stack<Integer> st){
		if(!st.isEmpty()){
			int temp = st.pop();
			sortStack(st);
			sorting(st,temp);
		}
	}
	public static void sorting(Stack<Integer> st, int temp){
		if(st.isEmpty() || st.peek()<=temp){
			st.push(temp);
			return ;
		}
		
		int flag = st.pop();
		sorting(st,temp);
		st.push(flag);
	}
}