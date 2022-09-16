import java.util.*;

public class Program26 {
    public static int linearSearch(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of elements in the array: ");
            int x = sc.nextInt();
            System.out.println("Enter the elements of the array: ");
            int[] arr = new int[x];
            for (int i = 0; i < x; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter the number to be searched in the array: ");
            int n = sc.nextInt();
            System.out.println("The number was found at index: " + linearSearch(arr, n));
        }
    }
}
