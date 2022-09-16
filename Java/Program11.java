import java.util.*;

public class Program11 {
    public static void main(String[] args) {
        // Input two numbers and print the greater number.
        System.out.println("Enter the two numbers: ");
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt(), b = sc.nextInt();
            System.out.print("The greater number is: ");
            System.out.println((a > b) ? a : b);
        }
    }
}
