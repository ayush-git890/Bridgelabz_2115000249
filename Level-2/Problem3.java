import java.util.*;

public class Problem3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks->Physics: ");
        double p = sc.nextDouble();

        System.out.print("Enter marks->Chemistry: ");
        double c = sc.nextDouble();

        System.out.print("Enter marks->Maths: ");
        double m = sc.nextDouble();

       
        double total = p + c + m;
        double daverage = total / 3;
        double percent = (total / 300) * 100;

       
        String grade = helperOne(percent);
        String remarks = result(grade);

       
        System.out.println("\n===== Result =====");
        System.out.println("Total Marks: " + total);
        System.out.printf("Average Marks: %.2f\n", daverage);
        System.out.printf("percent: %.2f%%\n", percent);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        sc.close();
    }  
    private static String helperOne(double percent) {
        if (percent >= 80) {
            return "A";
        } else if (percent >= 70) {
            return "B";
        } else if (percent >= 60) {
            return "C";
        } else if (percent >= 50) {
            return "D";
        } else if (percent >= 40) {
            return "E";
        } else {
            return "R";
        }
    }
    private static String result(String grade) {
        switch (grade) {
            case "A":
                return "Level 4, above agency-normalized standards";
            case "B":
                return "Level 3, at agency-normalized standards";
            case "C":
                return "Level 2, below but approaching agency-normalized standards";
            case "D":
                return "Level 1, well below agency-normalized standards";
            case "E":
                return "Level 1-, too below agency-normalized standards";
            case "R":
                return "Remedial standards";
            default:
                return "No remarks available";
        }
    }
}