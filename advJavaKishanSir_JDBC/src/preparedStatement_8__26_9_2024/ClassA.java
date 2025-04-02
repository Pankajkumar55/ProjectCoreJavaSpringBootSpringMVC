package preparedStatement_8__26_9_2024;

import java.sql.ResultSet;

public class ClassA {
    public static void main(String[] args) {
        ClassA aobj = new ClassA();
        aobj.meth1();

    }

    void meth1() {

        System.out.println("FORWARD ONLY : " + ResultSet.TYPE_FORWARD_ONLY); // 1003
        System.out.println("SCROLL_INTENSIVE : " + ResultSet.TYPE_SCROLL_INSENSITIVE); // 1004
        System.out.println("SCROLL_SENSITIVE : " + ResultSet.TYPE_SCROLL_SENSITIVE); // 1005

        System.out.println("=========================");

        System.out.println("CONCUR_ONLY : " + ResultSet.CONCUR_READ_ONLY); // 1007
        System.out.println("CONCUR_UPDATE : " + ResultSet.CONCUR_UPDATABLE); // 1008

    }
}
