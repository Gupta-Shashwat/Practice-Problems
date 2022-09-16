import java.util.*;
import java.lang.Math;

public class Program10 {
    public static void main(String[] args) {
        // Input 5-digit numbers and calculate sum of its digits.
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number: ");
            int x = sc.nextInt();
            int sum = 0;
            while (x > 0) {
                sum += x % 10;
                x = Math.floorDiv(x, 10);
            }
            System.out.print("The sum of its digits = ");
            System.out.println(sum);
        }
    }
}
