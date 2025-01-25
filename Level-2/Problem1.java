import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salary = new double[10];
        double[] yos = new double[10];
        double[] bonus = new double[10];
        double[] nsalary = new double[10];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalnsalary = 0;

        for (int i = 0; i < 10; i++) {
            boolean temp = false;
            while (!temp) {
                System.out.print("enter salary " + (i + 1) + ": ");
                salary[i] = sc.nextDouble();

                System.out.print("enter yos " + (i + 1) + ": ");
                yos[i] = sc.nextDouble();

                if (salary[i] <= 0 || yos[i] < 0) {
                    System.out.println("error worong entry");
                } else {
                    temp = true;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            if (yos[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            nsalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalnsalary += nsalary[i];
        }

        System.out.println("\ntotal bonus: " + totalBonus);
        System.out.println("old salary " + totalOldSalary);
        System.out.println("total new salary " + totalnsalary);
        sc.close();
    }
}