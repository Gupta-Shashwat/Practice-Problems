import java.util.*;

public class Program35 {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the two numbers: ");
            int a = sc.nextInt(), b = sc.nextInt();
            System.out.println("Sum of " + a + " and " + b + " = " + sum(a, b));
        }
    }
}
