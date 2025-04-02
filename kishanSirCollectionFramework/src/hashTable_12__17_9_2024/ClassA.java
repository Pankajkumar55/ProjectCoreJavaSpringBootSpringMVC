package hashTable_12__17_9_2024;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;

public class ClassA {

    public static void main(String[] args) {
        new ClassA().meth1();
    }

    void meth1() {

        System.out.println("implementing HashTable");
        Hashtable<Object, Object> ht = new Hashtable<Object, Object>();

        ht.put(101, "java"); // Insertion order in NOT maintained
        ht.put("java", 1000); // Heterogeneous keys & Heterogeneous values are allowed
        ht.put(104, 3000); // Null keys and null values are NOT allowed
        ht.put(106, "Oracle"); // Its default capacity is 11
        ht.put('A', 2000); // Duplicates values are allowed
        ht.put(103, "CSS"); // its availabe from java 1.0 [It is a Leagacy class]
        ht.put(105, "java"); // Its size increase by Double
        ht.put(107, "Html"); // It is synchronized

        System.out.println(ht + "\n");

        System.out.println("\nRetriving the key-values pairs by using ArrayList");
        ArrayList<Object> al = new ArrayList<Object>(ht.entrySet());

        Iterator<Object> i = al.iterator();
        while (i.hasNext()) {
            // System.out.println(i.next());

            Entry e = (Entry) i.next();
            System.out.println(e.getKey() + " " + e.getValue());

        }
    }
}