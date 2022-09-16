import java.util.*;
import java.lang.Math;

public class Program5 {
    public static void main(String[] args) {
        try (// Input radius and calculate area and circumference of circle.
                Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the radius of the circle: ");
            float r = sc.nextFloat();
            float area = (float) (Math.PI * r * r);
            float circumference = (float) (2 * Math.PI * r);
            System.out.print("Area = ");
            System.out.println(area);
            System.out.print("Circumference = ");
            System.out.println(circumference);
        }
    }
}
