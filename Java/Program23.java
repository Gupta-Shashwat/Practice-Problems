import java.util.*;

public class Program23 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter three numbers: ");
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            if (x > y && x > z) {
                System.out.println(x + " is the greatest of them all.");
            } else if (y > x && y > z) {
                System.out.println(y + " is the greatest of them all.");
            } else {
                System.out.println(z + " is the greatest of them all.");
            }
        }
    }
}
