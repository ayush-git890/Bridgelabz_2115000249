import java.util.*;
public class P1_StringBuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the length of an array--> ");
        int n = sc.nextInt();
        System.out.println("enter the string in an array--> ");
        String arr[] = new String[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.next();
        }
        
        System.out.println("the concatenated string after string buffer -> "+concatenatedString(arr));
        sc.close();
    }
    public static String concatenatedString(String arr[]){
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]);
        }

        return sb.toString();
    }
}