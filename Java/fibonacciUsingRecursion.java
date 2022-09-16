import java.util.*;

// Printing of numbers by recursion
public class fibonacciUsingRecursion {
    public static void printFibonacci(int n) {
        if (n >= 2) {
            System.out.print(0 + " " + 1 + " ");
            printFibonacci(n - 2, 1, 1);
        } else if (n == 1) {
            System.out.print(0);
        }
    }

    public static void printFibonacci(int n, int f, int l) {
        if (n > 0) {
            System.out.print((f + l) + " ");
            printFibonacci(n - 1, l, f + l);
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of elements: ");
            int n = sc.nextInt();
            printFibonacci(n);
        }
    }
}