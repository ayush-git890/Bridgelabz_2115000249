import java.util.*;

public class Problem8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter the number of students: ");
        int ts = sc.nextInt();

        int[] physics = new int[ts];
        int[] chemistry = new int[ts];
        int[] math = new int[ts];
        double[] arr = new double[ts];
        String[] nums = new String[ts];

        // input marks for students
        for (int i = 0; i < ts; i++) {
            System.out.println("\nenter marks for Student " + (i + 1));
            System.out.print("enter Physics marks: ");
            physics[i] = sc.nextInt();
            while (physics[i] < 0) {
                System.out.print("wrong entry!");
                physics[i] = sc.nextInt();
            }

            System.out.print("enter Chemistry marks: ");
            chemistry[i] = sc.nextInt();
            while (chemistry[i] < 0) {
                System.out.print("wrong entry!");
                chemistry[i] = sc.nextInt();
            }

            System.out.print("enter Maths marks: ");
            math[i] = sc.nextInt();
            while (math[i] < 0) {
                System.out.print("wrong entry!");
                math[i] = sc.nextInt();
            }

            // Calculate the percentage
            double result = physics[i] + chemistry[i] + math[i];
            arr[i] = (result / 300) * 100;

            //the grade based on the percentage
            if (arr[i] >= 80) {
                nums[i] = "A";
            } else if (arr[i] >= 70) {
                nums[i] = "B";
            } else if (arr[i] >= 60) {
                nums[i] = "C";
            } else if (arr[i] >= 50) {
                nums[i] = "D";
            } else if (arr[i] >= 40) {
                nums[i] = "E";
            } else {
                nums[i] = "R";
            }
        }

        System.out.println("\nstudent | Physics | Chemistry | Maths | Percentage | Grade");
        for (int i = 0; i < ts; i++) {
            System.out.printf("%d | %d | %d | %d | %.2f%% | %s\n", 
                              i + 1, physics[i], chemistry[i], math[i], arr[i], nums[i]);
        }

        sc.close();
    }
}