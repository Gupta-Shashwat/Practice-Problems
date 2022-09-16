import java.util.*;

public class Program24 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of the array: ");
            int n = sc.nextInt();
            System.out.println("Enter the elements of the array: ");
            int[] arr = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            System.out.println("Average of the elements of the array = " + sum / n);
        }
    }
}
