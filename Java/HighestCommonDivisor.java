import java.util.*;

public class HighestCommonDivisor {
    public static int highestCommonDivisor(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        int hcd = a;
        return hcd;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Highest Common Divisor of these two numbers = " + highestCommonDivisor(a, b));
        }
    }
}
