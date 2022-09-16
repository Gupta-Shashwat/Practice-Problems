import java.util.*;

public class Program33 {
    public static void printMatricesProduct(int[][] mat1, int[][] mat2) {
        int[][] mat3 = new int[mat1.length][mat2[0].length];
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat2[0].length; j++) {
                for (int k = 0; k < mat1[0].length; k++)
                    mat3[i][j] += mat1[i][k] * mat2[k][j];
            }
        }
        for (int i = 0; i < mat3.length; i++) {
            for (int j = 0; j < mat3[0].length; j++)
                System.out.print(mat3[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of rows and columns for the first matrix: ");
            int x = sc.nextInt(), y = sc.nextInt();
            System.out.println("Enter the elements of the first matrix: ");
            int mat1[][] = new int[x][y];
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++)
                    mat1[i][j] = sc.nextInt();
            }
            System.out.println("Enter the number of rows and columns for the second matrix: ");
            int a = sc.nextInt(), b = sc.nextInt();
            System.out.println("Enter the elements of the Second matrix: ");
            int mat2[][] = new int[a][b];
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++)
                    mat2[i][j] = sc.nextInt();
            }
            System.out.println("Product of the two matrices is: ");
            printMatricesProduct(mat1, mat2);
        }
    }
}
