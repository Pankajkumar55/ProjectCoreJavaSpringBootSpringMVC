package streamAPI_5__23_9_2024;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ClassA {
    public static void main(String[] args) {

        ClassA a = new ClassA();
        a.meth1();
        // a.meth2();
        // a.meth3();
//		a.meth4();
    }

    void meth1() {
        System.out.println("Implementing for-each()\n");
        ArrayList<Integer> al = new ArrayList<Integer>();

        al.add(10);
        al.add(20);
        al.add(50);
        al.add(30);
        al.add(40);

		/*
			Iterator<Integer> i = al.iterator();
			while (i.hasNext()) {
				System.out.println(i.next() + " ");
			}
		*/

        al.forEach(data -> System.out.println(data));

    }

    void meth2() {
        System.out.println("Implementing filter()\n");

        ArrayList<String> names = new ArrayList<String>();
        names.add("pankaj");
        names.add("kumar");
        names.add("ranjan");
        names.add("chandan");
        names.add("prabhu");

        Stream<String> s1 = names.stream();
        Stream<String> s2 = s1.filter(data -> data.length() <= 5); // 1st way

        long l = names.stream().filter(data -> data.length() <= 5).count(); // 2nd way

        System.out.println("There are " + names.stream().filter(data -> data.length() <= 5)); // 3rd way
    }

    void meth3() {
        System.out.println("Implementing map() \n");

        ArrayList<Integer> al = new ArrayList<Integer>();

        al.add(20);
        al.add(10);
        al.add(30);
        al.add(50);
        al.add(60);

        System.out.println("al====> " + al);
        Stream<Integer> s1 = al.stream();
        Stream<Integer> s2 = s1.map(data -> {
            if (data % 2 == 0)
                return data - 5;
            else
                return data - 2;

        });

        List<Integer> li = s2.collect(Collectors.toList());
        System.out.println("li====> " + li);
    }

    void meth4() {
        System.out.println("Implementing sorted()\n");

        ArrayList<Integer> al = new ArrayList<Integer>();

        al.add(20);
        al.add(10);
        al.add(30);
        al.add(50);
        al.add(60);

        System.out.println("Before sorting : " + al);

        // Collections.sort(al);

        Stream<Integer> s = al.stream().sorted();
        List<Integer> li = s.collect(Collectors.toList());

        System.out.println("After sorting : " + li);

    }
}
