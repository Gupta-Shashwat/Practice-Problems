import java.util.*;

public class Program4 {
    public static void main(String[] args) {
        try (// Input side of a square and print its area
                Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the sides of the square: ");
            float a = sc.nextFloat();
            System.out.print("Area of the square = ");
            System.out.println(a * a);
        }
    }
}
