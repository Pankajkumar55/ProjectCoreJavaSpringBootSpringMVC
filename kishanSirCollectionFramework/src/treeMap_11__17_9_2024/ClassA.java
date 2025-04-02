package treeMap_11__17_9_2024;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.Map.Entry;

public class ClassA {
    public static void main(String[] args) {
        new ClassA().meth1();
    }

    void meth1() {
        System.out.println("implementing TreeMap");
        TreeMap<Object, Object> map = new TreeMap<Object, Object>();
        map.put(101, "java"); // Insertion keys are maintained but data is not maintained
        map.put(109, 1000); // Heterogeneous keys are not allowed Heterogeneous values are allowed
        map.put(104, 3000); // Null keys are NOT allowed & null values are allowed
        map.put(106, "Oracle"); // Its default capacity is 16 [Load Factor :0.75]
        map.put(110, 2000); // Duplicates values are allowed
        map.put(103, "CSS"); // its availabe from java 1.2v
        map.put(105, "java"); // Its size increase by Double
        map.put(107, "Html"); // It is NOT synchronized

        System.out.println(map + "\n");

        System.out.println("\nRetriving the key-values pairs by using LinkedList");
        LinkedList<Object> al = new LinkedList<Object>(map.entrySet());

        Iterator<Object> i = al.iterator();
        while (i.hasNext()) {
            // System.out.println(i.next());

            Entry e = (Entry) i.next();
            System.out.println(e.getKey() + " " + e.getValue());

        }
    }
}
