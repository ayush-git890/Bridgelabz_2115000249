import java.util.*;
public class PalindromeCheck{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        System.out.print("enter a string here--> : ");
        String str = sc.nextLine();
        // checking if the string is a palindrome or not......
        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
		
		sc.close();
	}
	public static boolean isPalindrome(String s) {
		//making string in lowecases here......
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); 

        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}