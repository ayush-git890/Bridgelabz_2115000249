import java.util.*;
public class Problem9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter total student ");
        int ts = sc.nextInt();
		
        int[][] arr = new int[ts][3];  // 3 subjects for each student
        double[] p = new double[ts];
        String[] gradeArr = new String[ts];
        for (int i = 0; i < ts; i++) {
            System.out.println("\nenter arr for Student " + (i + 1));
            System.out.print("enter Physics arr: ");
            arr[i][0] = sc.nextInt();
            while (arr[i][0] < 0) {
                System.out.print("wong entry!");
                arr[i][0] = sc.nextInt();
            }

            System.out.print("enter Chemistry arr: ");
            arr[i][1] = sc.nextInt();
            while (arr[i][1] < 0) {
                System.out.print("wong entry!");
                arr[i][1] = sc.nextInt();
            }

            System.out.print("enter Maths arr: ");
            arr[i][2] = sc.nextInt();
            while (arr[i][2] < 0) {
                System.out.print("wong entry!");
                arr[i][2] = sc.nextInt();
            }

            // Calculate the percentage
            double result = arr[i][0] + arr[i][1] + arr[i][2];
            p[i] = (result / 300) * 100;

            //the grade based on the percentage
            if (p[i] >= 80) {
                gradeArr[i] = "A";
            } else if (p[i] >= 70) {
                gradeArr[i] = "B";
            } else if (p[i] >= 60) {
                gradeArr[i] = "C";
            } else if (p[i] >= 50) {
                gradeArr[i] = "D";
            } else if (p[i] >= 40) {
                gradeArr[i] = "E";
            } else {
                gradeArr[i] = "R";
            }
        }
        System.out.println("\nStudent | Physics | Chemistry | Maths | Percentage | Grade");
        for (int i = 0; i < ts; i++) {
            System.out.printf("%d | %d | %d | %d | %.2f%% | %s\n", 
                              i + 1, arr[i][0], arr[i][1], arr[i][2], p[i], gradeArr[i]);
        }

        sc.close();
    }
}