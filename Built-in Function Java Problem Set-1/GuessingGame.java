import java.util.*;
public class GuessingGame{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        System.out.println("think of a number between 1 and 100---> ");

        int low = 1, high = 100, guess;
        String flag = "";

        while (true) {
            guess = calculateGenerate(low, high);
            System.out.println("is your number " + guess + "? (Enter 'high', 'low', or 'correct'):");
            flag = sc.nextLine().toLowerCase();

            if (flag.equals("correct")) {
                System.out.println("Yay! I guessed your number correctly.");
                break;
            } else if (flag.equals("high")) {
                high = guess - 1;
            } else if (flag.equals("low")) {
                low = guess + 1;
            } else {
                System.out.println("Invalid input! Please enter 'high', 'low', or 'correct'.");
            }

            if (low > high) {
                System.out.println("Something went wrong! Are you sure about your responses?");
                break;
            }
        }
        sc.close();
	}
	public static int calculateGenerate(int low, int high) {
        return low + (high - low) / 2; 
    }
}