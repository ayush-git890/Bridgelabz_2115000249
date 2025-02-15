import java.util.*;
public class P2_StringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a string --> ");
        String str = sc.nextLine();
        System.out.println("the string after removing dubplicates is --> "+removeDuplicate(str));
        sc.close();
    }
    public static String removeDuplicate(String str){
        HashSet<Character> hs = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<str.length();i++){
            if(!hs.contains(str.charAt(i))){
                hs.add(str.charAt(i));
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}