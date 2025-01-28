import java.util.*;
public class Program11{
    public static void main(String[] args) {
        int[][] employeeData = new int[10][3];
        for (int i = 0; i < 10; i++) {
            employeeData[i] = salarayAndYear();
        }
        int[][] updatedData = salaryAndBonus(employeeData);
        dSalary(updatedData);
    }
    public static int[] salarayAndYear() {
        Random rand = new Random();
        int salary = rand.nextInt(90000) + 10000;
        int yearsOfService = rand.nextInt(10) + 1; 
        return new int[]{salary, yearsOfService};
    }
    public static int[][] salaryAndBonus(int[][] employeeData) {
        int[][] updatedData = new int[10][3];
        for (int i = 0; i < 10; i++) {
            int oldSalary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            int bonusPercentage = (yearsOfService > 5) ? 5 : 2;
            int bonusAmount = (oldSalary * bonusPercentage) / 100;
            int newSalary = oldSalary + bonusAmount;
            updatedData[i] = new int[]{oldSalary, bonusAmount, newSalary};
        }
        return updatedData;
    }

    public static void dSalary(int[][] updatedData) {
        int totalOldSalary = 0;
        int totalNewSalary = 0;
        int totalBonus = 0;
        System.out.println("Employee\tOld Salary\tBonus\tNew Salary");
        
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%d\t\t%d\t\t%d\n", i + 1, updatedData[i][0], updatedData[i][1], updatedData[i][2]);
            totalOldSalary += updatedData[i][0];
            totalNewSalary += updatedData[i][2];
            totalBonus += updatedData[i][1];
        }
        System.out.println("Total\t" + totalOldSalary + "\t\t" + totalBonus + "\t\t" + totalNewSalary);
        
    }
}