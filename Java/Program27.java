import java.util.*;

public class Program27 {
    public static int[] mergeArray(int[] arr1, int[] arr2) {
        int l1 = arr1.length, l2 = arr2.length;
        int[] arr3 = new int[l1 + l2];
        for (int i = 0; i < l1; i++)
            arr3[i] = arr1[i];
        for (int i = l1; i < l1 + l2; i++)
            arr3[i] = arr2[i - l1];
        return arr3;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the length of array 1: ");
            int l1 = sc.nextInt();
            int[] arr1 = new int[l1];
            System.out.println("Enter the elements of array 1: ");
            for (int i = 0; i < l1; i++)
                arr1[i] = sc.nextInt();
            System.out.println("Enter the length of array 2: ");
            int l2 = sc.nextInt();
            int[] arr2 = new int[l2];
            System.out.println("Enter the elements of array 2: ");
            for (int i = 0; i < l2; i++)
                arr2[i] = sc.nextInt();
            int[] arr3 = mergeArray(arr1, arr2);
            System.out.print("The merged array = ");
            for (int i = 0; i < l1 + l2; i++)
                System.out.print(arr3[i] + " ");
        }
    }
}
