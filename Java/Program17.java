import java.util.*;

public class Program17 {
    public static void main(String[] args) {
        /*
         * Display pattern below
         *
         **
         ***
         ****
         * 
         */
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of rows: ");
            int x = sc.nextInt();
            for (int i = 0; i < x; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
