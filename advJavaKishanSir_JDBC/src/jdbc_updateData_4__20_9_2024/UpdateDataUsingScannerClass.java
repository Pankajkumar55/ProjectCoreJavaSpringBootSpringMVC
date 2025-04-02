package jdbc_updateData_4__20_9_2024;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateDataUsingScannerClass {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new UpdateDataUsingScannerClass().meth1();
    }

    void meth1() {

        try {
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "mydb4pm", "TIGER");
            Statement stm = con.createStatement();

            System.out.println("Enter your id : ");
            String id = sc.next();
            System.out.println("Enter your first name : ");
            String fName = sc.next();
            System.out.println("Enter your last name : ");
            String lName = sc.next();
            System.out.println("Enter your sallary : ");
            int sal = sc.nextInt();
            System.out.println("Enter your address : ");
            String add = sc.next();

            int rowCount = stm.executeUpdate("insert into employee values('" + id + "','" + fName + "','" + lName
                    + "','" + sal + "','" + add + "')");

            if (rowCount == 1)
                System.out.println(rowCount + " Query Updated");
            else
                System.out.println("Query Not Updated");

        } catch (SQLIntegrityConstraintViolationException e) {
            System.out.println("Duplicate data entery ");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
