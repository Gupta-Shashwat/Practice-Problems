import java.util.*;

public class PalindromicPattern {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the height of the pyramid: ");
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < n - i; j++)
                    System.out.print("  ");
                for (int j = i; j > 0; j--) {
                    System.out.print(j);
                    System.out.print(" ");
                }
                for (int j = 2; j <= i; j++) {
                    System.out.print(j);
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
