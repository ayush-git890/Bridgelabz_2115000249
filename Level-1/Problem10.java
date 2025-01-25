import java.util.*;
public class Problem10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter value-: ");
        int num = sc.nextInt();

        //check a num is a +ve or no
        if (num <= 0) {
            System.out.println("not a +ve number!");
            return;
        }
        String[] ourAnswer = new String[num + 1]; //creatinf string array for storing fizz buzz
        for (int i = 0; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                ourAnswer[i] = "FizzBuzz";  // multiples of both 3 and 5
            } else if (i % 3 == 0) {
                ourAnswer[i] = "Fizz";  // multiples of 3
            } else if (i % 5 == 0) {
                ourAnswer[i] = "Buzz";  // multiples of 5
            } else {
                ourAnswer[i] = String.valueOf(i);
            }
        }

        for (int i = 0; i <= num; i++) {
            System.out.println("Position " + (i) + " = " + ourAnswer[i]); //answer...........
        }
        sc.close();
    }
}