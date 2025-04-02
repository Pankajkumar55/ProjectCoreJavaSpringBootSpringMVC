package methodRefernces_4__20_9_2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class Employe {

    Employe() {
        System.out.println("ClassA default constructor called");
    }

    Employe(int a) {
        System.out.println("paramitrized constructor called");
    }

    static void show() {
        System.out.println("static() called");
    }

    void display() {
        System.out.println("non static() called");

        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(50);
        al.add(30);
        al.add(20);
        al.add(40);

        System.out.println("print al data : " + al);
        Object arr[] = new Object[al.size()];
        int index = 0;
        TreeSet<Integer> ts = new TreeSet<Integer>(al);
        Iterator<Integer> i = ts.descendingIterator();

        while (i.hasNext()) {
            arr[index++] = i.next();
        }
        System.out.println(Arrays.toString(arr));
    }

}
