import java.util.*;
public class Program13{
    public static void main(String[] args) {
        int rows = 2;
        int cols = 2;
        int[][] arr1 = randomMatrix(rows, cols);
        int[][] arr2 = randomMatrix(rows, cols);
        int[][] sum = mat(arr1, arr2);
        int[][] difference = subtractMatrices(arr1, arr2);
        int[][] product1 = multiplyMatrices(arr1, arr2);
        int[][] product2 = multiplyMatrices(arr2, arr1);
        int[][] transpose1 = transposeMatrix(arr1);
        int[][] transpose2 = transposeMatrix(arr2);
        int determinant1 = findDeterminant(arr1);
        int determinant2 = findDeterminant(arr2);
        System.out.println("Matrix 1:");
        displayMatrix(arr1);
        System.out.println("Matrix 2:");
        displayMatrix(arr2);
        System.out.println("Sum:");
        displayMatrix(sum);
        System.out.println("Difference:");
        displayMatrix(difference);
        System.out.println("Product (arr1 * arr2):");
        displayMatrix(product1);
        System.out.println("Product (arr2 * arr1):");
        displayMatrix(product2);
        System.out.println("Transpose of Matrix 1:");
        displayMatrix(transpose1);
        System.out.println("Transpose of Matrix 2:");
        displayMatrix(transpose2);
        System.out.println("Determinant of Matrix 1: " + determinant1);
        System.out.println("Determinant of Matrix 2: " + determinant2);
    }
    public static int[][] randomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        Random rand = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10);
            }
        }
        return matrix;
    }
    public static int[][] mat(int[][] arr1, int[][] arr2) {
        int rows = arr1.length;
        int cols = arr1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return result;
    }
    public static int[][] subtractMatrices(int[][] arr1, int[][] arr2) {
        int rows = arr1.length;
        int cols = arr1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = arr1[i][j] - arr2[i][j];
            }
        }
        return result;
    }
    public static int[][] multiplyMatrices(int[][] arr1, int[][] arr2) {
        int rows1 = arr1.length;
        int cols1 = arr1[0].length;
        int rows2 = arr2.length;
        int cols2 = arr2[0].length;
        if (cols1 != rows2) {
            return null; // Matrices cannot be multiplied
        }
        int[][] result = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return result;
    }
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
    public static int findDeterminant(int[][] matrix) {
        if (matrix.length != 2 || matrix[0].length != 2) {
            return 0; // Only for 2x2 matrices
        }
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}