package userCreateClassPassInCollections_14__18_9_2024;

import java.util.ArrayList;
import java.util.Iterator;

public class ClassA {
    public static void main(String[] args) {
        new ClassA().meth1();
    }

    void meth1() {

        System.out.println("sorting the data which is present in userdefined class");
        ArrayList<Employe> al = new ArrayList<Employe>();
        Employe e = new Employe("pankaj", 1, "java");
        Employe e1 = new Employe("chandan", 3, "python");
        Employe e2 = new Employe("prabhu", 5, "html");

        al.add(e2);
        al.add(e);
        al.add(e1);

        System.out.println("\nReterving the data using Iterator");
        Iterator<Employe> i = al.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println("\nReterving the data after sorting");


        Iterator<Employe> i1 = al.iterator();


    }
}
