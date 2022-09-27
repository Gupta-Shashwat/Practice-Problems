import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        // declaration of ArrayList: ArrayList<<datatype>> <ArrayList Name> = new
        // ArrayList<>();
        ArrayList<Integer> integers = new ArrayList<>();

        // printing: System.out.println(<ArrayList Name>);
        System.out.println(integers);

        // adding elements: <ArrayList Name>.add(<element>);
        integers.add(56);
        integers.add(64);
        integers.add(97);
        integers.add(43);
        integers.add(65);
        integers.add(59);
        integers.add(74);
        System.out.println(integers);

        // adding elements at specific index: <ArrayList Name>.add(<index>, <element>);
        integers.add(2, 45);
        System.out.println(integers);

        // updating elements: <ArrayList Name>.set(<index>, <element);
        integers.set(0, 95);
        System.out.println(integers);

        // deleting elements: <ArrayList Name>.remove(<index>);
        integers.remove(0);
        System.out.println(integers);

        // getting elements: <ArrayList Name>.get(<index>);
        int data = integers.get(2);
        System.out.println(data);

        // getting size of list: <ArrayList Name>.size();
        System.out.println(integers.size());

        // iterating through elements:
        for (int i = 0; i < integers.size() - 1; i++) {
            System.out.print(integers.get(i) + ", ");
        }
        System.out.println(integers.get(integers.size() - 1));

        // sorting:
        // 1. import java.util.Collections;
        // 2. Collections.sort(<ArrayList Name>);
        Collections.sort(integers);
        System.out.println(integers);
    }
}