import java.util.*;

public class Program14 {
    public static void main(String[] args) {
        // Display reverse of a number
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            int x = sc.nextInt();
            int reverse = 0;
            for (int i = String.valueOf(x).length() - 1; i >= 0; i--) {
                reverse += Math.pow(10, i) * (x % 10);
                x /= 10;
            }
            System.out.println("Reverse of the provided number = " + reverse);
        }
    }
}
