package priorityQueue_9__14_9_2024;

import java.util.PriorityQueue;

public class ClassA {
    public static void main(String[] args) {
        ClassA aobj = new ClassA();
        aobj.meth1();

    }

    void meth1() {
        PriorityQueue<Object> pq = new PriorityQueue<Object>();
        pq.offer(10); // Insertion order is
        pq.offer(63); // Haterogenous data is not allowed
        // pq.offer(null); // null value is not allowed
        pq.offer(10); // Duplicates are allowed
        pq.offer(64); // it's availabe from java 1.5v
        pq.offer(45); // it's capacity is 11
        pq.offer(100); // it's size increas by double
        pq.offer(90); // it is not synchronized

        System.out.println(pq);
        pq.remove();
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);

        pq.clear();
        // System.out.println(pq.remove()); // It generated NoSuchElementException

        System.out.println(pq.poll()); // Its gives a null value

        System.out.println("peek() : " + pq.peek());
        System.out.println(pq);

        // write the logic to reterive the data by using Iterator interface

    }
}
