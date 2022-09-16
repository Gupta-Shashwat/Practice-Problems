import java.util.*;
// Print subsets of n natural numbers

public class PrintSubsets {
    public static void printSubsets(int n, ArrayList<Integer> subset) {
        if (n == 0) {
            for (int i = 0; i < subset.size(); i++) {
                System.out.print(subset.get(i) + " ");
            }
            System.out.println();
            return;
        }
        subset.add(n);
        printSubsets(n - 1, subset);
        subset.remove(subset.size() - 1);
        printSubsets(n - 1, subset);
    }

    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> arr = new ArrayList<>();
        printSubsets(n, arr);
    }
}
