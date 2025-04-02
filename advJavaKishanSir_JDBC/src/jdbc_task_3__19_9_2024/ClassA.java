package jdbc_task_3__19_9_2024;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.TreeSet;


public class ClassA {
    public static void main(String[] args) {
        new ClassA().meth1();
    }

    // Task : reverse the data
    void meth1() {
        String driver = "oracle.jdbc.OracleDriver";
        String DBurl = "jdbc:oracle:thin:@localhost:1521:orcl";
        String DBUname = "mydb4pm";
        String DBUpwd = "TIGER";
        String query = " select * from employee";
        System.out.println("Connecting our Java program to Database");
        try {

            Class.forName(driver); // Loding the driver
            Connection con = DriverManager.getConnection(DBurl, DBUname, DBUpwd);
            System.out.println("Database successfully Connected!!!\n");
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(query);

            TreeSet<String> ts = new TreeSet<>();

            while (rs.next()) {
                System.out.print(rs.getInt(4) + " ");
            }


            con.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();

        }
    }
}
