package hashMap_and_LinkedHashMap_10__16_9_2024;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

public class ClassA {
    public static void main(String[] args) {
        ClassA aobj = new ClassA();
        aobj.meth1();
    }

    public void meth1() {
        System.out.println("implementing hashMap\n");

        //HashMap<Object, Object > map=new HashMap<Object, Object>(); // Insertion order is not maintained from java 1.2v
        LinkedHashMap<Object, Object> map = new LinkedHashMap<Object, Object>(); // Insertion order is maintained from
        // java 1.4v

        map.put(101, "java");
        map.put("java", 1000); // Heterogeneous keys & Heterogeneous values are allowed
        map.put(null, null); // Null keys and null values are allowed
        map.put(103, "java"); // Its default capacity is 16 [LOAD FACTOR :0.75]
        map.put('A', 2000); // Duplicates values are allowed
        map.put(106, "CSS"); //
        map.put(108, "Oracle"); // Its size increase in Double
        map.put(true, "Java"); // Its not synchronized

        System.out.println(map + "\n");

        System.out.println("Value present associated with 103 key is : " + map.get(103));
        map.put(103, "Spring");
        System.out.println("Value present associated with 103 key is : " + map.get(103) + "\n");

        System.out.println("\nReteriving the values from MAP");
        HashSet<Object> hs = new HashSet<Object>(map.keySet());
        System.out.println("All the keys in Map : " + hs + "\n");

        for (Object o : hs) {
            // System.out.println(o); // Retrives all the keys

            System.out.println(map.get(o));

        }

        System.out.println("\nRetiving the key-value pairs from MAP");
        LinkedHashSet<Object> lhs = new LinkedHashSet<Object>(map.entrySet());
        Iterator<Object> i = lhs.iterator();
        while (i.hasNext()) {
            // System.out.println(i.next());

            Entry e = (Entry) i.next();

            System.out.println(e.getKey() + "  " + e.getValue());
        }

        System.out.println("---------------------------");
        HashSet<Object> hs2 = new HashSet<Object>(map.entrySet());
        Iterator<Object> i2 = hs2.iterator();
        while (i2.hasNext()) {
            System.out.println(i2.next());
        }

    }
}

/*
 
 
 NOTE  
 ----
  1) In all map implemented classes one key-value pair is known a
  s one entry 
  2) ekys should be uniqe 
  3) whenever we are passing a duplicate
  key-value pair we will not be getting any error or an exception , old value
  which is associated with that key will be replaced with a new value.
 
 
 
 */