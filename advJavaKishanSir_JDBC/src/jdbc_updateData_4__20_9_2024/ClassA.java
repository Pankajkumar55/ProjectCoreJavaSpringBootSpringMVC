package jdbc_updateData_4__20_9_2024;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;

public class ClassA {

    public static void main(String[] args) {
        new ClassA().meth1();
    }

    void meth1() {

        String driver = "oracle.jdbc.OracleDriver";
        String DBurl = "jdbc:oracle:thin:@localhost:1521:orcl";
        String DBUname = "mydb4pm";
        String DBUpwd = "TIGER";
        // String query = ;
        System.out.println("Connecting our Java program to Database");
        try {

            Class.forName(driver); // Loading the driver
            Connection con = DriverManager.getConnection(DBurl, DBUname, DBUpwd);
            System.out.println("Database successfully Connected!!!\n");
            Statement stm = con.createStatement();
            int rowCount = stm.executeUpdate("insert into  employee values('109','john','kumar',10000,'java')");

            if (rowCount == 1)
                System.out.println(rowCount + " Query Updated");
            else
                System.out.println("No Query updated");

            con.close();

        } catch (SQLIntegrityConstraintViolationException e) {
            System.out.println("Duplicate data entery");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();

        }
    }
}
