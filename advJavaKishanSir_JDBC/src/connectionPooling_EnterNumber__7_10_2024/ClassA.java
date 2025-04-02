package connectionPooling_EnterNumber__7_10_2024;

import java.sql.Connection;

public class ClassA {

    String DBurl = "jdbc:oracle:thin:@localhost:1521:orcl";
    String DBuserName = "mydb4pm";
    String DBpassword = "tiger";

    ConnectionPooling cp = new ConnectionPooling(DBurl, DBuserName, DBpassword);

    public static void main(String[] args) {
        new ClassA().meth1();
    }

    void meth1() {
        System.out.println("Callinlg con_Initialization() "); // 5
        cp.con_Initialization();
        System.out.println("\nSize of Vector " + cp.v.size());

        System.out.println("\n*****User 1*****");
        Connection con1 = cp.con_Acquisition();
        System.out.println("Size of Vector " + cp.v.size());

        System.out.println("\n*****User 2*****");
        Connection con2 = cp.con_Acquisition();
        System.out.println("Size of Vector " + cp.v.size());

        System.out.println("\n*****User 3*****");
        Connection con3 = cp.con_Acquisition();
        System.out.println("Size of Vector " + cp.v.size());

        cp.con_Return(con1);
        cp.con_Return(con2);
        cp.con_Return(con3);

        System.out.println("After returning Size of Vector : " + cp.v.size());

    }
}
