package connectionClassMethod_14__4_10_2024;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Savepoint;

public class ClassA {
    String driver = "oracle.jdbc.OracleDriver";

    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.meth1();
    }

    void meth1() {
        System.out.println("Connection class all method which is used to transaction management");
        try {
            Class.forName(driver);
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "mydb4pm", "tiger");
            System.out.println("Database connected successfully !!! \n");
            System.out.println("getAutoCommit() : " + con.getAutoCommit());  // by default it is true
            con.setAutoCommit(false);
            System.out.println("getAutoCommit() : " + con.getAutoCommit());

            Savepoint sp = con.setSavepoint();
            con.releaseSavepoint(sp);
            con.close();

        } catch (SQLException | ClassNotFoundException e) {

            e.printStackTrace();
        }
    }

}
