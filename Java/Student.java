import java.util.*;

public class Student {

    public static void main(String[] args) {
        st s1 = new st(), s2 = new st();
        System.out.println("Enter the details of the students: ");
        s1.get();
        s2.get();
        System.out.println("\nDetails of the students are: ");
        s1.display();
        s2.display();
        System.out.println("\nTotal number of students: " + s1.count);
    }
}

class st {
    Scanner sc = new Scanner(System.in);
    private String name;
    private int rollno, id;
    private static char sec = 'B';
    public int count = 0;

    public st() {
        count++;
        id = count;
    }

    public void get() {
        System.out.println("\nStudent " + id + ":");
        System.out.print("\tEnter the name: ");
        this.name = sc.nextLine();
        System.out.print("\tEnter the Roll Number: ");
        this.rollno = sc.nextInt();
    }

    public void display() {
        System.out.println("\nStudent " + id + ":");
        System.out.println("\tName: " + name);
        System.out.println("\tRoll Number: " + rollno);
        System.out.println("\tSection: " + sec);
    }
}