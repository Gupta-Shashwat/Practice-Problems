import java.util.*;

public class Program15 {
    public static void main(String[] args) {
        // Input a number and check if it is palindrome or not.
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number: ");
            int n = sc.nextInt();
            String nStr = String.valueOf(n);
            int len = nStr.length(), i;
            for (i = 0; i <= len / 2; i++) {
                if (nStr.charAt(i) != nStr.charAt(len - i - 1)) {
                    System.out.println("The number is not Palindrome");
                    return;
                }
            }
            System.out.println("The number is Palindrome");
        }
    }
}
