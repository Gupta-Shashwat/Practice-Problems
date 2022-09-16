import java.util.*;

public class Program2 {
    public static void main(String[] args) {
        // Input P,R,T and print Simple Interest
        int P, T;
        float R, SI;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the Principal Amount, Rate and Time: ");
            P = sc.nextInt();
            R = sc.nextFloat();
            T = sc.nextInt();
        }
        SI = P * R * T / 100;
        System.out.print("Simple Interest = ");
        System.out.print(SI);
    }
}
