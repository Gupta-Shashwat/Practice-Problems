import java.util.*;

public class Program20 {
    public static void checkVowel(char c) {
        if (c == 'a' || c == 'i' || c == 'e' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                || c == 'U')
            System.out.println("Vowel!!!");
        else
            System.out.println("Not Vowel!!!");
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the character: ");
            char c = sc.next().charAt(0);
            checkVowel(c);
        }
    }
}
