import java.util.*;
public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value for row: ");
        int r = sc.nextInt();
        System.out.print("enter the value for col: ");
        int c = sc.nextInt();

        //crreate 2d matrix here
        int[][] mat = new int[r][c];
        System.out.println("enter the value in 2d array--> ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                mat[i][j] = sc.nextInt();
            }
        }

        // Create a 1D array to store all value from 2d
        int[] array = new int[r * c];
        int index = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                array[index++] = mat[i][j];
            }
        }

        System.out.println("\n2d mat is --> ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        //this is our 1d array
        System.out.println("\n1d array after copy--> ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        sc.close();
    }
}