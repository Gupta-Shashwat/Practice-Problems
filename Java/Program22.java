import java.util.Scanner;

public class Program22 {
    public static void printGrade(float avg) {
        if (avg < 30)
            System.out.println("Fail!!!");
        else if (avg > 30 && avg < 40)
            System.out.println("Second Division!!");
        else if (avg > 40 && avg < 60)
            System.out.println("Second Division!");
        else
            System.out.println("First Division");
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the marks of the student out of 100: ");
            System.out.println("In Maths: ");
            int maths = sc.nextInt();
            System.out.println("In Physics: ");
            int physics = sc.nextInt();
            System.out.println("In Chemistry: ");
            int chemistry = sc.nextInt();
            System.out.println("In English: ");
            int english = sc.nextInt();
            System.out.println("In IT: ");
            int it = sc.nextInt();
            float avg = (maths + physics + chemistry + english + it) / 5;
            printGrade(avg);
        }
    }
}
