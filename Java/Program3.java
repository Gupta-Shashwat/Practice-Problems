import java.util.*;

public class Program3 {
    public static void main(String[] args) {
        // Input length and breadth and calculate area of rectangle
        float l, b;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the length and breadth of the rectangle: ");
            l = sc.nextFloat();
            b = sc.nextFloat();
        }
        System.out.print("Area of the rectangle is: ");
        System.out.println(l * b);
    }
}
