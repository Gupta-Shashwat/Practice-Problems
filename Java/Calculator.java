import java.util.*;

public class Calculator {
    public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int product(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the two numbers: ");
            int a = sc.nextInt(), b = sc.nextInt();
            System.out.println("Which operation do you want to perform? (+ - * /)");
            char op = sc.next().charAt(0);
            switch (op) {
                case '+':
                    System.out.println("Addition of the numbers = " + addition(a, b));
                    break;
                case '-':
                    System.out.println("Subtraction of the numbers = " + subtraction(a, b));
                    break;
                case '*':
                    System.out.println("Multiplication of the numbers = " + product(a, b));
                    break;
                case '/':
                    System.out.println("Division of the numbers = " + division(a, b));
                    break;
                default:
                    System.out.println("Invalid Operation!!!");
            }
        }
    }
}
