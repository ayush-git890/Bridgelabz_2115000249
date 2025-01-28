import java.util.*;
public class Program12{
    public static void main(String[] args) {
        int numStudents = 12;

        int[][] arr = randomnums(numStudents);
        scoreCard(arr);
    }
    public static int[][] randomnums(int numStudents) {
        Random rand = new Random();
        int[][] nums = new int[numStudents][4]; 
        for (int i = 0; i < numStudents; i++) {
            nums[i][0] = rand.nextInt(90) + 10;
            nums[i][1] = rand.nextInt(90) + 10;
            nums[i][2] = rand.nextInt(90) + 10;
            nums[i][3] = nums[i][0] + nums[i][1] + nums[i][2];
        }
        return nums;
    }
    public static void scoreCard(int[][] nums) {
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage\tGrade\tRemarks");
        for (int i = 0; i < nums.length; i++) {
            System.out.printf("Student %d\t%d\t\t%d\t\t%d\t\t%d\t\t%.2f\t\t%.2f\t\t%s\t\t%s\n",
                    i + 1, nums[i][0], nums[i][1], nums[i][2], nums[i][3],
                    (double) nums[i][3] / 3, (double) nums[i][3] / 300 * 100,
                    greade((double) nums[i][3] / 300 * 100),
                    remarskStudent((double) nums[i][3] / 300 * 100));
        }
    }
    public static String greade(double percentage) {
        if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else if (percentage >= 40) {
            return "E";
        } else {
            return "R";
        }
    }
    public static String remarskStudent(double percentage) {
        if (percentage >= 80) {
            return "(Level 4, above agency-normalized standards)";
        } else if (percentage >= 70) {
            return "(Level 3, at agency-normalized standards)";
        } else if (percentage >= 60) {
            return "(Level 2, below, but approaching agency-normalized standards)";
        } else if (percentage >= 50) {
            return "(Level 1, well below agency-normalized standards)";
        } else if (percentage >= 40) {
            return "(Level 1-, too below agency-normalized standards)";
        } else {
            return "(Remedial standards)";
        }
    }
}