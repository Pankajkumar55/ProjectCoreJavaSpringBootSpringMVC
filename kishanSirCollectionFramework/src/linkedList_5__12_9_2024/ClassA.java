package linkedList_5__12_9_2024;

import java.util.LinkedList;

public class ClassA {
    public static void main(String[] args) {


    }

    void meth1() {
        System.out.println("Implementing LinkedList\n");

        LinkedList<Object> ll = new LinkedList<Object>();

        ll.add(10); // Insertion order is maintained
        ll.add("java"); // Hetrogeneous data is allowed
        ll.add(null); // null value is alowed
        ll.add(10); // Duplicates are alowed
        ll.add('A'); // It is availabe from jaba 1.2v
        ll.add(true); // Its default capacity is 0
        ll.add(65); // Its size increases by DOUBLE
        ll.add(15); // It is not Syncronized


        System.out.println(ll);
        System.out.println("\nRetriving the data by using for loop");
        for (int i = 0; i <= ll.size() - 1; i++)
            System.out.print(ll.get(i) + " ");
        System.out.println();


    }
}
