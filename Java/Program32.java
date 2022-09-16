import java.util.*;

public class Program32 {
    public static void printMatrixSum(int[][] mat1, int[][] mat2) {
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[0].length; j++)
                System.out.print(mat1[i][j] + mat2[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of rows and columns for the matrices: ");
            int x = sc.nextInt(), y = sc.nextInt();
            System.out.println("Enter the elements of the first matrix: ");
            int mat1[][] = new int[x][y];
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++)
                    mat1[i][j] = sc.nextInt();
            }
            System.out.println("Enter the elements of the Second matrix: ");
            int mat2[][] = new int[x][y];
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++)
                    mat2[i][j] = sc.nextInt();
            }
            System.out.println("Sum of the two matrices is: ");
            printMatrixSum(mat1, mat2);
        }
    }
}
