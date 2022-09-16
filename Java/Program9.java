import java.util.*;

public class Program9 {
    public static void main(String[] args) {
        // Input two numbers and swap them
        System.out.println("Input two numbers: ");
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt(), b = sc.nextInt();
            a = a + b - (b = a);
            System.out.println("Value of a and b respectively after swapping are: ");
            System.out.println(a);
            System.out.println(b);
        }
    }
}
