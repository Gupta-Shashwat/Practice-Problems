import java.util.*;

public class Program12 {
    public static void main(String[] args) {
        // Input a number and check if it is even or odd.
        System.out.println("Enter the number: ");
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            System.out.println((x % 2 == 0) ? "Even" : "Odd");
        }
    }
}
