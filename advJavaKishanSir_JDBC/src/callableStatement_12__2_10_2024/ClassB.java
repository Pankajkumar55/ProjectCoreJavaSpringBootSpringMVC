package callableStatement_12__2_10_2024;

import java.sql.Connection;

public class ClassB {
    public static void main(String[] args) {
        ClassB bobj = new ClassB();
        bobj.meth1();

        int a = 10, b = 5;
        System.out.println(a++ + b);
        System.out.println(a++ + ++b);

    }

    void meth1() {
        System.out.println("Implementing callable statement");

        try {
            Class.forName("");

        } catch (ClassNotFoundException e) {

        }
    }
}
