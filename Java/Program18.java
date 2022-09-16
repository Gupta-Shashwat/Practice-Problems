import java.util.*;

public class Program18 {
    public static void numberPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Print number pyramid
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the height of the pyramid: ");
            int x = sc.nextInt();
            numberPyramid(x);
        }
    }
}
