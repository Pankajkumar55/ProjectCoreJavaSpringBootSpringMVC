package hashSet_7__13_9_2024;

import java.util.TreeSet;

public class ClassA {
    public static void main(String[] args) {
        ClassA aobj = new ClassA();
        aobj.meth1();
    }

    void meth1() {
        System.out.println("implementing set Interface");
        TreeSet<Object> set = new TreeSet<Object>();
        set.add(10);
        set.add(10);
        set.add(10);
        set.add(50);
        System.out.println(set);
        //set.add(null);
    }
}
