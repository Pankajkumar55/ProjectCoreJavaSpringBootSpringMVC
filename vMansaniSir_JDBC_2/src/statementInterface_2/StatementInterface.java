package statementInterface_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

// statement used to execute static SQL query
public class StatementInterface {
    static Statement stm;

    static void createConnetion() {

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection co = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "c##pankaj", "pankaj");
            Statement st = co.createStatement();
            stm = st;

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        StatementInterface stm = new StatementInterface();
        StatementInterface.createConnetion();
//		stm.createTable();
//		stm.insertDataIntoTable();
        stm.fetchingData();
    }

    void createTable() {
        try {

            stm.execute("create table student(name varchar2(10), id number(4),primary key(id)) ");
            System.out.println("table created succesfully");
        } catch (SQLException e) {

            e.printStackTrace();
        }

    }

    void insertDataIntoTable() {
        try {
            int count = stm.executeUpdate("insert into student values ('chandan','2')");
            System.out.println(count + " Data inserted succesfully");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    void fetchingData() {
        try {

            ResultSet rs = stm.executeQuery("select * from student");
            ResultSetMetaData rsm = rs.getMetaData();
            for (int i = 1; i <= rsm.getColumnCount(); i++) {
                System.out.print(rsm.getColumnName(i) + "\t");

            }
            while (rs.next()) {
                System.out.print("\n" + rs.getString(1) + " " + rs.getInt(2));

            }
        } catch (SQLException e) {

            e.printStackTrace();
        }
    }
}
