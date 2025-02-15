import java.util.*;
public class P2_LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr[] = {
            "my name is ayush agarwal",
            "i live in agra",
        };
        System.out.print("enter a word that you want to search--> ");
        String str = sc.nextLine();
        if(foundWord(arr,str)){
            System.out.println("Founded");
        }
        else{
            System.out.println("Not found");
        }
        sc.close();
    }
    public static boolean foundWord(String arr[],String str){
        for(int i=0;i<arr.length;i++){
            if(arr[i].contains(str)){
                return true;
            }
        }
        return false;
    }
}