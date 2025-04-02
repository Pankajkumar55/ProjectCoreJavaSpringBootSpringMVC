package CallableStatement_11__1_10_2024;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.util.Scanner;

public class ClassA {
    public static void main(String[] args) {
        ClassA aobj = new ClassA();
        aobj.meth1();
    }

    void meth1() {
        System.out.println("Implementing Callable Statement");
        Scanner sc = new Scanner(System.in);
        String driver = "oracle.jdbc.OracleDriver";
        String dbUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
        String dbUsername = "mydb4pm";
        String dbPassword = "tiger";

        try {

            Class.forName(driver);
            Connection con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
            System.out.println("Database Connected Succesfully");
            CallableStatement cstm = con.prepareCall("{call InsertEmpData (?,?,?,?,?)}");

            System.out.println("Enter empId");
            String id = sc.nextLine();

            System.out.println("Enter empName");
            String name = sc.nextLine();

            System.out.println("Enter empDesg");
            String desg = sc.nextLine();

            System.out.println("Enter Basic sal");
            int bSal = Integer.parseInt(sc.nextLine());
            float tsal = bSal + (0.35f * bSal) + (0.15f * bSal);
            cstm.setString(1, id);
            cstm.setString(2, name);
            cstm.setString(3, desg);
            cstm.setInt(4, bSal);
            cstm.setFloat(5, tsal);

            cstm.execute();

            System.out.println("Data Inserted");

        } catch (ClassNotFoundException | SQLException e) {

            e.printStackTrace();
        }

    }
}
