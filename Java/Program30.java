import java.util.*;

public class Program30 {
    public static int[] selectionSort(int[] arr) {
        int temp;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
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
            arr = selectionSort(arr);
            for (int i = 0; i < n; i++)
                System.out.print(arr[i] + " ");
        }
    }
}
