import java.util.*;

public class Program29 {
    public static int[] bubbleSort(int[] arr) {
        int temp;
        for (int i = arr.length; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of elements in the array: ");
            int n = sc.nextInt();
            System.out.println("Enter the elements of the array: ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            System.out.print("The sorted array = ");
            arr = bubbleSort(arr);
            for (int i = 0; i < n; i++)
                System.out.print(arr[i] + " ");
        }
    }
}
