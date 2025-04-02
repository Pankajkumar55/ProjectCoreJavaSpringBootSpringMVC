package preaparedStatementInterface_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

// it is used to execute dynamic (runtime) SQL query
public class PStatement {

    static Connection con;

    static void createConnetion() {

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection co = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "c##pankaj", "pankaj");
            System.out.println("Database connected succesfully");
            con = co;

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        PStatement ps = new PStatement();
        PStatement.createConnetion();
//		ps.insertData();
//		ps.fetchData();

    }

    void insertData() {
        try {

            PreparedStatement pstm = con.prepareStatement("insert into student values(?,?)");
            pstm.setString(1, "pk");
            pstm.setInt(2, 3);
            int count = pstm.executeUpdate();
            System.out.println(count + " row inserted");

        } catch (SQLException e) {

            System.out.println(e);
        }
    }

    void fetchData() {
        try {
            PreparedStatement pstm = con.prepareStatement("select * from student where id = ? ");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter student id : ");
            int id = sc.nextInt();
            pstm.setInt(1, id);

            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getInt(2));
            } else {
                System.out.println("You are eneter a invalid id");

            }

        } catch (SQLException e) {

            System.out.println(e);
        }
    }
}
