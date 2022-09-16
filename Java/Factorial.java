import java.util.*;

public class Factorial {
    public static long factorial(int a) {
        if (a == 0) {
            return 1;
        } else {
            return a * factorial(a - 1);
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            System.out.println("Factorial of " + n + " = " + factorial(n));
        }
    }
}
