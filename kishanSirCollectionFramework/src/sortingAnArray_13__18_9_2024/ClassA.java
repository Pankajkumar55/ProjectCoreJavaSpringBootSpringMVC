package sortingAnArray_13__18_9_2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class ClassA {
    public static void main(String[] args) {
        new ClassA().meth1();
    }

    void meth1() {
        System.out.println("meth1() called");
        int arr[] = {1, 2, 4, 8, 7, 6, 3};
        System.out.println("Before sorting : " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("After sorting : " + Arrays.toString(arr));

        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(5);
        al.add(3);
        al.add(2);
        al.add(4);

        System.out.println("Before sorting : " + al);
        Collections.sort(al);
        System.out.println("After sorting : " + al);

        LinkedHashSet<Integer> ls = new LinkedHashSet<Integer>();
        ls.add(1);
        ls.add(5);
        ls.add(3);
        ls.add(2);
        ls.add(4);

        System.out.println("Before sorting : " + ls);
        LinkedList<Integer> ll = new LinkedList<Integer>(ls);
        Collections.sort(ll);
        System.out.println("After sorting : " + ll);

    }
}
