import java.util.*;

public class Program36 {
    public static void swapNumbers(int a, int b) {
        a = a + b - (b = a);
        System.out.println("Value of a = " + a + " and value of b = " + b);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the two numbers: ");
            int a = sc.nextInt(), b = sc.nextInt();
            swapNumbers(a, b);
        }
    }
}
