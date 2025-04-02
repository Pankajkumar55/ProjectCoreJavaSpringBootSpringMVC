package understandingLinkedList_8__14_9_2024;

import java.util.LinkedList;
import java.util.List;

public class ClassA {

    void meth1() {
        System.out.println("meth1() called");

        List<Object> li = new LinkedList<Object>(); // 1st Object
        li.add(10);
        // li.offer(20); // C.E because offer() is present in Queue interface

        LinkedList<Object> ll = new LinkedList<Object>(); // 2nd Object
        ll.add(100);
        ll.offer(200);

    }
}
