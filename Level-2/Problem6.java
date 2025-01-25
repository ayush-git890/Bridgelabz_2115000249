import java.util.*;
public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter total number of person:- ");
        int totalPerson = sc.nextInt();
		
        double[] w = new double[totalPerson];
        double[] h = new double[totalPerson];
        double[] bmi = new double[totalPerson];
        String[] wtatus = new String[totalPerson];

        for (int i = 0; i < totalPerson; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.print("Enter weight (in kg): ");
            w[i] = sc.nextDouble();
            System.out.print("Enter height (in meters): ");
            h[i] = sc.nextDouble();

            //BMI using (BMI = weight / (height * height))
            bmi[i] = w[i] / (h[i] * h[i]);
            if (bmi[i] <= 18.4) {
                wtatus[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] <= 24.9) {
                wtatus[i] = "Normal";
            } else if (bmi[i] >= 25.0 && bmi[i] <= 39.9) {
                wtatus[i] = "Overweight";
            } else {
                wtatus[i] = "Obese";
            }
        }
        System.out.println("\nPerson | Height (m) | Weight (kg) | BMI | Status");
        for (int i = 0; i < totalPerson; i++) {
            System.out.printf("%d | %.2f | %.2f | %.2f | %s\n", i + 1, h[i], w[i], bmi[i], wtatus[i]);
        }

        sc.close();
    }
}