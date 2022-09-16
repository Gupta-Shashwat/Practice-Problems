import java.util.*;

public class Program7 {
    public static void main(String[] args) {
        try (// If Basic salary is input through keyboard write a program to calculate gross
             // salary. Where,
             // da is 10% of bs.
             // ta is 12% of bs.
             // hra is 10% of bs.
                Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the Basic Salary: ");
            float bs = sc.nextFloat();
            float da = (float) (bs * 0.1), ta = (float) (bs * 0.12), hra = (float) (bs * 0.1);
            System.out.print("Gross Salary = ");
            System.out.println(bs + da + ta + hra);
        }
    }
}
