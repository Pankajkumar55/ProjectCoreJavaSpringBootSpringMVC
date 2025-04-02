package compareMethod_compareToMethod_14__18_9_2024;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ClassA {
    public static void main(String[] args) {
        ClassA aobj = new ClassA();
        aobj.meth1();
    }

    void meth1() {
        System.out.println("Sorting the data present in Userdefined ClassObject\n");

        ArrayList<Employee> al = new ArrayList<Employee>();

        Employee emp1 = new Employee("Kishan", 30000, "AWS");
        Employee emp2 = new Employee("Ahmed", 50000, "Spring");
        Employee emp3 = new Employee("Jaya", 10000, "Oracle");

        al.add(emp1);
        al.add(emp2);
        al.add(emp3);

        System.out.println("Reteriving the data by using Iterator");
        Iterator<Employee> i1 = al.iterator();
        while (i1.hasNext()) {
            System.out.println(i1.next());
        }

        System.out.println("\nReteriving the data After sorting");

        Collections.sort(al, new ClassB());
        Iterator<Employee> i2 = al.iterator();
        while (i2.hasNext()) {
            System.out.println(i2.next());
        }
    }
}