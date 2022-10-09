import java.util.*;
import packages.package1;

class newClass {
    int a, b;

    public newClass() {
    };

    public newClass(int x, int y) {
        a = x;
        b = y;
    }

    public void print() {
        System.out.println(this.a + "5" + this.b);
    }
}

public class OOPS {
    public static void main(String[] args) {
        newClass n1 = new newClass(2, 5), n2 = new newClass(9, 5);
        System.out.println("newClass object 1: ");
        n1.print();
        System.out.println("newClass object 2: ");
        n2.print();
    }
}