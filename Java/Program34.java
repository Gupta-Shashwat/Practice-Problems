import java.util.*;

public class Program34 {
    public static void printMatrixTranspose(int[][] mat) {
        for (int i = 0; i < mat[0].length; i++) {
            for (int j = 0; j < mat.length; j++)
                System.out.print(mat[j][i] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of rows and columns for the matrix: ");
            int x = sc.nextInt(), y = sc.nextInt();
            System.out.println("Enter the elements of the matrix: ");
            int mat[][] = new int[x][y];
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++)
                    mat[i][j] = sc.nextInt();
            }
            System.out.println("Transpose of the matrix is: ");
            printMatrixTranspose(mat);
        }
    }
}
