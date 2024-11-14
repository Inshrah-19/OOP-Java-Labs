package matrixtest;
import java.util.Scanner;

public class MatrixTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] mat_1 = new int[3][3];
        int[][] mat_2 = new int[3][3];
        
        System.out.println("Enter values for Mat_1 (3x3):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mat_1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter values for Mat_2 (3x3):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mat_2[i][j] = sc.nextInt();
            }
        }
        
        int[][] result_1 = addMatrices(cubeMatrix(mat_1), sqMatrix(mat_2));
        System.out.println("-----------------------------------------------------------");
        System.out.println("Result of (Mat_1^3) + (Mat_2)^2:");
        printMatrix(result_1);

        int[][] result_2 = sqMatrix(subtractScalar(mat_2, 3));
        System.out.println("-----------------------------------------------------------");
        System.out.println("Result of (Mat_2 - 3)^2:");
        printMatrix(result_2);

        int[][] result_3 = subtractMatrices(powerMatrix(mat_2, 5), subtractScalar(mat_1, 2));
        System.out.println("-----------------------------------------------------------");
        System.out.println("Result of (Mat_2^5) - (Mat_1 - 2):");
        printMatrix(result_3);
    }

    public static int[][] sqMatrix(int[][] matrix) {
        int[][] result = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = matrix[i][j] * matrix[i][j]; 
            }
        }
        return result;
    }

    public static int[][] cubeMatrix(int[][] matrix) {
        int[][] result = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = matrix[i][j] * matrix[i][j] * matrix[i][j]; 
            }
        }
        return result;
    }

    public static int[][] powerMatrix(int[][] matrix, int power) {
        int[][] result = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = (int) Math.pow(matrix[i][j], power); 
            }
        }
        return result;
    }

    public static int[][] addMatrices(int[][] mat1, int[][] mat2) {
        int[][] result = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j]; 
            }
        }
        return result;
    }

    public static int[][] subtractMatrices(int[][] mat1, int[][] mat2) {
        int[][] result = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = mat1[i][j] - mat2[i][j]; 
            }
        }
        return result;
    }

    // Method to subtract a scalar from all elements of a matrix
    public static int[][] subtractScalar(int[][] matrix, int scalar) {
        int[][] result = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = matrix[i][j] - scalar; 
            }
        }
        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
