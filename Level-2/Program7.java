//program to check whether they can vote oor not.....
import java.util.*;
public class Program7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age[] = new int[10];
		System.out.println("enter all agges here:---> ");
        for (int i = 0; i < 10; i++) {
            age[i] = sc.nextInt();
        }
        for (int i = 0; i < age.length; i++) {
            boolean vote = canStudentVote(age[i]);
            if (vote) {
                System.out.println("hence the age: " + age[i] + " can vote.");
            } else {
                System.out.println("sorry the age: " + age[i] + " cannot vote.");
            }
        }
		
		sc.close();
    }
    public static boolean canStudentVote(int age) {
        if (age < 0) {
            return false;
        } else if (age >= 18) {
            return true;
        }
        return false;
    }
}