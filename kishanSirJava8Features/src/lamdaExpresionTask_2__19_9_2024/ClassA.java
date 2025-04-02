package lamdaExpresionTask_2__19_9_2024;

import java.util.ArrayList;

public class ClassA {
    public static void main(String[] args) {
        new ClassA().meth1();
    }

    void meth1() {

        InterfaceA ia = (int a, ArrayList<Object> al) -> System.out.println("Add : " + a + al);
        ArrayList<Object> al = new ArrayList<Object>();
        al.add(20);

        ia.meth1(10, al);

    }

}