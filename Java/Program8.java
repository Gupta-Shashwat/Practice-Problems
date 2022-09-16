import java.util.*;

public class Program8 {
    public static void main(String[] args) {
        // Input temperature in Fahrenheit and convert into Celsius.
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Input the temperature in Fahrenheit: ");
            float f = sc.nextFloat();
            float c = (float) ((f - 32) * 5 / 9);
            System.out.print("Temperature in Degree Celsius = ");
            System.out.println(c);
        }
    }
}
