package implementingFunctionOnCallableStatement_13__3_10_2024;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ClassA {
    String dbUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
    String dbUsername = "myd4pm";
    String dbPass = "tiger";

    public static void main(String[] args) {
        new ClassA().meth1();
    }

    void meth1() {
        System.out.println("Implementing Function on Callable Statement\n");

        try {
            Connection con = DriverManager.getConnection(dbUrl, dbUsername, dbPass);
            System.out.println("Database Connected Succesfully");

            CallableStatement cs = con.prepareCall("{ call ? :=RetriveTsal(?)}");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}


