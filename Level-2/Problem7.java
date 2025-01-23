import java.util.*;

public class Problem7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight in kg: ");
        double w = sc.nextDouble(); 
        System.out.print("Enter height in cm: ");
        double hcm = sc.nextDouble();
        double him = hcm / 100;
        double bmi = w / (him * him);

        String flag;
        if (bmi <= 18.4) {
            flag = "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            flag = "Normal";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            flag = "Overweight";
        } else {
            flag = "Obese";
        }

        System.out.printf("\nYour BMI: %.2f\n", bmi);
        System.out.println("flag: " + flag);

        sc.close();     
    }
}