package connectDatabaseWithType4Driver_1;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDatabase {
    public static void main(String[] args) {
        System.out.println("ConnectDatabase.main()");
        new ConnectDatabase().meth1();
    }

    void meth1() {
        System.out.println("ConnectDatabase.meth1()");
        try {

            System.out.println("loding driver");
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("driver loaded sucesfully");
            System.out.println("creating connection");
            DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "c##pankaj", "pankaj");
            System.out.println("connection sucesfully");

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }
}
