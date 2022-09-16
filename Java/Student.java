import java.util.*;

class student {
    Scanner sc = new Scanner(System.in);
    private String name;
    private int rollno, id;
    private static char sec = 'B';
    public static int count = 0;

    public student() {
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

public class Student {

    public static void main(String[] args) {
        student s1 = new student(), s2 = new student();
        System.out.println("Enter the details of the students: ");
        s1.get();
        s2.get();
        System.out.println("\nDetails of the students are: ");
        s1.display();
        s2.display();
        System.out.println("\nTotal number of students: " + student.count);
    }
}