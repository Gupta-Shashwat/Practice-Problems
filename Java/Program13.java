import java.util.*;

public class Program13 {
    public static void main(String[] args) {
        // Input a number and check if it is Armstrong.
        System.out.println("Enter the number: ");
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            int t = x, c = 0, sum = 0;
            while (t > 0) {
                t = Math.floorDiv(t, 10);
                c++;
            }
            t = x;
            for (int i = 0; i < c; i++) {
                sum += Math.pow((t % 10), c);
                t /= 10;
            }
            System.out.println((x == sum) ? "Armstrong Number" : "Not an Armstrong Number");
        }
    }
}
