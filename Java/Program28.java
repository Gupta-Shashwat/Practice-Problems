import java.util.*;

public class Program28 {
    public static int[] selectionSort(int arr[]) {
        int min, temp;
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of elements of the array: ");
            int n = sc.nextInt();
            System.out.println("Enter the elements of the array: ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            int[] arrNew = selectionSort(arr);
            System.out.println("The sorted array = ");
            for (int i = 0; i < n; i++)
                System.out.print(arrNew[i] + " ");
        }
    }
}
