import java.util.*;

public class Program16 {
    public static void main(String[] args) {
        // Generate Fibonacci Series
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of elements: ");
            int n = sc.nextInt();
            long prev = 0, curr = 1;
            System.out.print(prev + " " + curr + " ");
            for (int i = 2; i < n; i++) {
                System.out.print(prev + curr + " ");
                curr = prev + curr;
                prev = curr - prev;
            }
        }
    }
}
