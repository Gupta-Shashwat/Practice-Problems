import java.util.*;

public class ButterflyPattern {
    public static void main(String[] args) {
        System.out.println("Enter the number of upper rows in butterfly: ");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                for (int j = 0; j < (n - i) * 2; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++)
                    System.out.print("*");
                System.out.println();
            }
            for (int i = n; i > 0; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                for (int j = 0; j < (n - i) * 2; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++)
                    System.out.print("*");
                System.out.println();
            }
        }
    }
}
