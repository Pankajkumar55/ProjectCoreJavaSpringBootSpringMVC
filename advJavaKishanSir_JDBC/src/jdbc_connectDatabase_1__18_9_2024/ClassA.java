package jdbc_connectDatabase_1__18_9_2024;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ClassA {

    public static void main(String[] args) {
        new ClassA().meth1();
        System.out.println("main() called");
    }

    void meth1() {
        String driver = "oracle.jdbc.driver.OracleDriver";
        String DBurl = "jdbc:oracle:thin:@localhost:1521:orcl";
        String DBUname = "system";
        String DBUpwd = "pankaj";

        System.out.println("Connecting our Java program to Database");
        try {


            // Class.forName(driver); // Loading the driver
            Connection con = DriverManager.getConnection(DBurl, DBUname, DBUpwd);
            System.out.println("Database successfully Connected!!!");
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
}
