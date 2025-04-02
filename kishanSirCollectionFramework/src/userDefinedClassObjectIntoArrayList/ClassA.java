package userDefinedClassObjectIntoArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ClassA {
    public static void main(String[] args) {
        ClassA aobj = new ClassA();
        aobj.m1();
    }

    public void m1() {
        System.out.println("Passing user defined classObject into ArrayList");
        ArrayList<Employe> al = new ArrayList<Employe>();
        Employe emp1 = new Employe("pankaj", 1, "java");
        Employe emp2 = new Employe("chandan", 2, "java Developer");
        Employe emp3 = new Employe("prabhu", 3, "python");

        al.add(emp1);
        al.add(emp2);
        al.add(emp3);

        System.out.println(al);
        System.out.println("\nRetriving element by using iterator interface \n");

        Iterator<Employe> i = al.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

    }

}

