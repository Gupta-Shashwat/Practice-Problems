import java.util.*;

public class Program31 {
    public static int binarySearch(int[] arr, int n) {
        int start = 0, end = arr.length - 1, mid = (start + end) / 2;
        while (start < end) {
            if (n == arr[start])
                return start;
            else if (n == arr[end])
                return end;
            else if (n == arr[mid])
                return mid;
            if (n > arr[mid]) {
                start = mid + 1;
                mid = (start + end) / 2;
            } else if (n < arr[mid]) {
                end = mid - 1;
                mid = (start + end) / 2;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of elements in the array: ");
            int n = sc.nextInt();
            System.out.println("Enter the sorted array: ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            System.out.print("Enter the element to be searched: ");
            int x = sc.nextInt();
            int index = binarySearch(arr, x);
            System.out
                    .println((index == -1) ? "Element not found!!!"
                            : "The element was found at position " + (index + 1));
        }
    }
}
