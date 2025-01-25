import java.util.*;

public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int totalPerson = sc.nextInt();
        double[][] personData = new double[totalPerson][3];
        String[] ws = new String[totalPerson];

        for (int i = 0; i < totalPerson; i++) {
            System.out.println("Person " + (i + 1) + ":");
            double weight;
            do {
                System.out.print("Enter weight (in kg): ");
                weight = sc.nextDouble();
                if (weight <= 0) {
                    System.out.println("Please enter a positive value for weight.");
                }
            } while (weight <= 0);
            personData[i][0] = weight;
			
            double height;
            do {
                System.out.print("Enter height (in meters): ");
                height = sc.nextDouble();
                if (height <= 0) {
                    System.out.println("Please enter a positive value for height.");
                }
            } while (height <= 0);
            personData[i][1] = height;

            // Calculate BMI (BMI = weight / (height * height))
            personData[i][2] = weight / (height * height);
            if (personData[i][2] <= 18.4) {
                ws[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] <= 24.9) {
                ws[i] = "Normal";
            } else if (personData[i][2] >= 25.0 && personData[i][2] <= 39.9) {
                ws[i] = "Overweight";
            } else {
                ws[i] = "Obese";
            }
        }

        System.out.println("\n-------------------------------------------------------------");
		System.out.println("Person | Height (m) | Weight (kg) |   BMI   |    Status   ");
		System.out.println("-------------------------------------------------------------");
		for (int i = 0; i < totalPerson; i++) {
			System.out.printf("%-7d | %-12.2f | %-12.2f | %-7.2f | %-12s\n", i + 1, personData[i][1], personData[i][0], personData[i][2], ws[i]);
		}
		System.out.println("-------------------------------------------------------------");


        sc.close();
    }
}