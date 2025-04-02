package jdbc_ReteriveData_2__19_9_2024;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ClassA {

    public static void main(String[] args) {
        new ClassA().meth1();
        System.out.println("main() called");
    }

    void meth1() {
        String driver = "oracle.jdbc.OracleDriver";
        String DBurl = "jdbc:oracle:thin:@localhost:1521:orcl";
        String DBUname = "mydb4pm";
        String DBUpwd = "TIGER";
        String query = " select * from employee";
        System.out.println("Connecting our Java program to Database");
        try {

            Class.forName(driver); // Loading the driver
            Connection con = DriverManager.getConnection(DBurl, DBUname, DBUpwd);
            System.out.println("Database successfully Connected!!!\n");
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(query);

            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4)
                        + " " + rs.getString(5));
            }

            con.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();

        }
    }
}
