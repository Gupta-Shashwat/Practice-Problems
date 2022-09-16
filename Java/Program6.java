import java.util.*;

public class Program6 {
    public static void main(String[] args) {
        try (// Input base and height and calculate area of triangle
                Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the base and height of the triangle: ");
            float base = sc.nextFloat();
            float height = sc.nextFloat();
            System.out.print("Area of the triangle is: ");
            System.out.println(base * height / 2);
        }
    }
}
