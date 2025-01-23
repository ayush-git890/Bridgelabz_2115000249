import java.util.*;

public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // enter the ages....
        System.out.println("Enter the age of Amar:");
        int ageAmar = sc.nextInt();
        System.out.println("Enter the age of Akbar:");
        int ageAkbar = sc.nextInt();
        System.out.println("Enter the age of Anthony:");
        int ageAnthony = sc.nextInt();

        // enter the heights.....
        System.out.println("Enter the height of Amar (in cm):");
        int heightAmar = sc.nextInt();
        System.out.println("Enter the height of Akbar (in cm):");
        int heightAkbar = sc.nextInt();
        System.out.println("Enter the height of Anthony (in cm):");
        int heightAnthony = sc.nextInt();

        // Finding the youngest friend here.........
        int a1 = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        String str = "";
        if (a1 == ageAmar) {
            str = "Amar";
        } else if (a1 == ageAkbar) {
            str = "Akbar";
        } else {
            str = "Anthony";
        }

        // Finding the tallest friend based on height
        int flag = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        String str2 = "";
        if (flag == heightAmar) {
            str2 = "Amar";
        } else if (flag == heightAkbar) {
            str2 = "Akbar";
        } else {
            str2 = "Anthony";
        }

        // Displaying the results
        System.out.println("The youngest friend is " + str + " with an age of " + a1 + " years.");
        System.out.println("The tallest friend is " + str2 + " with a height of " + flag + " cm.");

        sc.close();
    }
}