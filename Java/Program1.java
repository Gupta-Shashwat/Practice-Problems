import java.util.*;

public class Program1 {
    public static void main(String[] args) {
        // input two numbers and print their sum
        int a, b, sum;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter two numbers: ");
            a = sc.nextInt();
            b = sc.nextInt();
        }
        sum = a + b;
        System.out.print("The sum of the numbers = ");
        System.out.println(sum);
    }
}
